package com.zy.fileandexp

import java.io.{File, FileInputStream}

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 读取二进文件
  */
object BinaryReader {
  def main(args: Array[String]): Unit = {
    val file = new File("D:\\sourcecode\\test\\scalapractise\\target\\classes\\myfile.txt")
    val input = new FileInputStream(file)
    val bytes = new Array[Byte](file.length().toInt)
    input.read(bytes)
    println(new String(bytes))
  }
}
