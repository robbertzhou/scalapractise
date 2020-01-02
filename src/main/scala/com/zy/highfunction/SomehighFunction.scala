package com.zy.highfunction

object SomehighFunction {
  def main(args: Array[String]): Unit = {
    //print
//    (1 to 9).map("*" * _).foreach(println _)
    //filter
    (1 to 9 ).filter(_ % 2 ==0).foreach(println)
  }
}
