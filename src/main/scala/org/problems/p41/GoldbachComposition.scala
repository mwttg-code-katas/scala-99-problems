package org.problems.p41

import org.problems.p40.Goldbach.GoldbachImprovements

object GoldbachComposition {
  def printGoldbachList(range: Range): Unit =
    range.foreach(number => {
      if (number % 2 == 0) {
        val tuple = number.goldbach
        println(s"$number = ${tuple._1} + ${tuple._2}")
      }
    })

  def printGoldbachListLimited(range: Range, limit: Int): Unit = {
    range.foreach(number => {
      if (number % 2 == 0) {
        val tuple = number.goldbach
        if (tuple._1 >= limit && tuple._2 >= limit) {
          println(s"$number = ${tuple._1} + ${tuple._2}")
        }
      }
    })
  }
}
