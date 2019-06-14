package org.problems.p17

object Split {
  def split[A](at: Int, list: List[A]): (List[A], List[A]) = list.splitAt(at)
}
