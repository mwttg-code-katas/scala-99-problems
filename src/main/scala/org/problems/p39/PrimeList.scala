package org.problems.p39

import scala.annotation.tailrec
import scala.collection.immutable.Range.Inclusive

object PrimeList {
  def listPrimeInRange(range: Inclusive): List[Int] =
    range.filter(_.isPrime).toList

  implicit class PrimeImprovements(val number: Int) {
    def isPrime: Boolean = {
      @tailrec
      def helper(n: Int, accumulator: Boolean): Boolean =
        if (n == 1) accumulator
        else helper(n - 1, accumulator && number % n != 0)

      helper(number - 1, true)
    }
  }
}
