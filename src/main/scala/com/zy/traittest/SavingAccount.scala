package com.zy.traittest

/**
  * @create 2020-01-20
  * @author zhouyu
  * @desc 实现
  */
class SavingAccount extends RealizeTrait {
    def withdraw(amount:Double): Unit ={
      log("sufficient funds")
    }
}

object SavingAccount{
  def main(args: Array[String]): Unit = {
    val sa = new SavingAccount()
    sa.withdraw(33)
  }
}
