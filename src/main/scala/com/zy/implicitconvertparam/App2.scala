package com.zy.implicitconvertparam

class S1{
  def fun(str:String) = println(str)
}

class S2
object S2{
  implicit def s22S1(s2:S2 ):S1 = new S1()
}
object App2 {
  def main(args: Array[String]): Unit = {
    val s2 = new S2()
    s2.fun("Spark")
  }
}
