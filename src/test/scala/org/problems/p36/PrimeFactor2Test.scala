package org.problems.p36

import org.problems.p36.PrimeFactor2.MoreImprovements
import org.scalatest.{ Matchers, WordSpec }

class PrimeFactor2Test extends WordSpec with Matchers {
  "P36" should {
    "Determine the prime factors of a given positive integer (2)" in {
      315.primeFactorMultiplicity shouldBe Map(3 -> 2, 5 -> 1, 7 -> 1)
    }
  }
}
