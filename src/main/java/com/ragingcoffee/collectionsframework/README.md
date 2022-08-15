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

Now that we know the interfaces that are defined for the framework, it would be easy for us to see 