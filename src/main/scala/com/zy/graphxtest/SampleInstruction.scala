package com.zy.graphxtest

/**
 * @author 简要介绍
 */
object SampleInstruction {
  def main(args: Array[String]): Unit = {

  }
}

case class Person(name:String){
  val friends = new scala.collection.mutable.ArrayBuffer[Person]()
  def numberOfFriends() = friends.length
  def isFriend(other:Person) = friends.find(_.name == other.name)

  def isConnectedWithin2Steps(other:Person) = {
    for {f <- friends} yield {
      f.name == other.name || f.isFriend(other).isDefined
    }
  }.find(_ ==true).isDefined

}