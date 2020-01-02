package com.zy.highfunction

import scala.math._
/**
 * 带函数参数的函数
 */
object FunctionParam {
  def vaq(f:(Double) => Double) = f(55)
  def main(args: Array[String]): Unit = {
    val fun = (x:Double) => 3 * x
    val rf = vaq(fun)
    println(rf)
  }
}
