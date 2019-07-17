package org.problems.p33

object CoPrime {
  implicit class CoPrimeImprovements(val number: Int) {
    def isCoprimeTo(otherNumber: Int): Boolean = {
      gcd(number, otherNumber) == 1
    }

    private def gcd(firstNumber: Int, secondNumber: Int): Int =
      if (secondNumber == 0) firstNumber else gcd(secondNumber, firstNumber % secondNumber)
  }
}
