package com.zy.traittest

/**
  * @create 2020-01-23
  * @author zhouyu
  * @desc 学习Ordered特质，序列化对象。
  * @param name
  * @param age
  * @param fv
  */
class Person(name:String,age:Int,fv:Int) extends Ordered[Person] with Serializable {
  override def compare(that: Person): Int = {
    if(this.age < that.age){
      -1
    }else if (this.age == that.age) {
      0
    }else{
      1
    }
  }
}
