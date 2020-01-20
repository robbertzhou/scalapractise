package com.zy.implicitconvertparam

object MyConversion {
  implicit def int2Fraction(n:Int)=  1.0f / n *1.0f

  implicit class StringImprove(s: String) {
    def increment = s.toString.map(c => (c + 1).toChar)
  }
}
