package io.github.interestinglab.waterdrop.filter

import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseFilter
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions.col

class Convert(var conf: Config) extends BaseFilter(conf) {

  def this() = {
    this(ConfigFactory.empty())
  }

  override def checkConfig(): (Boolean, String) = {
    if (!conf.hasPath("source_field")) {
      (false, "please specify [source_field] as a non-empty string")
    } else if (!conf.hasPath("new_type")) {
      (false, "please specify [new_type] as a non-empty string")
    } else {
      (true, "")
    }
  }

  override def prepare(spark: SparkSession, ssc: StreamingContext): Unit = {

    super.prepare(spark, ssc)
  }

  override def process(spark: SparkSession, df: DataFrame): DataFrame = {

    val srcField = conf.getString("source_field")
    val newType = conf.getString("new_type")

    newType match {
      case "string" => df.withColumn(srcField, col(srcField).cast(StringType))
      case "integer" => df.withColumn(srcField, col(srcField).cast(IntegerType))
      case "double" => df.withColumn(srcField, col(srcField).cast(DoubleType))
      case "float" => df.withColumn(srcField, col(srcField).cast(FloatType))
      case "long" => df.withColumn(srcField, col(srcField).cast(LongType))
      case "boolean" => df.withColumn(srcField, col(srcField).cast(BooleanType))
      case _: String => df
    }
  }
}
