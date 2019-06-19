package org.problems.p22

import scala.annotation.tailrec

object Range {

  // or (from to to).toList ;)

  def range(from: Int, to: Int): List[Int] = {
    @tailrec
    def helper(currentIndex: Int, accumulator: List[Int]): List[Int] =
      (currentIndex, to) match {
        case (m, n) if m > n => accumulator
        case (i, _) => helper(currentIndex + 1, accumulator :+ i)
      }
    helper(from, List.empty)
  }
}
