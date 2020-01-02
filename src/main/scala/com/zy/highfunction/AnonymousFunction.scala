package com.zy.highfunction

/**
 * 不需要为每一个函数命名
 * (x:Double) => 3 * x
 */
object AnonymousFunction {
  def triple(x: Double) =  {
    3 * x
  }
  def main(args: Array[String]): Unit = {
    val af = (x:Double) => 3 * x
    Array(3,4,5).map(x => 3 * x)

    println(af(5))
  }
}
