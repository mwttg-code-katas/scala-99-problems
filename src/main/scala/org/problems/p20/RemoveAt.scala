package org.problems.p20

object RemoveAt {
  def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    val x       = list.splitAt(n)
    val element = list(n)
    val y       = x._2.drop(1)
    (x._1 ::: y, element)
  }
}
