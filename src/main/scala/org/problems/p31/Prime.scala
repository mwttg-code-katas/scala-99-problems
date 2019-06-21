package org.problems.p31

import scala.annotation.tailrec

object Prime {

  implicit class IsPrimeImprovements(val number: Int) {

    def isPrime: Boolean = {
      @tailrec
      def helper(currentN: Int, accumulator: Boolean): Boolean =
        if (currentN <= 1) accumulator
        else helper(currentN - 1, accumulator && number % currentN != 0)

      helper(number - 1, true)
    }
  }
}
