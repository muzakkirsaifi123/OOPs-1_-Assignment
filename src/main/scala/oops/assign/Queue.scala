package oops.assign

import scala.collection.mutable.ListBuffer

trait Queue {

  def enqueue(elementToBePushed: Int): Unit

  def dequeue(queue: ListBuffer[Int]): Int = {

    val removedElement = queue.head
    queue.remove(0)
    removedElement
  }

}
