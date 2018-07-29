package lectures.part1basics

object functions extends App {
  // define return type as best practice
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 3))

  // instead of while loop, use recursion
  // WHEN YOU NEED LOOPS, USE RECURSION
  def aRepeatedFunction(a: String, b: Int): String = {
    if (b == 1) a
    else a + aRepeatedFunction(a, b - 1)
  }
  println(aRepeatedFunction("hello", 3))

  // can define function within a function
  def aBigFunction(x: Int): Int = {
    def aSmallFunction(x: Int, y: Int): Int = x + y
    aSmallFunction(x, x - 1)
  }
  println(aBigFunction(5))

  def factorialFunction(x: Int): Int = {
    if (x == 1) 1
    else x * factorialFunction(x - 1)
  }
  println(factorialFunction(3))

  def fib(x: Int): Int = {
    if (x == 1 || x == 2) 1
    else fib(x - 1) + fib(x - 2)
  }
  println(fib(3))

  def prime(x: Int): Boolean = {
    def primeUpTo(t: Int): Boolean =
      if (t <= 1) true
      else x % t != 0 && primeUpTo(t - 1)
    primeUpTo(x / 2)
  }
  println(prime(7))
}
