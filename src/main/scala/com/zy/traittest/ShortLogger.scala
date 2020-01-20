package com.zy.traittest

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 截断日志消息.
  */
trait ShortLogger extends RealizeTrait {
  val maxLength = 15
  override def log(msg: String): Unit = {
    super.log(
      if(msg.length <= maxLength) msg else msg.substring(0,maxLength - 3) + "..."
    )
  }
}
