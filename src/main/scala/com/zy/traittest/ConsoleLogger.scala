package com.zy.traittest

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 继承Logger trait，多个trait时，用with关键字。
  */
class ConsoleLogger extends Logger with Serializable with Cloneable {
  override def log(msg: String): Unit = {}

}
