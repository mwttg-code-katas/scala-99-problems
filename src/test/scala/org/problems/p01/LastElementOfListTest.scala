package org.problems.p01

import org.scalatest.{ Matchers, WordSpec }

class LastElementOfListTest extends WordSpec with Matchers {

  "P01 - #LastElementOfList" should {
    "return last element of list" in {
      val list   = List(1, 2, 3, 4)
      val actual = LastElementOfList.last(list)
      actual shouldBe 4
    }
  }
}
