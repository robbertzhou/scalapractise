package com.zy.scalaspark.chapter03

import java.io.{File, FileNotFoundException, FileReader, IOException}

/**
 * create 2021-06-14
 * author zhouyu
 * desc trycatch练习
 */
object TryCatch {
  def main(args: Array[String]): Unit = {
    try{
      val f = new FileReader((new  File("data/t.txt")))
    }catch {
      case ex:FileNotFoundException=>println("File not found")
      case ex:IOException => println("Io exception")
    }finally {
      println("alaways is execut.")
    }
  }
}
