package org.problems.p32

import org.problems.p32.Gcd.gcd
import org.scalatest.{Matchers, WordSpec}

class GcdTest extends WordSpec with Matchers {
  "P31" should {
    "Determine the greatest common divisor of two positive integer numbers" in {
      gcd(36, 63) shouldBe 9
    }
  }
}
