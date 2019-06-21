package org.problems.p10

import org.scalatest.{Matchers, WordSpec}

class RunLengthEncodingTest extends WordSpec with Matchers {
  "P10" should {
    "Run-length encoding of a list" in {
      val actual = RunLengthEncoding.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    }
  }
}
