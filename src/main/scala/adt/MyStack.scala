package adt
//require all operations be O(1)

trait MyStack[A] {
  def push(o: A): Unit

  def pop(): A

  def isEmpty: Boolean

  def peek(): A

}
