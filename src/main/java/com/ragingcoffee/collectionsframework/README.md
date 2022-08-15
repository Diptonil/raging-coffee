# The Collections Framework

This is a subset of the `java.util` package and was exclusively designed to meet certain criteria and standards to aid application development. While development of this framework, the requirements that needed addressing were:
- They needed to contain the implementations of all the data-structures conventiently.
- They needed to be highly-performant.
- They needed to be intuitive.
This framework also organized the package that otherwise had become very scattered and lacked structure of design.


## The `Collection` Interface

The point of origin of every data structure described here is this interface. The whole framework is headed by this and this interface is extended by serveral other interfaces, which in turn are implemented by the classes that we would use. This interface makes certain methods optional to be implemented. Collections supporting these methods are called *modifiable*.
Collections, apart from this interface, use certain other interfaces as well. Examples: `Comparator`, `Iterator`, `Spliterator`, etc. that we shall see soon.
The interfaces that extend `Collection` are:
- `List`: Declares the behaviour of data structures that store linear sequential data.
- `Set`: Declares the behaviour of a linear **?** data struture not allowing duplicate elements.
  - `SortedSet`: Declares the behaviour of a sorted data struture not allowing duplicate elements.
    - `NavigableSet`: Declares the behaviour of a sorted data struture not allowing duplicate elements that returns the element closest to the value of the element that is given.
- `Queue`: Declares the behaviour of data structures that store the abstract data type of a queue.
  - `Deque`: Declares the behaviour of data structures that store the abstract data type of a deque.


## General Exceptions Thrown

- `ClassCastException`: Thrown if any attempt to add an incompatible object to a collection is made.
- `NullPointerException`: Thrown if any `null` object is attempted to be stored in a collection.
- `IllegalStateException`: Thrown if any element is appended to a fixed-length collection that is already full.
- `IllegalStateException`: Thrown if an invalid argument is used.
- `UnsupportedOperationException`: Thrown if any operation is done that is not being supported by the collection.


## The `Collection` Classes

Now that we know the interfaces that are defined for the framework, it would be easy for us to see how the classes that we use implement their methods (and which all interfaces they implement). As a general rule, these classes aren't synchronized. They can be, however (discussed later).
Only one class implements `Collection` interface first-hand: `AbstractCollection`. Every class subclasses that and implements some interfaces specific to their nature. The heirarchy:
- `AbstractCollection`: Implements `Collection` and sits at the top of the heirarchy just to let others subclass it.
  - `ArrayDeque`: Extends `AbstractCollection` and implements `Deque`.
  - `AbstractQueue`: Extends `AbstractCollection` and implements `Queue`.
    - `PriorityQueue`: Extends `AbstractQueue` to support a priority-based queue.
  - `AbstractSet`: Extends `AbstractCollection` and implements `Set`.
    - `TreeSet`: Extends `AbstractSet` for a set sorted in a tree.
    - `EnumSet`: Extends `AbstractSet` for use with `enums`.
    - `HashSet`: Extends `AbstractSet` for use with a hashtable.
      - `LinkedHashSet`: Extends `HashSet` and allows insertion order iterations.
  - `AbstractSequentialList`: Extends `AbstractList` and is made for collections that provide sequential access to elements rather than random access.
    - `LinkedList`: Extends `AbstractSequentialList` and makes a sequentially accessible linked list.
  - `AbstractList`: Extends `AbstractCollection` and implements most of `List`.
    - `ArrayList`: Extends `AbstractList` and creates a dynamic array.
    

## The `ArrayList` Class

- It is a class used to implement dynamic arrays. 
- It is different than a normal array as it's size is unfixed and can vary at runtime (shrinks when objects are removed, increases upon addition).
- It is different than a `LinkedList` because it allows random element search.
- The constructors are `ArrayList()`, `ArrayList(int capacity)` and `ArrayList(Collection<? extends E> collection)`.
- Reallocation of space, albeit possible, is time-expensive. We must avoid that using `ensureCapacity(int increaseToSize)` & `trimToSize()` methods.
- A `toArray()` exists to convert the collection object into a regular array. That may be done in support of legacy code or just due to performance-enhancements.


## The `LinkedList` Class

- 


## Programs

For this section, exclusively, methods aren't separately discussed. Their uses may be inferred just by a glance at the code.
1. `ArrayListCollection.java`: Complete use of `ArrayList`s.
1. `LinkedListCollection.java`: Complete use of `LinkedList`s.
1. 