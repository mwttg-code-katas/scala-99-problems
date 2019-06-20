package org.problems.p25

import org.scalatest.{Matchers, WordSpec}

class PermutationTest extends WordSpec with Matchers {
  "P25" should {
    "Generate a random permutation of the elements of a list" in {
      for(i <- 1 to 100) {
        val actual = Permutation.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
        actual.size shouldBe 6
      }
    }
  }
}
