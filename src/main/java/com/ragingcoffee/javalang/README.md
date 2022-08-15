# The `java.lang` Package

This section would be an exploratory part with respect to the `java.lang` package that always gets implicitly imported.


## The Wrapper Classes

- The Java primitives are low-performace values that can serve just about any programmatic purpose. They do not need to inherit any fancy `Object` class or anything else. Using objects for simple arithmetic jobs would cause way too much of overhead.
- There may be times when we would need an object representation of even the primitives. On main use would be altering  values by reference. Primitives only get passed around as values.
- They're `Double`, `Float`, `Boolean`, `Integer`. `Character`, `Short`, `Byte` and `Long`.
- Most of the Wrapper class' constructors have been deprecated starting from JDK 9. The recommended approach as of now is to use the static method that the classes define: `valueOf()`. Yet, this isn't the modern standard. Read Autoboxing.
- The method `datatypeValue()` is used to convert a Wrapper object into a primitive.
- The `toString()` is invoked by a Wrapper object to make it into a string.
- There are constants like `MAX_VAL` and `MIN_VAL` that are used for finding the maximum and minimum values that these values support.


## Autoboxing

- It is a feature introduced in JDK 5 that allows the automatic conversion of a primitive into its Wrapper class whenever that value needs to be presented as an object. The reverse process is known as auto-unboxing.
- This can be observed while passing values to methods that expect references (Wrapper class parameters, basically).
- Auto-unboxing also happens in expression evaluation. We do not need to worry if an algebraic expression having `Float` objects would be incorrectly evaluated using the regular operators. Even type conversion happens the same way as it does with primitives. Switch statements are also fair game.
- Boolean objects get auto-unboxed in conditionals.
- Classic array objects of Wrapper classes and the primitives **cannot** be autoboxed/ unboxed.
- While it adds way too much of convenience, it must be remembered that it shouldn't be interchangibly used with the primitives. That is bad practice because overhead is added with Wrappers. It will never replace primitives.


## Programs

1. `ConsoleInput.java`: Using the `Console` class for taking inputs through the console.
1. `CopyingArray.java`: Using the `System` class to copy an array into another from mentioned indices and positions.
1. `IntegerWrapper.java`: Illustrating the concepts of autoboxing and autounboxing using the `Integer` class.
