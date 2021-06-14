package com.zy.scalaspark.chapter03

import java.net.URL

import scala.io.Source

/**
 * create 2021-6-14
 * author zhouyu
 * desc  either练习
 */
object EitherTest {
  def main(args: Array[String]): Unit = {
    val either1 = getData(new URL("http://www.xxx.com"))
    println(either1)
  }

  def getData(dataUrl:URL) :Either[String,Source] ={
    if(dataUrl.getHost.contains("xxx")){
      Left("requested Url is blocked")
    }else{
      Right(Source.fromURL(dataUrl))
    }
  }
}
