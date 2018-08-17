package io.github.interestinglab.waterdrop.filter

import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseFilter
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.lit

class Add(var conf: Config) extends BaseFilter(conf) {

  def this() = {
    this(ConfigFactory.empty())
  }

  override def checkConfig(): (Boolean, String) = {
    conf.hasPath("target_field") && conf.hasPath("value") match {
      case true => (true, "")
      case false => (false, "please specify [target_field], [value]")
    }
  }
//添加一个 字段
  override def process(spark: SparkSession, df: DataFrame): DataFrame = {
    df.withColumn(conf.getString("target_field"), lit(conf.getString("value")))
  }
}
