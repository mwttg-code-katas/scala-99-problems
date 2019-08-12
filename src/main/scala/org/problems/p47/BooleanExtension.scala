package org.problems.p47

object BooleanExtension {
  implicit class BooleanTruthTable(value: Boolean) {
    def not: Boolean = value match {
      case true => false
      case false => true
    }

    def and(other: Boolean): Boolean = (value, other) match {
      case (true, true) => true
      case (_, _) => false
    }

    def or(other: Boolean): Boolean = (value, other) match {
      case (false, false) => false
      case (_, _) => true
    }
  }

  implicit def intToBool(x: Int): Boolean = if (x == 0) false else true

  def table(formula: (Boolean, Boolean) => Boolean): Unit = {
    println("X     \t Y     \t  Result")
    for (x <- 1 to 0 by -1) {
      for (y <- 1 to 0 by -1) {
        println(f"${x: Boolean} \t ${y: Boolean} \t  ${formula(x: Boolean, y: Boolean)}")
      }
    }
  }
}
