package org.problems.p14

import org.scalatest.{ Matchers, WordSpec }

class DuplicateTest extends WordSpec with Matchers {
  "P14" should {
    "Duplicate the elements of a list" in {
      val actual = Duplicate.duplicate(List('a, 'b, 'c, 'c, 'd))
      actual shouldBe List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
    "Duplicate the elements of a list - the lazy version" in {
      val actual = Duplicate.duplicateLazyVersion(List('a, 'b, 'c, 'c, 'd))
      actual shouldBe List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }
}
