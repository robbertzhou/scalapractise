package com.zy.implicitconvertparam

/**
  * @create 2020-01-23
  * @author zhouyu
  * @desc 函数或方法可以带一个implicit参数列表.
  * 有很多种方法导入隐式参数对象。
  */
object ImplicitParam {
  def main(args: Array[String]): Unit = {
    val imp = new ImplicitList
    import imp._
    val result = quote("Bonjor mode ")
    println(result)
    println(smaller(4,3))
  }


  /**
    * 这个方法有一个implicit修饰的参数，可以隐式导入。
    * @param what
    * @param delimiter
    * @return
    */
  def quote(what:String)(implicit delimiter: Delimiter): String ={
     delimiter.left + what + delimiter.right
  }

  def smaller[T](a:T,b:T)(implicit order:T => Ordered[T]):String={
    if(a<b){
      "smaller"
    }
    else{
      "Hello,world."
    }
  }

}

case class Delimiter (left :String , right : String)
