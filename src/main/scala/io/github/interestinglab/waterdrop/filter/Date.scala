package io.github.interestinglab.waterdrop.filter

import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseFilter
import io.github.interestinglab.waterdrop.core.RowConstant
import io.github.interestinglab.waterdrop.utils.{FormatParser, StringTemplate, UnixMSParser, UnixParser}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.streaming.StreamingContext

import scala.collection.JavaConversions._

class Date(var config: Config) extends BaseFilter(config) {

  def this() = {
    this(ConfigFactory.empty())
  }

  override def checkConfig(): (Boolean, String) = {
    config.hasPath("target_field") && config.hasPath("target_time_format") match {
      case true => (true, "")
      case false => (false, "please specify [target_field] and [target_time_format] as string")
    }
  }

  override def prepare(spark: SparkSession, ssc: StreamingContext): Unit = {
    super.prepare(spark, ssc)
    val defaultConfig = ConfigFactory.parseMap(
      Map(
        "source_field" -> RowConstant.ROOT,
        "target_field" -> "datetime",
        "source_time_format" -> "UNIX_MS",
        "target_time_format" -> "yyyy/MM/dd HH:mm:ss",
        "time_zone" -> "", // TODO
        "default_value" -> "${now}",
        "locale" -> "Locale.US" // TODO
      )
    )
    config = config.withFallback(defaultConfig)
  }

  override def process(spark: SparkSession, df: DataFrame): DataFrame = {

    val targetTimeFormat = config.getString("target_time_format")
    val targetField = config.getString("target_field")
    val defaultValue = config.getString("default_value")
    val dateParser = config.getString("source_time_format") match {
      case "UNIX" => new UnixParser(targetTimeFormat)
      case "UNIX_MS" => new UnixMSParser(targetTimeFormat)
      case sourceTimeFormat: String => new FormatParser(sourceTimeFormat, targetTimeFormat)
    }

    val func = udf((s: String) => {
      val (success, dateTime) = dateParser.parse(s)
      if (success) {
        dateTime
      } else {
        StringTemplate.substitute(defaultValue, targetTimeFormat)
      }
    })

    config.getString("source_field") match {
      case RowConstant.ROOT => df.withColumn(targetField, func(lit(System.currentTimeMillis().toString)))
      case srcField: String => df.withColumn(targetField, func(col(srcField)))
    }
  }
}
