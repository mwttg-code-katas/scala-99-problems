package org.problems.p10

import scala.annotation.tailrec

object RunLengthEncoding {

  def encode[A](list: List[A]): List[(Int, A)] = {
    val duplicates = pack(list)
    createTuples(duplicates)
  }

  private def createTuples[A](list: List[List[A]]) = {
    @tailrec
    def tupleHelper(list: List[List[A]], accumulator: List[(Int, A)]): List[(Int, A)] = {
      list match {
        case Nil => accumulator
        case head :: tail =>
          val amount = head.size
          val item = head.head
          val newAccumulator = accumulator :+ (amount, item)
          tupleHelper(tail, newAccumulator)
      }
    }

    tupleHelper(list, List.empty)
  }

  // from P09
  private def pack[A](list: List[A]) = {
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
