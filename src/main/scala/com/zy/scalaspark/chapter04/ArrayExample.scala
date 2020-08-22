package com.zy.scalaspark.chapter04

/**
 * create 2020-08-23
 * author zy
 * desc scala 数组练习
 * 1.生成array
 * 2.遍历 使用<-生成器
 * 3.range生成数组
 * 4.concat连接多个数组(使用import Array._)
 * 5.ofDim多维数组
 */
object ArrayExample{
  def main(args: Array[String]): Unit = {
    val numbers:Array[Int] = Array(1,2,3,4,5,1,2,3,4,5)
    println("print full array:")
    for(i <- numbers){
      print(" " + i)
    }
    //summing all the elements
    var total = 0
    for ( i <- numbers){
      total += i
    }
    println("total is:" + total)
    //concat
    val n1 = Array[Int](1,3)
    val n2 = Array[Int](2,4)
    import Array._
    val concated = concat(n1,n2)
    for (num <- concated){
      println(" " + num)
    }

    //multi-dimension array
    val myMatrix = ofDim[Int](3,3)
    //build matrix
    for(i<- 0 to 2){
      for (j <- 0 to 2){
        myMatrix(i)(j) = i* j
      }
    }
  }
}