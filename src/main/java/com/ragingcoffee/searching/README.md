# Searching

In this section, searching shall be dealt with and how the basic algorithms may apply to various other instances to give optimized answers.


## The `contains()` Method

- There exists a method in `java.util.Collection` interface: `contains(Object object)`. It checks the presence of a certain element in a Collection.
- It cannot be used with the plain arrays.
- It is different from the traditional `contains()` used with Strings.


## Linear Search

- This is the most intuitive searching technique that is also the slowest. The time complexity is O(n).
- Searching happens one after the other.
- This technique is not used in general problem solving due to the time it takes.
- Works well for sorted or unsorted or any types of inputs.


## Binary Search

- This is the fastest searching technique (considering all general cases). It takes an O(log n) time complexity.
- This works on the principle of decrease and conquer. An array is kept into two parts. If the element to be searched is smaller than the first element of the second half or greater than the last element of the first half, the two halves are discarded respectively. The half that is currently at hand is again divided into two. And the process repeats.
- Limitations include the fact that arrays need to be sorted for it to work.
- In problem solving, this technique is algorithmically used in multiple places to give easy and quick operations if sorted arrays are involved.


## Jump Search

- This algorithm moves the checker in powers of two. This makes the time complexity of Jump Search O(n ^ 0.5).
- This is faster than linear search but slower than binary search. 
- Arrays can be sorted or unsorted.


## Programs

1. `BinarySearch.java`: To search an array using the binary search technique.
1. `JumpSearch.java`: To search an array using the jump search technique.
1. `LinearSearch.java`: To search an array using the linear search technique.
