package com.zy.implicitconvertparam


/**
  * @create 2020-01-23
  * @author zhouyu
  * @desc
  */
object String2Factory {
  implicit def convert(input:String):FactoryEntity= new FactoryEntity("Hello,Factory")
}

class FactoryEntity(nn:String){
  var name = nn
}
