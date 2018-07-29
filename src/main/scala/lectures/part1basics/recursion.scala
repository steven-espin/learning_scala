package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {
  // call stack used when using recursion
  // stack overflow issue when calling big numbers recursively
  def factorialFunction(x: Int): Int = {
    if (x == 1) 1
    else {
      println("calculating factorial of " + x + ", but need to first calculate " + (x - 1))
      val res = x * factorialFunction(x - 1)
      println("calculated " + x)
      res
    }
  }
  println(factorialFunction(3))
  //println(factorialFunction(5000)) stack overflow!
  // how can we write smart code that doesn't overflow stack? ANSWER = tail recursion

  def anotherFactorialFunction(x: Int): BigInt = {
    @tailrec // compiler will throw error if not tail recursion
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as last expression
    }
    factorialHelper(x,1) // last expression is recursive
  }
  println(anotherFactorialFunction(3))
  println(anotherFactorialFunction(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  // 1. concatenate a string n times
  @tailrec
  def concatTailRecursive(s: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatTailRecursive(s, n - 1, s + accumulator)

  println(concatTailRecursive("hello", 3, ""))

  // 2. check if a number n is prime

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0)
    }
    isPrimeTailRec(n / 2, true)
  }
  println(isPrime(23))

  // 3. compute the fibonacci number
  def fib(x: Int): Int = {
    def fibTailRec(t: Int, fib_n1: Int, fib_n2: Int): Int =
      if (x == 1 || x == 2) 1
      else if (t == x) fib_n1 + fib_n2
      else fibTailRec(t + 1, fib_n1 + fib_n2,fib_n1)

    fibTailRec(3, 1, 1)
  }
  println(fib(2))
}
