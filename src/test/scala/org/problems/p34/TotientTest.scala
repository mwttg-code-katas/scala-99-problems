package org.problems.p34

import org.scalatest.{Matchers, WordSpec}
import org.problems.p34.Totient.Improvements

class TotientTest extends WordSpec with Matchers {
  "P34" should {
    "Calculate Euler's totient function phi(m)" in {
      10.totient shouldBe 4
    }
  }
}
