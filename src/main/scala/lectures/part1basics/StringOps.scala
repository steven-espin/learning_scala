package lectures.part1basics

object StringOps extends App{
  val str: String = "Hello, I am learning scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // scala specific: String Interpolators

  // s interpolators
  val name = "david"
  val age = 12
  val greeting = s"Hello, my name is $name and i am $age years old"

  // f interpolators
  val speed = 1.2f
  println(f"$name%s can eat $speed%2.2f burgers per minute")

  // raw interpolator
  println(raw"this is a \n new line")

}
