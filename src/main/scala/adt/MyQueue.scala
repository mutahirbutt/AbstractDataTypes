package adt

trait MyQueue[A] {
  def enqueue(o: A): Unit

  def dequeue(): A

  def isEmpty: Boolean

  def peek(): A

}
