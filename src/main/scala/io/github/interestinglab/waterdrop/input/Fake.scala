package io.github.interestinglab.waterdrop.input

import java.security.SecureRandom
import java.util

import com.typesafe.config.{Config, ConfigFactory}
import io.github.interestinglab.waterdrop.apis.BaseInput
import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.DStream
import org.apache.spark.streaming.receiver.Receiver

import scala.collection.JavaConversions._
import scala.util.Random

class Fake(var config: Config) extends BaseInput(config) {

  override def checkConfig(): (Boolean, String) = {

    val validateNumOfFields = if (!config.hasPath("num_of_fields")) {
      true
    } else {
      config.getInt("num_of_fields") > 0
    }

    val validateRate = if (!config.hasPath("rate")) {
      true
    } else {
      config.getInt("rate") > 0
    }

    val validateJsonKeys = if (!config.hasPath("json_keys")) {
      true
    } else {
      config.getStringList("json_keys").size() > 0
    }

    val validateContentList = if (!config.hasPath("content")) {
      true
    } else if (config.hasPath("content") && config.getStringList("content").length > 0) {
      true
    } else {
      false
    }

    val errMsg = if (!validateNumOfFields) {
      "please make sure [num_of_fields] is of type Integer bigger than 0"
    } else if (!validateRate) {
      "please make sure [rate] is of type Integer bigger than 0"
    } else if (!validateJsonKeys) {
      "please make sure [json_keys] is of type string array"
    } else if (!validateContentList) {
      "please make sure [content] is of type string array"
    } else {
      ""
    }

    validateNumOfFields && validateRate match {
      case true => (true, "");
      case false => (false, errMsg)
    }
  }

  override def prepare(spark: SparkSession, ssc: StreamingContext): Unit = {
    super.prepare(spark, ssc)

    val defaultConfig = ConfigFactory.parseMap(
      Map(
        "data_format" -> "text", // allowed values: text | json
        "text_delimeter" -> ",", // only works when data_format = text
        "json_keys" -> util.Arrays
          .asList("k1", "k2", "k3", "k4", "k5", "k6", "k7", "k8", "k9", "k10"), // only works when data_format = json
        "num_of_fields" -> 10,
        "rate" -> 1 // rate per second, X records/sec
      ))
    config = config.withFallback(defaultConfig)
  }

  override def getDStream(ssc: StreamingContext): DStream[(String, String)] = {

    val receiverInputDStream = ssc.receiverStream(new FakeReceiver(config))
    receiverInputDStream.map(s => { ("", s) })
  }
}

private class FakeReceiver(config: Config) extends Receiver[String](StorageLevel.MEMORY_AND_DISK_2) {

  val secRandom = new SecureRandom()

  def generateData(): String = {

    // TODO: 支持 data_format = json

    config.hasPath("content") && config.getStringList("content").length > 0 match {
      case true => {
        val contentList = config.getStringList("content")
        val n = secRandom.nextInt(contentList.length)
        contentList.get(n)
      }
      case false => {
        val fromN = 1
        val toN = config.getInt("num_of_fields")
        (fromN to toN).map(i => "Random" + i + secRandom.nextInt()).mkString(config.getString("text_delimeter"))
      }
    }
  }

  def onStart() {
    // Start the thread that receives data over a connection

    new Thread("FakeReceiver Source") {
      override def run() { receive() }
    }.start()
  }

  def onStop() {
    // There is nothing much to do as the thread calling receive()
    // is designed to stop by itself isStopped() returns false
  }

  /** Create a socket connection and receive data until receiver is stopped */
  private def receive() {
    while (!isStopped()) {
      store(generateData())
      Thread.sleep((1000.toDouble / config.getInt("rate")).toInt)
    }
  }
}
