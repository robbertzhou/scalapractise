package com.zy.implicitconvertparam

/**
  *
  * Author Mr. Guo
  * Create 2019/4/20 - 17:40
  */
object StringImprovments {

  implicit class StringImprove(s: String) {
    def increment = s.toString.map(c => (c + 1).toChar)
  }

  implicit class Intc(i: Int) {
    def xx = {
      Integer.parseInt(i.toString) + 4
    }
  }

  implicit class arrStrToArrInt(arr: Array[String]) {
    def toArrInt = {
      arr.map(arr => arr.toInt)
    }
  }

  implicit class arrStrToArrDouble(arr: Array[String]) {
    def toArrDouble: Array[Double] = {
      arr.map(ar => {
        try {
          ar.toDouble
        } catch {
          case x: Exception => 0.0
        }
      })
    }
  }
}
