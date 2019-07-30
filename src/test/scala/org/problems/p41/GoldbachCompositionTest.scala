package org.problems.p41

import org.scalatest.{Matchers, WordSpec}

class GoldbachCompositionTest extends WordSpec with Matchers {
  "P41" should {
    "Calculate a list of Goldbach compositions" in {
      GoldbachComposition.printGoldbachList(9 to 20)
    }
    "Calculate a list of Goldbach compositions with limit" in {
      GoldbachComposition.printGoldbachListLimited(9 to 2000, 50)
    }
  }
}
