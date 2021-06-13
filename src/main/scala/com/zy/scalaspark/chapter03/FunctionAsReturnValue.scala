package com.zy.scalaspark.chapter03

/**
 * create 2021-06-13
 * author zhouyu
 * desc 以函数作为返回值得高阶函数
 */
object FunctionAsReturnValue {
  def main(args: Array[String]): Unit = {
    val returnedFunc = transferMoney(300)
    println(returnedFunc(1500))
  }

  def transferMoney(money:Double) = {
    if(money > 1000){
      (money : Double) => "dayu 1000:" + money * 0.05
    }else {
      (money:Double) => "xiaoyu 1000:" + money * 0.1
    }
  }
}
