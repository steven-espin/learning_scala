package lectures.part1basics

object DefaultArgs extends App {

  def fact(t: Int, accumulator: Int = 1): Int =
    if (t == 1) return accumulator else fact(t -1, accumulator * t)
  println(fact(4))
}
