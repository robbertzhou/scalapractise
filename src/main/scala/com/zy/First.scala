package com.zy

import scala.math._

object First{
  def main(args: Array[String]): Unit = {
    val num = 3.14
    val fun = ceil _
    val result = fun(num)
    val arr = Array(3.14,1.42,2.0).map(fun)
    arr.foreach(println)
  }
}
