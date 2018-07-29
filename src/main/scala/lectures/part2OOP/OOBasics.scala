package lectures.part2OOP

object OOBasics extends App {
  println("starting app...")
  var steve = new Person("Steve", 22)
  steve.greet("bob")
}

class Person(name: String, val age: Int) {
  // body
  println("im alive...")

  //methods
  def greet(name: String) = println(s"hello $name, my name is ${this.name}")

  def greet(): Unit = println(s"hello, my name is $name")
}
