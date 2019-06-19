package org.problems.p21

object Insert {
  def insertAt[A](item: A, index: Int, list: List[A]): List[A] = {
    val split = list.splitAt(index)
    (split._1 :+ item) ::: split._2
  }
}
