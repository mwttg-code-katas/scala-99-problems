package org.problems.p03

import org.scalatest.{Matchers, WordSpec}

class KthElementOfListTest extends WordSpec with Matchers {

  "P03 - #kthElementOfList" should {
    "return the k-th element of list" in {
      val actual = KthElementOfList.nth(2, List(1, 1, 2, 3, 5, 8))
      actual shouldBe 2
    }
  }
}
