package org.problems.p36

object PrimeFactor2 {
  import org.problems.p35.PrimeFactor.Improvements

  implicit class MoreImprovements(val number: Int) {
    def primeFactorMultiplicity: Map[Int, Int] = {
      val pimeFactors = number.primeFactors
      pimeFactors.groupBy(identity).mapValues(_.size)
    }
  }
}
