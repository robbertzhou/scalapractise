package com.zy.fileandexp

import scala.io.Source

/**
  * @create 2020-01-17
  * @author zhouyu
  * @desc : read file line,getLines() read all lines
  * 整个文件读取一个字符串，用mkString
  */
object ReadLine {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:\\sourcecode\\test\\scalapractise\\target\\classes\\myfile.txt")
    val lineIterator = source.getLines()
    for (l <- lineIterator){
      println(l)
    }
    //没有数据了，被iterator弄了
    println(source.mkString)
  }
}
