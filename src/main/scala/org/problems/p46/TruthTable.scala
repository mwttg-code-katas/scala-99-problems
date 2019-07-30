package org.problems.p46

object TruthTable {
  def and(x: Boolean, y: Boolean): Boolean  = x && y
  def or(x: Boolean, y: Boolean): Boolean   = x || y
  def not(x: Boolean): Boolean              = !x
  def nand(x: Boolean, y: Boolean): Boolean = not(and(x, y))
  def nor(x: Boolean, y: Boolean): Boolean  = not(or(x, y))
  def xor(x: Boolean, y: Boolean): Boolean  = and(or(x, y), or(not(x), not(y)))
  def impl(x: Boolean, y: Boolean): Boolean = or(not(x), y)

  implicit def intToBool(x: Int): Boolean = if (x == 0) false else true

  def table2(formula: (Boolean, Boolean) => Boolean): Unit = {
    println("X     \t Y     \t  Result")
    for (x <- 1 to 0 by -1) {
      for (y <- 1 to 0 by -1) {
        println(f"${x: Boolean} \t ${y: Boolean} \t  ${formula(x: Boolean, y: Boolean)}")
      }
    }
  }
}
