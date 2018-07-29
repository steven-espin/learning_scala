package lectures.part1basics

import java.util.logging.Logger


object CBVvsCBN extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {  // x evaluated in real time when called
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int =  1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

  // doesn't cause stack overflow b/c infinite() is passed as expression by name
  // and expression is never called in this case
  printFirst(34, infinite())

  private val log: Logger = Logger.getLogger(CBVvsCBN.getClass.getName)


  log.info("hello there")
  //println(CBVvsCBN.getClass.getName)
  println("hellllllllllll")
}
