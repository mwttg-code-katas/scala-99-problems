package org.problems.p39

import org.scalatest.{ Matchers, WordSpec }

class PrimeListTest extends WordSpec with Matchers {
  "P39" should {
    "Calculate a list of prime numbers" in {
      val actual = PrimeList.listPrimeInRange(7 to 31)
      actual should contain theSameElementsAs List(7, 11, 13, 17, 19, 23, 29, 31)
    }
  }
}
