package org.problems.p08

import org.scalatest.{ Matchers, WordSpec }

class EliminateDuplicatesTest extends WordSpec with Matchers {

  "P08 - #EliminateDuplicates" should {
    "return a list without duplicates (neighbours)" in {
      val actual = EliminateDuplicates.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
    }
  }
}
