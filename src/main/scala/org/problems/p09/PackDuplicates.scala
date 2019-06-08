package org.problems.p09

import scala.annotation.tailrec

object PackDuplicates {

  def pack[A](list: List[A]): List[List[A]] = {
    @tailrec
    def packHelper(list: List[A], accumulator: List[List[A]]): List[List[A]] = {
      list match {
        case Nil => accumulator
        case head :: tail =>
          val duplicates = tail.takeWhile(item => item == head) :+ head
          val newTail = tail.dropWhile(item => item == head)  // this is not efficient tail is used twice
          val newAccumulator = accumulator :+ duplicates
          packHelper(newTail, newAccumulator)
      }
    }

    packHelper(list, List.empty[List[A]])
  }
}
