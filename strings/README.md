# The String Class

- This class is one of the most used Java class data types. It cannot be inherited (final class).
- Even though `String` is a class, due to it being such a popular datatype, we would refrain from the use of backticks in its case.
- It is worth knowing that the RHS (whatever value we assign to the String in "") is actually an object rather than just a value.
- There is a special separate memory structure allocated inside the Java heap - String Pool. It is in that part of the heap memory where all string objects are actually stored. The reason why it does not indpendently exist in the heap is because every object existing in the String Pool is unique. Example:
    ```java
    String s1 = "string";
    String s2 = "string";
    ```
This does not create two different objects. The String Pool will only have one "string" while in the program stack there exists two different references for the same value - s1 and s2. This is true for this type of implementation in which we are not explicitly telling the compiler to create new objects.
- Strings are immutable. Reassignments may feel like object can be *changed*, but in reality a new object is being created and reassigned to the reference. The old object stays until garbage collection.
- For such cases where a modifiable string is desired, usually **StringBuilder** or **StringBuffer** is the way to go. All these three classes are declared final and reside in java.lang package and implement the **CharSequence** interface.
- The famous `toString()` method is used frequently to represent an object like a String. There are occurences in which we use this methods on Wrapper classes such as `Float.toString(float value)`. This method is actually a part of the Object class that is by default inherited by all classes. Hence, it may as well be understood as the `__str__()` of Python. We can override this method in any class that we make and many predefined classes override this as well.
Suppose we have a Box class whose object we want to display using the printing functions. In the Box class we override this method as:
  ```java
  ...
  public String toString() {
    return "Dimensions of this box are " + width + " by " + depth + " by " + height + ".";
  }
  ...
  ```


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


## The String Class Methods

Here are some methods that would come in handy very frequently. The lesser useful methods are left out for brevity.
- `char charAt(int index)`: Returns the character at the parameterized index.
- `void getChars(int startIndex, int endPosition, char[] targetArray, int targetArrayStartIndex)`: Extracts a set of characters from a string into a character array as per the parameters.
- `byte[] getBytes()`: Similar to the previous method but for bytes.
- `char[] toCharArray()`: Coverts a String to a character array.
- `boolean equals(Object string)`: Already mentioned above.
- `boolean equalsIgnoreCase(String string)`: Checks equality with no regard to uppercase or lowercase differences.
- `boolean regionMatches(int startIndex, String string2, int string2StartIndex, int characters)`: If the substring thus mentioned by the parameters matches the String that invokes the method, `true` is returned (I'd rather use an equality check on a substring).
- `boolean startsWith(String string)`: Returns `true` if invoking String starts with given parameter.
- `boolean endsWith(String string)`: Returns `true` if invoking String ends with given parameter.
- `int compareTo(String string)`: Returns a negative value if invoking String is less than `string`. If they are equal, 0 is returned. Otherwise a positive value is returned. A String is greater than another if they come after the other String in dictionary order (more specifically, upon ASCII comparison (to account for differences in uppercase and lowercase comparisons; uppercase < lowercase)).
- `int compareToIgnoreCase(String string)`: This is used to perform the previous activities with no regard to case.
- `int indexOf(char character)` OR `int indexOf(String string)`: Returns the index of the first occurence of any character or a substring. If not found, return -1.
- `int lastIndexOf(char character)` OR `int lastIndexOf(String string)`: Returns the index of the last occurence of any character or a substring. If not found, return -1.
- `int indexOf(char character, int startIndex)` OR `int indexOf(String string, int startIndex)`: Returns the index of the first occurence of any character or a substring. If not found, return -1. This happens after the `startIndex`.
- `int lastIndexOf(char character, int startIndex)` OR `int lastIndexOf(String string, int startIndex)`: Returns the index of the last occurence of any character or a substring. If not found, return -1. This happens after the `startIndex`.
- `String substring(int startIndex)` OR `String substring(int startIndex, int endPosition)`: Extracts a String with respect to the parameters.
- `String concat(String string)`: Concatenates the `string` with the invoking String.
- `String replace(char original, char replacement)`: Replaces all occurences of original character with the new character. We also have a `String replace(CharSequence original, CharSequence replacement)` that is used for sequences.
- `String trim()`: Removes all leading or trailing *regular* whitespaces from invoking String.
- `String strip()`: Removes all leading or trailing *Java* whitespaces from invoking String. Such whitespaces are the ones that are carriage returns, line feeds, regular whitespaces, tabs, etc. We also have `String stripTrailing()` and `String stripLeading()`.
- `String toUpperCase()` AND `String toLowerCase()`: This does case conversions. This also has some `Locale` support that shall be dealth with later and is irrelevant to the discussion of Strings.
- `static String join(CharSequence delimeter, CharSequence ...strings)`: This concatenates two or more `CharSequences` (`String`s, `StringBuffer`s and `StringBuilder`s) as parameterized with `strings` and separates them with the `delimeter`.
