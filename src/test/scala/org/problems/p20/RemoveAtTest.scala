package org.problems.p20

import org.scalatest.{ Matchers, WordSpec }

class RemoveAtTest extends WordSpec with Matchers {
  "P20" should {
    "Remove the Kth element from a list" in {
      val actual = RemoveAt.removeAt(1, List('a, 'b, 'c, 'd))
      actual shouldBe (List('a, 'c, 'd), 'b)
    }
  }
}
