package com.zy.implicitconvertparam

object ImplicitClassDemo {

  implicit class MyImplicitTypeConversion(val str: String) {
    def strToInt = str.toInt

  }

  def main(args: Array[String]): Unit = {
    val rs = "33"
  }
}

