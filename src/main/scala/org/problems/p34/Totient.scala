package org.problems.p34

import scala.annotation.tailrec

object Totient {
  implicit class Improvements(val number: Int) {
    def totient: Int = {
      @tailrec
      def helper(currentN: Int, accumulator: Int): Int =
        if (currentN == 0) accumulator
        else {
          if (number.isCoprimeTo(currentN)) helper(currentN - 1, accumulator + 1)
          else helper(currentN - 1, accumulator)
        }
      helper(number, 0)
    }

    // ----------- from P33 CoPrime -----------

    private[Totient] def isCoprimeTo(otherNumber: Int): Boolean = {
      gcd(number, otherNumber) == 1
    }

    private def gcd(firstNumber: Int, secondNumber: Int): Int =
      if (secondNumber == 0) firstNumber else gcd(secondNumber, firstNumber % secondNumber)
  }
}
