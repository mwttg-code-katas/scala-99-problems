package org.problems.p46

import org.problems.p46.TruthTable.{ and, or, table2 }
import org.scalatest.{ Matchers, WordSpec }

class TruthTableTest extends WordSpec with Matchers {
  "P41" should {
    "Print truth tables for logical expressions." in {
      val formula = (x: Boolean, y: Boolean) => and(x, or(x, y))
      table2(formula)
    }
  }
}
