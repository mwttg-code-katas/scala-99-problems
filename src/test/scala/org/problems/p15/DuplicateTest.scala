package org.problems.p15

import org.scalatest.{ Matchers, WordSpec }

class DuplicateTest extends WordSpec with Matchers {
  "P15" should {
    "Duplicate the elements of a list a given number of times" in {
      val actual = Duplicate.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      actual shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
  }
}
