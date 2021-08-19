package oops.assign

import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.{break, breakable}

object MainObject {
  def main(args: Array[String]): Unit = {


    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("\nPlease Press the option according to your requirement")
        println("1 -> Insert the  number to make it  Double ")
        println("2 -> Insert the number to make it square ")
        println("3 -> To delete an element")
        println("4 -> Display the elements")
        println("5 -> To exit")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nPlease Enter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new DoubleQueue(queue)
            queueObj.enqueue(elementToBePushed)

          case 2 =>
            println("\nPlease Enter the Element to be Pushed")
            val elementToBePushed = sc.nextInt()
            val queueObj = new SquareQueue(queue)
            queueObj.enqueue(elementToBePushed)
          case 3 =>

            if (queue.isEmpty)
              println("\nEmpty oops.assign.Queue")
            else {
              val obj = new SquareQueue(queue)
              val poppedElement = obj.dequeue(queue)
              println("Deleted Element is : " + poppedElement)
            }
          case 4 =>
            if (queue.isEmpty)
              println("\nEmpty OOPS.assign.Queue")
            else {
              println("\noops.assign.Queue")
              for (loopVariable <- queue)
                print(loopVariable + " ")
              println()

            }
          case 5 =>
            println("Exiting")
            break
          case _ =>
            println("Wrong Choice. Please Enter again - We have only 5 Choices...")
        }
      }
    }
  }
}