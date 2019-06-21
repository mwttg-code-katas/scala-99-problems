package org.problems.p31

import org.problems.p31.Prime.IsPrimeImprovements
import org.scalatest.{ Matchers, WordSpec }

class PrimeTest extends WordSpec with Matchers {
  "P31" should {
    "Determine whether a given integer number is prime" in {
      val actual = (2 to 11).map(_.isPrime).toList
      //                    2     3     4      5     6      7     8      9      10     11
      actual shouldBe List(true, true, false, true, false, true, false, false, false, true)
    }
  }
}
