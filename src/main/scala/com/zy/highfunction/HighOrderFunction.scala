package com.zy.highfunction

import scala.math.ceil

/**
 * 高阶函数，
 * ceil _，这里的_将ceil方法转成函数，在scala中，无法操纵方法，只能操纵函数。
 * 可以调用函数或传递它。
 */
object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    val num = 3.14
    val fun = ceil _
    val result = fun(num)
    val arr = Array(3.14,1.42,2.0).map(fun)
    arr.foreach(println)
  }
}
