package test.adt

import adt.ArrayStack
import org.scalatest.funsuite.AnyFunSuite

class ArrayStackTest extends AnyFunSuite {
  test("emptyOnCreate") {
    val stack = new ArrayStack[Int]
    assert(stack.isEmpty === true)
  }

  test("nonEmptyAfterPush") {
    val stack = new ArrayStack[Int]
    stack.push(1)
    assert(stack.isEmpty === false)
  }

  test("pushPop3") {
    val stack = new ArrayStack[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
    assert(stack.pop() === 3)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
    assert(stack.isEmpty === true)
  }

  test("sizeOfStack") {
    val nums = Array.fill(100)(10)
    val stack = new ArrayStack[Int]
    nums.foreach(stack.push)
    for (n <- nums.reverse) {
      assert(stack.pop() === n)
    }
  }

}
