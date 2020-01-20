package com.zy.implicitconvertparam



/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 隐式转换测试，implicit关键字声明的带有单个参数的函数
  */
object Conversion {


  def main(args: Array[String]): Unit = {
    import FractionConversions.int2String
    def g(arg:String) = println(":\t" + arg)
    g(222)
  }



}

class Conversion {
  def Fraction(i: Int, i1: Int): Float = {
    i1 / (i * 1.0f)
  }

  implicit def int2Fraction(n: Int) = Fraction(n, 1)
}
