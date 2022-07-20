# Arrays

Here we describe various different algorithms or methods that may be employed to solve particular problems with minimal time or space complexity, if a certain such process exists.


## Sliding Windows

- ABSTRACT: Performs a repeated operation on a consecutive subset of an array from the first index to the last possible index. Analogous to a window pane sliding through the entire slot.
- PROBLEMS: An example would be "find maximum sum of *k* consecutive array elements".
- ADVANTAGES: The Brute-Force technique might take around O(n^2) to solve a problem that it can do within O(n).


## Two Pointers

- ABSTRACT: Performs an operation on a pair of array elements to satisfy a condition (which is not necessarily adjacent, otherwise it would have been like Sliding Windows). This is done by setting two pointers (generally in a sorted array) and modifying the pointer values to traverse the array from both ends at the same time until a condition is fulfilled.
- PROBLEMS: An example would be "find a pair in an array giving a pre-ordained sum".
- ADVANTAGES: The Brute-Force technique might take around O(n^2) to solve a problem that it can do within O(n).