package org.problems.p20

import org.scalatest.{ Matchers, WordSpec }

class RemoveAtTest extends WordSpec with Matchers {
  "P20 - #Remove" should {
    "Return the list and the removed element in a Tuple. Elements are numbered from 0." in {
      val actual = RemoveAt.removeAt(1, List('a, 'b, 'c, 'd))
      actual shouldBe (List('a, 'c, 'd), 'b)
    }
  }
}
