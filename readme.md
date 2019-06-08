#Scala: 99 Problems
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

##P02 (*) Find the last but one element of a list.
Example:
```
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```
[blue-print solution](src/main/scala/org/problems/p02/blue-print-solution.md)

##P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.

Example:
```
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```
[blue-print solution](src/main/scala/org/problems/p03/blue-print-solution.md)

##P04 (*) Find the number of elements of a list.
Example:
```
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```
[blue-print solution](src/main/scala/org/problems/p04/blue-print-solution.md)

##P05 (*) Reverse a list.
Example:
```
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```
[blue-print solution](src/main/scala/org/problems/p05/blue-print-solution.md)
