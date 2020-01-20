package com.zy.traittest

/***
  * @create 2020-01-20
  * @author zhouyu
  * @desc 把特质作为富接口使用
  */
trait RichLogger {
  def log(msg:String)
  def info(msg:String): Unit ={
    log("Info" + msg)
  }

  def warn(msg:String): Unit ={
    log("Warn:" + msg)
  }

  def error(msg:String): Unit ={
    log("Error:" + msg)
  }
}
