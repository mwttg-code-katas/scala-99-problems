# Scala: 99 Problems
This repository provides some solution to the 99 scala problems. 
See:
* http://aperiodic.net/phil/scala/s-99/

## P01 (*) Find the last element of a list
Example:
```
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```
[blue-print solution](src/main/scala/org/problems/p01/blue-print-solution.md)

## P02 (*) Find the last but one element of a list.
Example:
```
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```
[blue-print solution](src/main/scala/org/problems/p02/blue-print-solution.md)

## P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.

Example:
```
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```
[blue-print solution](src/main/scala/org/problems/p03/blue-print-solution.md)

## P04 (*) Find the number of elements of a list.
Example:
```
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```
[blue-print solution](src/main/scala/org/problems/p04/blue-print-solution.md)

## P05 (*) Reverse a list.
Example:
```
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```
[blue-print solution](src/main/scala/org/problems/p05/blue-print-solution.md)

## P06 (*) Find out whether a list is a palindrome.
Example:
```
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```
[blue-print solution](src/main/scala/org/problems/p06/blue-print-solution.md)

## P07 (**) Flatten a nested list structure.
Example:
```
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```
[blue-print solution](src/main/scala/org/problems/p07/blue-print-solution.md)

## P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  
Example:
```
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```
[blue-print solution](src/main/scala/org/problems/p08/blue-print-solution.md)

## P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.

Example:
```
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```   
[blue-print solution](src/main/scala/org/problems/p09/blue-print-solution.md)

## P10 (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. 
Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

Example:
```
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
[blue-print solution](src/main/scala/org/problems/p10/blue-print-solution.md)

## P11 (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

Example:
```
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
```   
[blue-print solution](src/main/scala/org/problems/p11/blue-print-solution.md)