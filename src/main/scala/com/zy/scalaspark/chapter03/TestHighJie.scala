package com.zy.scalaspark.chapter03

/**
 * create 2021-06-13
 * author zhouyu
 * desc 高阶函数(1.函数作为参数传递  2.函数的返回结果可以是函数的类型)
 */
object TestHighJie {
  def main(args: Array[String]): Unit = {
    //first
    println(testHOF(paramFunc,33))
    //two
    applyFuncOnRange(1,5,quarterMake)
    applyFuncOnRange(1,5,addTwo)
    //three
    println("transfer money:" +transferMoney(100,bankFee))
  }
  //函数作为参数
  def testHOF(func:Int=>String,value:Int) = func(value)
  def paramFunc(x:Int) = "[" + x + "]"

  //test two
  def quarterMake(x:Int) = x.toDouble / 4
  def addTwo(x:Int) = x + 2
  def applyFuncOnRange(begin:Int,end:Int,func : Int => AnyVal): Unit ={
    for(i <- begin to end){
      println(func(i))
    }
  }

  def transferMoney(money:Double,bankFee:Double => Double): Double= {
    money + bankFee(money)
  }

  def bankFee(money:Double) = money * 0.05

}
