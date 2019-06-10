package org.problems.p14

import scala.annotation.tailrec

object Duplicate {

  // First idea :-D
  def duplicateLazyVersion[A](list: List[A]): List[A] = {
    list.flatMap(item => List(item, item))
  }

  def duplicate[A](list: List[A]): List[A] = {
    @tailrec
    def duplicateHelper(list: List[A], accumulator: List[A]): List[A] = {
      list match {
        case Nil => accumulator
        case head :: tail =>
          val newAccumulator = accumulator :+ head :+ head
          duplicateHelper(tail, newAccumulator)
      }
    }

    duplicateHelper(list, List.empty)
  }
}
