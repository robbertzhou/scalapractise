package com.zy.scalaobj

/**
  * @create 2020-01-16
  * @author zhouyu
  * desc:练习一个account的伴生对象
  */
class Account {
//instance method
  def test(): Unit ={
    println("实例方法")
  }
}

object Account{
  def main(args: Array[String]): Unit = {
    val acc = new Account
    acc.test()
    Account.sm()
  }

  //static method
  def sm(): Unit ={
    println("静态方法。")
  }
}
