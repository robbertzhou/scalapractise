package com.zy.implicitconvertparam


object App  {
  implicit def int2Integer(x:Int) = java.lang.Integer.valueOf(x)
  def main(args: Array[String]): Unit = {
    //隐式值
    implicit val str = "Scala"
    def fun(implicit arg:String) = println("Hello:\t" + arg)
    fun("jack")
    fun
    //隐式视图
    def g(arg:String) = println("hello:\t" + arg)
    implicit def int2String(arg:Int):String = arg.toString + "kkk"
    g(100)

  }
}
