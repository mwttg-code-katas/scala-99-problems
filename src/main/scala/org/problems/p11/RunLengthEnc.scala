package org.problems.p11

import scala.annotation.tailrec

object RunLengthEnc {

  def encodeModified[A](list: List[A]) = {
    val packed = pack(list)
    encode(packed)

  }

  private def encode[A](list: List[List[A]]) =
    list.map(item => {
      if (item.length == 1) item.head
      else (item.length, item.head)
    })

  // from P09
  private def pack[A](list: List[A]) = {
    @tailrec
    def packHelper(list: List[A], accumulator: List[List[A]]): List[List[A]] =
      list match {
        case Nil => accumulator
        case head :: tail =>
          val duplicates     = tail.takeWhile(item => item == head) :+ head
          val newTail        = tail.dropWhile(item => item == head) // this is not efficient tail is used twice
          val newAccumulator = accumulator :+ duplicates
          packHelper(newTail, newAccumulator)
      }

    packHelper(list, List.empty[List[A]])
  }
}
