package org.problems.p47

import org.scalatest.{ Matchers, WordSpec }
import org.problems.p47.BooleanExtension.BooleanTruthTable

class BooleanExtensionTest extends WordSpec with Matchers {
  "P47" should {
    "Print truth tables for logical expressions." in {
      val formula = (x: Boolean, y: Boolean) => x.and(x.or(y))
      BooleanExtension.table(formula)
    }
  }
}
