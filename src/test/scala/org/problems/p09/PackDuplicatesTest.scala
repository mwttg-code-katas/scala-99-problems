package org.problems.p09

import org.scalatest.{ Matchers, WordSpec }

class PackDuplicatesTest extends WordSpec with Matchers {
  "P09" should {
    "Pack consecutive duplicates of list elements into sublists" in {
      val actual = PackDuplicates.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List(
        List('a, 'a, 'a, 'a),
        List('b),
        List('c, 'c),
        List('a, 'a),
        List('d),
        List('e, 'e, 'e, 'e)
      )
    }
  }
}
