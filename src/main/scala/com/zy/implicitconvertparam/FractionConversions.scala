package com.zy.implicitconvertparam

object FractionConversions {
  implicit def int2String(n:Int) = "hello world."
}
