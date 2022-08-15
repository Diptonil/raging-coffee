# Enumerations

- On a basic surface level, enumerations are a more sophesticated way to represent a list of named constants under a defined new data type. It can only hold a value that it defines in its list.
- Enumerations give ways to explicitly specify the values that a datatype is legally allowed to have.
- It was introduced as a new feature to provide more flexibility to the classic procedure of defining constants using `final`.
- At a higher level, enums are class types (like classes). they have their own constructors, methods and instance variables. Even interfaces can be implemented.


## Fundamentals

- We define an enum variable but unlike classes, we cannot instantiate it:
  ```java
  // An enumeration `en` with the datatype Enumeration has been created.
  Enumeration en;
  ```
- Every value pertaining to the enum is accessed by `enumVariable.value`.
- Definition of enum is as:
  ```java
  enum Enumeration {
    Value1, Value2, Value3
  }
  ```
- For if else comparisons, we use the full reference as `enumVariable.value`.
- For switch case comparisons, we use the partial reference as `value`. This is because when the enum variable is put into the switch statement, the type is inferred automatically. In fact, attempt to use `enumVariable.value` here as well leads to compilation error.


## valueOf() and values()

- These two methods are automatically contained by every enums.
- `values()`: This gives an array containing all the values within the enum of the corresponding enum datatype.
- `valueOf(String string)`: When invoked on the enumeration, this returns the enum value that is defined that matches the `string`.


## `java.lang.Enum`

All enumerations by default inherit `java.lang.Enum`. It is actually a class and not an enum itself. It has several methods available for use by all enumerations. It has many methods but two of them warrant discussion. Look at the fourth program for their use:
- `final int ordinal()`: It is used to obtain a value that indicates the position of an enumeration constant in the list.
- `final int compareTo(enum-type e)`: It compares the ordinal values of two enum constants. The invoking constant as well as the parameterized constant must belong to the same enum. Returns negative if invoking constant has lower ordinality as compared to the parameter. In case of equality, 0 is returned. Equality may also be tested using `==` or `equals()`.


## Programs

1. `SimpleEnumeration.java`: Simple use of an enum along with the difference of implementation in normal if-else and switch statements.
1. `ArrayedEnumeration.java`: Creating an array of enum.
1. `UpgradedEnumeration.java`: An enum is used as a class type to the best of its abilities.
1. `OrdinalEnumeration.java`: Illustrates the application of `ordinal()` and `compareTo()`.
