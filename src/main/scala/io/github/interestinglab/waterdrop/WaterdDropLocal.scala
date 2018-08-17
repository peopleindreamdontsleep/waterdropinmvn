package io.github.interestinglab.waterdrop

import java.io.File

import io.github.interestinglab.waterdrop.apis.{BaseFilter, BaseInput, BaseOutput}
import io.github.interestinglab.waterdrop.config.{CommandLineArgs, CommandLineUtils, Common, ConfigBuilder}
import io.github.interestinglab.waterdrop.filter.UdfRegister
import io.github.interestinglab.waterdrop.utils.{CompressionUtils, StreamingExamples}
import org.apache.hadoop.fs.Path
import org.apache.spark.SparkConf
import org.apache.spark.internal.Logging
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.streaming._
import org.apache.log4j.{Level, Logger}

import scala.collection.JavaConversions._
import scala.util.{Failure, Success, Try}

object WaterdDropLocal extends Logging {
  def main(args: Array[String]) {
    entrypoint("E:\\wordspacesec\\waterdropinmvn\\config\\application.conf")
  }

  private def entrypoint(configFile: String): Unit = {

    val configBuilder = new ConfigBuilder(configFile)
    val sparkConfig = configBuilder.getSparkConfigs
    val inputs = configBuilder.createInputs
    val outputs = configBuilder.createOutputs
    val filters = configBuilder.createFilters

    var configValid = true
    val plugins = inputs ::: filters ::: outputs
    for (p <- plugins) {
      val (isValid, msg) = Try(p.checkConfig) match {
        case Success(info) => {
          val (ret, message) = info
          (ret, message)
        }
        case Failure(exception) => (false, exception.getMessage)
      }

      if (!isValid) {
        configValid = false
        printf("Plugin[%s] contains invalid config, error: %s\n", p.name, msg)
      }
    }

    if (!configValid) {
      System.exit(-1) // invalid configuration
    }

    println("[INFO] loading SparkConf: ")
    val sparkConf = createSparkConf(configBuilder).setMaster("local[2]").set("spark.testing.memory", "471859200")

    sparkConf.getAll.foreach(entry => {
      val (key, value) = entry
      println("\t" + key + " => " + value)
    })

    StreamingExamples.setStreamingLogLevels()
    val duration = sparkConfig.getLong("spark.streaming.batchDuration")
    val ssc = new StreamingContext(sparkConf, Seconds(duration))

    val sparkSession = SparkSession.builder.config(ssc.sparkContext.getConf).getOrCreate()

    process(sparkSession, ssc, inputs, filters, outputs)
  }

  private def process(
                       sparkSession: SparkSession,
                       ssc: StreamingContext,
                       inputs: List[BaseInput],
                       filters: List[BaseFilter],
                       outputs: List[BaseOutput]): Unit = {

    // find all user defined UDFs and register in application init
    UdfRegister.findAndRegisterUdfs(sparkSession)

    for (i <- inputs) {
      i.prepare(sparkSession, ssc)
    }

    for (o <- outputs) {
      o.prepare(sparkSession, ssc)
    }

    for (f <- filters) {
      f.prepare(sparkSession, ssc)
    }

    val dstreamList = inputs.map(p => {
      p.getDStream(ssc)
    })

    val unionedDStream = dstreamList.reduce((d1, d2) => {
      d1.union(d2)
    })

    val dStream = unionedDStream.mapPartitions { partitions =>
      val strIterator = partitions.map(r => r._2)
      val strList = strIterator.toList
      strList.iterator
    }

    dStream.foreachRDD { strRDD =>
      val rowsRDD = strRDD.mapPartitions { partitions =>
        val row = partitions.map(Row(_))
        val rows = row.toList
        rows.iterator
      }

      val spark = SparkSession.builder.config(rowsRDD.sparkContext.getConf).getOrCreate()

      val schema = StructType(Array(StructField("raw_message", StringType)))
      var df = spark.createDataFrame(rowsRDD, schema)

      for (f <- filters) {
        df = f.process(spark, df)
      }

      inputs.foreach(p => {
        p.beforeOutput
      })

      outputs.foreach(p => {
        p.process(df)
      })

      inputs.foreach(p => {
        p.afterOutput
      })

    }

    ssc.start()
    ssc.awaitTermination()
  }

  private def createSparkConf(configBuilder: ConfigBuilder): SparkConf = {
    val sparkConf = new SparkConf()

    configBuilder.getSparkConfigs
      .entrySet()
      .foreach(entry => {
        sparkConf.set(entry.getKey, String.valueOf(entry.getValue.unwrapped()))
      })

    sparkConf
  }
}
