package io.github.interestinglab.waterdrop.filter

import scala.collection.JavaConversions._
import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseFilter
import io.github.interestinglab.waterdrop.core.RowConstant
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.sql.functions._

class Json(var conf: Config) extends BaseFilter(conf) {

  def this() = {
    this(ConfigFactory.empty())
  }

  override def checkConfig(): (Boolean, String) = {
    conf.hasPath("source_field") match {
      case true => (true, "")
      case false => (false, "please specify [source_field] as a non-empty string")
    }
  }

  override def prepare(spark: SparkSession, ssc: StreamingContext): Unit = {
    super.prepare(spark, ssc)

    val defaultConfig = ConfigFactory.parseMap(
      Map(
        "source_field" -> "raw_message",
        "target_field" -> RowConstant.ROOT
      )
    )
    conf = conf.withFallback(defaultConfig)
  }

  override def process(spark: SparkSession, df: DataFrame): DataFrame = {
    val srcField = conf.getString("source_field")

    import spark.implicits._

    conf.getString("target_field") match {
      case RowConstant.ROOT => {

        val stringDataSet = df.select(srcField).as[String]

        val newDF = srcField match {
          case "raw_message" => spark.read.json(stringDataSet)
          case s: String => {
            val schema = spark.read.json(stringDataSet).schema
            var tmpDf = df.withColumn(RowConstant.TMP, from_json(col(s), schema))
            schema.map { field =>
              tmpDf = tmpDf.withColumn(field.name, col(RowConstant.TMP)(field.name))
            }
            tmpDf.drop(RowConstant.TMP)
          }
        }

        newDF
      }
      case targetField: String => {
        val stringDataSet = df.select(srcField).as[String]
        val schema = spark.read.json(stringDataSet).schema
        df.withColumn(targetField, from_json(col(srcField), schema))
      }
    }
  }
}
