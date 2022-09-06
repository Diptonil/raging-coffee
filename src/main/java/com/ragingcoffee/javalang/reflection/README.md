# The Reflection API

The Reflection API defined by `java.lang.reflect` is a set of utilities that allows a class to have its own behaviour and attributes examined at the time of it being used so that it may modify and readjust itself.<br />
Honestly, it is an API that should be steered clear of at most times and only be used with very good reason (and caution). It apparently violates several features of Java's design.


## Peeping Into the Structure of a Class

We see in the runner class' methods `examineDeclaredFields()` and `examineDeclaredMethods()` that we have the ability to look into the actual fields (public or private or whatever) and methods of any class. Technically, we should not have such a power to look at all the fields of a class that are private. This is violating data hiding concepts. But we can using Reflection. The power is not only limited to fields and methods but also annotations and other elements.<br />
**NOTE**: `getFields()` is responsible for getting all the fields up the entire class heirarchy (even fields of superclasses) while `getDeclaredFields()` is responsible for getting the fields for only the class in question. Same goes for methods.


## Altering Private Fields Without Setters

The `alterPrivateValues()` method in the runner class gives us the privilege to change values of our object that we are not supposed to change. We see that we could easily alter even final values that cannot in any way be changed. This somewhat renders the design of classes useless and is a feature that is seemingly risky, more than anything else.


## Executing Methods

Methods can be invoked (public or private or any other method) with no restictions, as seen in `invokeMethods()` method in the runner class. We note that for values that we are not supposed to alter (in any case of reflection), we must use the method  `setAccessible()` for it.<br />
We use `null` for static methods since they do not not reference to the calling object to work.


## Why Use It?

Reflection stands to contradict the very basis on which Java is based on. So there are opinions against their use. However, it was built with a very different use in mind.
- It is used to examine and scrutinize various components of Java for educational use. We can survey certain in-built classes with this.
- The Spring Framework uses Reflection all over the place. This is because it has to know to work with code that is not written yet. It is used in a very complicated manner than what has been discussed here but the basic tools are the same.
- Used heavily in testing of private fields.


Cons

- Very easy to break everything apart at once. In cases of refactoring, if changes are not implemented in reflection classes, production classes as well as tests, project would fail.
- Everything happens at runtime. So no compile-time work optimizations can be done. This slows code down.


## Classes

1. `Cat.java`: Example class that would be used for reflection.
1. `Runner.java`: Runner class that illustrates reflection.