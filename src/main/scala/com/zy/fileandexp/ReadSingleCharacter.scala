package com.zy.fileandexp

import scala.io.Source

/**
  * @create 2020-01-17
  * @author zhouyu
  * @desc 读取单个字符
  */
object ReadSingleCharacter {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:\\sourcecode\\test\\scalapractise\\target\\classes\\myfile.txt")
    for(c <- source){
      println(c)
    }
  }
}
