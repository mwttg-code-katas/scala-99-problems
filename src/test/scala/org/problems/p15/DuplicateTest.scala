package org.problems.p15

import org.scalatest.{ Matchers, WordSpec }

class DuplicateTest extends WordSpec with Matchers {

  "P15 - #Duplicate" should {
    "duplicate each element of a list n times" in {
      val actual = Duplicate.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      actual shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
  }
}
