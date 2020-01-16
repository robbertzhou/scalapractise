package com.zy.scalaobj

/**
  * //@create 2020-01-16
  * //@author zhouyu
  * //desc:枚举类型，要继承Enumeration
  *
  */
object TrafficLightColor extends Enumeration {
  val Red = Value(0,"Stop")
  val Yellow = Value(10)
  val Green = Value("Go")

  def main(args: Array[String]): Unit = {

    println(TrafficLightColor.Yellow)
  }
}
