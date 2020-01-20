package com.zy.traittest

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 继承特质顺序不一样结果不一样
  */
class SequenceRealize extends RealizeTrait {
  def withdraw(): Unit ={
    log("infficient...")
  }
}

object SequenceRealize{
  def main(args: Array[String]): Unit = {
    val acct1 = new SequenceRealize with TimestampLogger with ShortLogger
    acct1.withdraw()
    val acct2 = new SequenceRealize with ShortLogger with TimestampLogger
    acct2.withdraw()
  }
}
