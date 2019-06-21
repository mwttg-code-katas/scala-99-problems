# Scala: 99 Problems
This repository provides some solution to the 99 scala problems. 
See:
* <http://aperiodic.net/phil/scala/s-99/>

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

## P12 (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

Example:
```
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
``` 
[blue-print solution](src/main/scala/org/problems/p12/blue-print-solution.md)

## P13 (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.

Example:
```
scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
[blue-print solution](src/main/scala/org/problems/p13/blue-print-solution.md)

## P14 (*) Duplicate the elements of a list.
Example:
```
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
```
[blue-print solution](src/main/scala/org/problems/p14/blue-print-solution.md)

## P15 (**) Duplicate the elements of a list a given number of times.
Example:
```
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
```
[blue-print solution](src/main/scala/org/problems/p15/blue-print-solution.md)

## P16 (**) Drop every Nth element from a list.
Example:
```
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
```
[blue-print solution](src/main/scala/org/problems/p16/blue-print-solution.md)

## P17 (*) Split a list into two parts.
The length of the first part is given. Use a Tuple for your result.
Example:
```
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
```
[blue-print solution](src/main/scala/org/problems/p17/blue-print-solution.md)

## P18 (**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
Example:
```
scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```
[blue-print solution](src/main/scala/org/problems/p18/blue-print-solution.md)

## P19 (**) Rotate a list N places to the left.
Examples:
```
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
```
```
scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
```
[blue-print solution](src/main/scala/org/problems/p19/blue-print-solution.md)

## P20 (*) Remove the Kth element from a list.
Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:
```
scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
```
[blue-print solution](src/main/scala/org/problems/p20/blue-print-solution.md)

## P21 (*) Insert an element at a given position into a list.
Example:
```
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
```
[blue-print solution](src/main/scala/org/problems/p21/blue-print-solution.md)

## P22 (*) Create a list containing all integers within a given range.
Example:
```
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
```
[blue-print solution](src/main/scala/org/problems/p22/blue-print-solution.md)

## P23 (**) Extract a given number of randomly selected elements from a list.
Example:
```
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
```
Hint: Use the solution to problem P20

[blue-print solution](src/main/scala/org/problems/p23/blue-print-solution.md)

## P24 (*) Lotto: Draw N different random numbers from the set 1..M.
Example:
```
scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
```
[blue-print solution](src/main/scala/org/problems/p24/blue-print-solution.md)

## P25 (*) Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.

Example:
```
scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
```
[blue-print solution](src/main/scala/org/problems/p25/blue-print-solution.md)


...

...

...

## P31 (**) Determine whether a given integer number is prime.
```
scala> 7.isPrime
res0: Boolean = true
```
[blue-print solution](src/main/scala/org/problems/p31/blue-print-solution.md)

## P32 (**) Determine the greatest common divisor of two positive integer numbers.
Use Euclid's algorithm.
```
scala> gcd(36, 63)
res0: Int = 9
```
[blue-print solution](src/main/scala/org/problems/p32/blue-print-solution.md)
