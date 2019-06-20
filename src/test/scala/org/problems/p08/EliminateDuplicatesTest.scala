package org.problems.p08

import org.scalatest.{ Matchers, WordSpec }

class EliminateDuplicatesTest extends WordSpec with Matchers {
  "P08" should {
    "Eliminate consecutive duplicates of list elements" in {
      val actual = EliminateDuplicates.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
    }
  }
}
