package com.zy.highfunction

object BiBao {
  def mulBy(factor:Double) = (x:Double) => factor * x
  def main(args: Array[String]): Unit = {
    val triple = mulBy(3)
    println(triple(14))
  }
}
