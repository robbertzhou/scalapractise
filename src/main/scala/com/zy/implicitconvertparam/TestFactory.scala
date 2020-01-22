package com.zy.implicitconvertparam

import String2Factory._
/**
  * @create 2020-01-23
  * @author zhouyu
  * @desc
  */
object TestFactory {
  def main(args: Array[String]): Unit = {
    val fe = convert("jjj")
    println(fe.name)
  }
}
