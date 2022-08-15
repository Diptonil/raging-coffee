# Arrays

Here we describe various different algorithms or methods that may be employed to solve particular problems with minimal time or space complexity, if a certain such process exists.


## 2D Arrays

- It is not compulsory for us to have a fixed column size for every 2D array. So `{{1, 2}, {1, 2, 3, 4}, {1}}` would work fine.
- Instantiations, due to the rule above, might also be as `int[][] array = new int[3][]`.


## The Arrays Class

It is found in java.util package. It is an abstract class. It has certain helpful methods that operate on the standard Java array like:
- toString(array): Provides better formatting and printing out of arrays with ease. Overrides the `toString()` method.
- sort(array): Dual-Pivot Quicksort is used to sort.
- 


## The ArrayList Class

It is found in the java.util package. It's not abstract and as simple and limited as the Arrays class. It contains certain standard methods that make the problems easily solvable for us. It is not bound to the initial size that we specify to it, unlike regular Arrays.
To make it: `ArrayList<String> array = new ArrayList<>(10);`
The generic inside can be written for the constructor as well. The parameter corresponds to the initial ArrayList size (that may be increased later and left empty as well). The generic has the Wrapper class datatype of whose array we are creating. These generics ensure that we do not have multiple data types within an ArrayList. It doesn't require toString() to be called on it. It can easily be printed out. Some methods that need to be invoked:
- add(...): Adds the element to the array from back.
- contains(...): Returns true if element is there. False, otherwise.
- get(int index): Returns the value at the index.
- set(int index, value): Changes the value at the index with the supplied value.
- remove(int index): Removes the element at the specified index.
Even though it may seem like the size can be varied, it is fixed internally. After the ArrayList gets filled up by a certain amount, the size grows to a preferred size to accomodate more elements.

If we are to make a 2D ArrayList structure (assume a Scanner object):
```java
ArrayList<ArrayList<Integer>> array = new ArrayList<>();

for (int iterator = 0; iterator < 5; iterator ++) {
    array.add(new ArrayList<>());
}

for (int iterator = 0; iterator < 5; iterator ++) {
    for (int j = 0; j < 2; j ++) {
        array.get(iterator).add(scanner.nextInt());
    }
}
``` 


## Sliding Windows

- ABSTRACT: Performs a repeated operation on a consecutive subset of an array from the first index to the last possible index. Analogous to a window pane sliding through the entire slot.
- PROBLEMS: An example would be "find maximum sum of *k* consecutive array elements".
- ADVANTAGES: The Brute-Force technique might take around O(n^2) to solve a problem that it can do within O(n).


## Two Pointers

- ABSTRACT: Performs an operation on a pair of array elements to satisfy a condition (which is not necessarily adjacent, otherwise it would have been like Sliding Windows). This is done by setting two pointers (generally in a sorted array) and modifying the pointer values to traverse the array from both ends at the same time until a condition is fulfilled.
- PROBLEMS: An example would be "find a pair in an array giving a pre-ordained sum".
- ADVANTAGES: The Brute-Force technique might take around O(n^2) to solve a problem that it can do within O(n).


## Dutch National Flag

- ABSTRACT: Performs a segregation/ classification in an array in-place. Done by setting three pointers and swapping elements along.
- PROBLEMS: Sort an array of 0s, 1s and 2s.
- ADVANTAGES: Sorting operations provide O(n) time complexity instead of any higher sorting algorithm time.


## Ceil & Floor

- ABSTRACT: Searches for an element in a sorted arry which is less that the target element for floor and greater than the target element for ceil.
- PROBLEMS: Find floor and ceil and make it wrap for any values towards the end of the array (basically use a `pointer % size`)
- ADVANTAGES: Instead of O(n), we have O(log(n)).