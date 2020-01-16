package com.zy.scalaobj

abstract class UndoableAction(val desc:String) {
  def undo():Unit
  def redo():Unit
}
