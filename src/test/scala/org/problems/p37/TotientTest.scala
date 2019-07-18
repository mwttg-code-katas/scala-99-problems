package org.problems.p37

import org.scalatest.{Matchers, WordSpec}
import org.problems.p37.Totient.TotientImprovements

class TotientTest extends WordSpec with Matchers {
  "P36" should {
    "Calculate Euler's totient function phi(m) (improved)" in {
      10.totient shouldBe 4
    }
  }
}
