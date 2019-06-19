package org.problems.p21

import org.scalatest.{ Matchers, WordSpec }

class InsertTest extends WordSpec with Matchers {
  "P21 - #Insert" should {
    "Insert an element at a given position into a list" in {
      val actual = Insert.insertAt('new, 1, List('a, 'b, 'c, 'd))
      actual shouldBe List('a, 'new, 'b, 'c, 'd)
    }
  }
}
