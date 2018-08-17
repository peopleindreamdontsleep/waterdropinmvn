package io.github.interestinglab.waterdrop.input

import scala.collection.JavaConversions._
import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseInput
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.DStream

class Socket(var config: Config) extends BaseInput(config) {

  override def checkConfig(): (Boolean, String) = (true, "")

  override def prepare(spark: SparkSession, ssc: StreamingContext): Unit = {
    super.prepare(spark, ssc)

    val defaultConfig = ConfigFactory.parseMap(
      Map(
        "host" -> "172.18.250.103",
        "port" -> 9999
      ))
    config = config.withFallback(defaultConfig)
  }

  override def getDStream(ssc: StreamingContext): DStream[(String, String)] = {

    ssc
      .socketTextStream(config.getString("host"), config.getInt("port"))
      .map(s => {
        ("", s)
      })
  }
}
