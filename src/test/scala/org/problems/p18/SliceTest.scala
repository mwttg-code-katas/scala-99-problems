package org.problems.p18

import org.scalatest.{ Matchers, WordSpec }

class SliceTest extends WordSpec with Matchers {
  "P18" should {
    "Extract a slice from a list - with build-in methods" in {
      val actual = Slice.sliceBuildIn(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g)
    }
    "Extract a slice from a list - with recursion" in {
      val actual = Slice.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g)
    }
    "Extract a slice from a list - if n < 0" in {
      val actual = Slice.slice(-1, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List.empty
    }
    "Extract a slice from a list - if k >=  list.size" in {
      val actual = Slice.slice(0, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List.empty
    }
  }
}
