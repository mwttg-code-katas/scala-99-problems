package org.problems.p33

import org.scalatest.{Matchers, WordSpec}
import org.problems.p33.CoPrime.CoPrimeImprovments

class CoPrimeTest extends WordSpec with Matchers {
  "P33" should {
    "Determine whether two positive integer numbers are coprime" in {
      35.isCoprimeTo(64) shouldBe true
    }
  }
}
