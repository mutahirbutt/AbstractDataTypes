package adt

//5 2 0 0 0
//    ^

class ArrayStack[A: Manifest] extends MyStack[A] {
  private var data = new Array[A](10)
  private var top = 0

  def push(o: A): Unit = {
    if (top >= data.length) {
      val tmp = new Array[A](data.length * 2)
      for (i <- data.indices) {
        tmp(i) = data(i)
      }
      data = tmp

    }
    data(top) = o
    top += 1
  }

  def pop(): A = {
    top = top - 1
    data(top)

  }

  def isEmpty: Boolean = top == 0

  def peek(): A = data(top-1)

}
