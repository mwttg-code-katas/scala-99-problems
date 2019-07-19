package org.problems.p40

import org.problems.p40.Goldbach.GoldbachImprovements
import org.scalatest.{ Matchers, WordSpec }

class GoldbachTest extends WordSpec with Matchers {
  "P40" should {
    "Calculate Goldbach's conjecture" in {
      val actual = 28.goldbach
      actual shouldBe (23, 5)
    }
  }
}
