package com.zy.scalaobj

import com.hostman.impatient.Employee

/**
  * //@create 2020-01-17
  * //@author zhouyu
  * desc:test employee package
  */
object TestEmp {
  def main(args: Array[String]): Unit = {
    val emp : Employee = new Employee
    emp.name = "jack"
    println(emp.name)
  }
}
