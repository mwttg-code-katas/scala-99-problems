package org.problems.p15

object Duplicate {

  def duplicateN[A](n: Int, list: List[A]): List[A] =
    list.flatMap(item => (1 to n).map(_ => item).toList)
}
