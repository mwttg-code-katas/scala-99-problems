package org.problems.p35

import org.problems.p35.PrimeFactor.Improvements
import org.scalatest.{ Matchers, WordSpec }

class PrimeFactorTest extends WordSpec with Matchers {
  "P35" should {
    "Determine the prime factors of a given positive integer." in {
      315.primeFactors should contain theSameElementsAs List(3, 3, 5, 7)
    }
  }
}
