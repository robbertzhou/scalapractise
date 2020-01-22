package com.zy.collectionpractise

import java.awt.Color
import scala.collection.mutable.Seq

/**
  * @create 2020-01-22
  * @author zhouyu
  * @desc 集合测试
  */
object WatchCollect {
  def main(args: Array[String]): Unit = {
    val seq = Seq(Color.BLACK,Color.GREEN)
    seq :+ Color.RED
    seq :+ Color.GREEN
    val it = seq.iterator
    while(it.hasNext){
      println(it.next())
    }


  }
}
