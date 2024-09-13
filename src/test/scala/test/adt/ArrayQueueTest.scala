package test.adt

import adt.ArrayQueue
import org.scalatest.funsuite.AnyFunSuite

class ArrayQueueTest extends AnyFunSuite {
  test("emptyOnCreate") {
    val queue = new ArrayQueue[Int]
    assert(queue.isEmpty === true)
  }

  test("nonEmptyAfterEnqueue") {
    val queue = new ArrayQueue[Int]
    queue.enqueue(1)
    assert(queue.isEmpty === false)
  }

  test("enqueueDequeue3") {
    val queue = new ArrayQueue[Int]
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    assert(queue.dequeue() === 1)
    assert(queue.dequeue() === 2)
    assert(queue.dequeue() === 3)
    assert(queue.isEmpty === true)
  }

  test("sizeOfQueue") {
    val nums = Array.fill(100)(10)
    val queue = new ArrayQueue[Int]
    nums.foreach(queue.enqueue)
    for (n <- nums) {
      assert(queue.dequeue() === n)
    }
  }
}
