package com.zy.scalaobj

object DoNothingAction  extends UndoableAction("Do Nothing") {

  def main(args: Array[String]): Unit = {
    val actions = Map("Open" -> DoNothingAction.redo(),"save"->DoNothingAction.undo())
    actions.foreach(f => f)
  }
  override def undo(): Unit = {
    println("undo")
  }

  override def redo(): Unit = {
    println("redo")
  }
}
