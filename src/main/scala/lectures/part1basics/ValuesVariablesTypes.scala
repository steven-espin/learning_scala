package lectures.part1basics

import java.security.KeyStore.TrustedCertificateEntry

object ValuesVariablesTypes extends App {

  // vals are immutable; constants
  val x: Int = 42
  val aString: String = "hello"
  val aBoolean: Boolean = true
  val aShort: Short = 12345
  val aLong: Long = 12345678901L
  val aDouble: Double = 2.45
  val aFloat: Float = 2.45f

  // variables; mutable
  // functional programming deals more with val rather than vars. different style of thinking.
  var aVariable: Int = 4
  aVariable = 5 // side effects. changing variables in program
}
