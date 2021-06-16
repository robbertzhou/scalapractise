package com.zy.scalaspark.chapter04

/**
 * create 2021-06-16
 * author zhouyu
 * desc
 */
object ListExample {
  def main(args: Array[String]): Unit = {
    // list of cities,必须添加Nill  Nil是一个空的List，定义为List[Nothing]，根据List的定义List[+A]，所有Nil是所有List[T]的子类。
    val cities = "Dublin"::"London" :: "NY" :: Nil
    // list of even Event numbers
    val numbers = 2 :: 4 :: 6 :: 8 :: Nil
    // empty list
    val empty = Nil
    //Two dimensional list
    val dim = 1 :: 2 :: 3 ::Nil ::
    4 :: 5 :: 6 ::Nil

  }
}
