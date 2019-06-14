package org.problems.p18

import org.scalatest.{ Matchers, WordSpec }

class SliceTest extends WordSpec with Matchers {
  "P18 - #Slice" should {
    "slice a part of a list by n - with buildin methods" in {
      val actual = Slice.sliceBuildIn(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g)
    }
    "slice a part of a list by n - with recursion" in {
      val actual = Slice.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g)
    }
    "return an empty list if n < 0" in {
      val actual = Slice.slice(-1, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List.empty
    }
    "return an empty list if k >=  list.size" in {
      val actual = Slice.slice(0, 11, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List.empty
    }
  }
}
