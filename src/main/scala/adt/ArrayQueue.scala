package adt

//   B
// 2 3 1 9 7
//     F
//         B
// 1 9 7 2 0 0 0 0
// F
class ArrayQueue[A: Manifest] extends MyQueue[A] {

  private var data = new Array[A](10)
  private var back = 0
  private var front = 0

  def enqueue(o: A): Unit = {
    if ((back+1)% data.length == front) {
      val tmp = new Array[A](data.length * 2)
      for (i <- 0 until data.length -1) tmp(i) = data((i + front)%data.length)
      front = 0
      back = data.length - 1
      data = tmp
    }
    data(back) = o
    back = (back + 1) % data.length
  }

  def dequeue(): A = {
    val ret = data(front)
    front = (front + 1) % data.length
    ret
  }

  def isEmpty: Boolean = front == back

  def peek(): A = data(front)

}
