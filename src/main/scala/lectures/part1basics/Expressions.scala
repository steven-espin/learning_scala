package lectures.part1basics

object Expressions extends App {
  // Intructions (do) vs Expressions (value)

  // If expression; expression because it evaluates to a value
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  //allows this
  println(if (aCondition) 5 else 3)

  // loops are discouraged in scala. don't return anything and only execute side effects.
  // Never write this again. Loops are specific to imperative programming like java, python, or c.
  var i = 0
  while (i < 3) {
    println(i)
    i += 1
  }

  // Everything in Scala is an expression.
  // side effects are expressions that evaluate to Unit = null.
  // side effects: prints, whiles, and reassigning variables
  var aVariable = 0
  val aWeirdValue = (aVariable = 3) // Unit == void. side effects return unit and do something as side effect.
  println(aWeirdValue)

  // code blocks. act as functions but evaluates to last expression in block.
  val codeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println(codeBlock)

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 234 else 986
    42
  }

  println(someValue)
  println(someOtherValue)

}
