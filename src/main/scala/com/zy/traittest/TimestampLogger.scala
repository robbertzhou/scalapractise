package com.zy.traittest

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 为所有日志添加时间戳
  */
trait TimestampLogger extends RealizeTrait {
  override def log(msg: String): Unit = {
    super.log(new java.util.Date() + " " + msg)
  }
}
