package org.problems.p35

import scala.annotation.tailrec

object PrimeFactor {
  implicit class Improvements(val number: Int) {
    def primeFactors: List[Int] = {
      def helper(restNumber: Int, leftPrimes: List[Int], accumulator: List[Int]): List[Int] =
        leftPrimes match {
          case Nil => accumulator
          case head :: tail =>
            if (restNumber.isDividableBy(head))
              helper(restNumber / head, leftPrimes, accumulator :+ head)
            else
              helper(restNumber, tail, accumulator)
        }

      require(number > 1)
      val divisors = number.getAllDivisors
      val primes = divisors.filter(_.isPrime)
      helper(number, primes, List.empty)
    }

    private[PrimeFactor] def isPrime = {
      @tailrec
      def helper(n: Int, accumulator: Boolean): Boolean =
        if (n == 1)
          accumulator
        else {
          if (number.isDividableBy(n))
            helper(n - 1, accumulator && false)
          else
            helper(n - 1, accumulator && true)
        }
      helper(number - 1, true)
    }

    private[PrimeFactor] def getAllDivisors = {
      @tailrec
      def helper(n: Int, accumulator: List[Int]): List[Int] =
        if (n == 1)
          accumulator
        else {
          if (number.isDividableBy(n))
            helper(n - 1, accumulator :+ n)
          else
            helper(n - 1, accumulator)
        }
      helper(number, List.empty)
    }

    private[PrimeFactor] def isDividableBy(divisor: Int) = number % divisor == 0
  }
}
