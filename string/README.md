# The String Class

- This class is one of the most used Java class data types. It cannot be inherited (final class).
- It is worth knowing that the RHS (whatever value we assign to the String in "") is actually an object rather than just a value.
- There is a special separate memory structure allocated inside the Java heap - String Pool. It is in that part of the heap memory where all string objects are actually stored. The reason why it does not indpendently exist in the heap is because every object existing in the String Pool is unique. Example:
    ```java
    String s1 = "string";
    String s2 = "string";
    ```
This does not create two different objects. The String Pool will only have one "string" while in the program stack there exists two different references for the same value - s1 and s2. This is true for this type of implementation in which we are not explicitly telling the compiler to create new objects.
- Strings are immutable. Reassignments may feel like object can be *changed*, but in reality a new object is being created and reassigned to the reference. The old object stays until garbage collection.
- For such cases where a modifiable string is desired, usually **StringBuilder** or **StringBuffer** is the way to go. All these three classes are declared final and reside in java.lang package and implement the **CharSequence** interface.


## The String Constructors

- There is the classic empty constructor.
  `String string = new String();`
- There is one that accepts a character array and makes it into a String:
  `String string = new String(char[] array);`
- There is one that accepts a character array with start index and number of characters to include and makes it into a String:
  `String string = new String(char[] array, int startIndex, int charNums);`
- There is one that accepts a String literal and makes it into a String object:
  `String string = new String(String str);`
- The known format of Strings uses char datatypes that hold 2 bytes of data to represent the basic Unicode character set. However, a well-known format over the internet uses 1 byte arrays as Strings. The bytes represent the Unicode values. The datatype is used as well:
  `String string = new String(byte[] array);`
  OR
  `String string = new String(byte[] array, int startIndex, int charNums);`
- A point to note is that if we change the arrays after they have been made to Strings, the String object shall remain unchanged.
- There is one that can take StringBuilder or StringBuffer objects as well:
  `String string = new String(StringBuffer str);`
  AND
  `String string = new String(StringBuilder str);`


## Different String Objects of Same Value

We have mentioned that the traditional implementation, if a same value is encountered, will have just one copy in the String Pool for optimization purposes. However, we may be explicit about wanting 2 different copies even if they would be of the same value. Do that by:
```java
String s11 = new String("string");
String s22 = new String("string");
```
Even though both have the same value, the two objects would differ. These objects are created outside the String Pool in the heap.


## Equality Checks

- The `==` operator in Java serves only one function for non-primitive data types: return true if both the value and the reference is the same. So, `s1 == s2` will yield true from above examples. But `s11 == s22` would yield false. This is only for non-primitives. The primitive data types have no issues with references and deal plainly in values. Even though logically this works, the compiler discourages use of the operator for Strings.
- The `equals()` method is used to compare the values of the two objects, not references.


## The Printing Mechanism

- When we use the `println()` or `print()` methods, a lot go on under the hood. Everytime, the value passed as a parameter first gets converted to a String before being consoled out.
- An integer value undergoes the `Integer.toString()` for conversion into a String. So follows for all other primitives.
- Any uninstantiated or unassigned object prints `null`.
- When a String is being concatenated by pre-built operator overloading to a simple `int`, the primitive gets converted into its Wrapper class.
**NOTE**: There is only one instance of operator overloading in Java that they themselves have provided. It is String concatenation. We cannot, by ourselves, overload operators. That is allowed in C++, not here.


## Formatted Printing

- The `printf()` method is used for pretty printing and formatting in Java. It follows a C-like syntax.
- To print a float value till two d.p. (rounded off):
    ```java
    float number = 1.2345;
    System.out.printf("Value is %.2f", number);
    ```


## The StringBuilder Class