# The Singleton Pattern

This is a Creational GoF pattern that *restricts the instantiation of objects of a particular class to just one*. This can be advantageous in situations where a same object is required to do multiple tasks but the overhead of creating multiple objects throughout the program and allocating heap space for it would be too high.


## Violation of SRP

The Singleton pattern seeks to utilize a class for two very different tasks: to *define* the template of the entity that is to come (to define the object) and to *manage* the said entity. This is something that should, in most classes, be avoided and not practiced for good reasons.<br />
Classes are best kept unique with respect to logic.<br />
One of the cons and the reasons why this is also referred to as an *anti-pattern* is due to the fact that this nature tends to make the class more complicated than usual.


## Enums

The best implementation of a singleton would be a mono-element enum. The entire driver class can, in that case, be abstracted into an enum within just a few lines of code. This also eliminates some complexity without altering a class to do something that it shouldn't.


## Use

- If unsure, do not use singletons.
- Very few cases exist where it is actually economical to make use of these, at the cost of understandability.
- Used with databases, file managers and loggers.


## Programs

1. `NonSingleton.java`: Demonstrates a scenario of maintaining database connections without using singleton pattern. This leads to creation of multiple objects to manage the same connection. Used in different parts of the program, this would lead of overusage of resources.
1. `EagerlyInitializedSingleton.java`: Demonstrates a scenario of maintaining database connections by using singleton pattern. There is only one instantiation that is used to establish and utilize connections. Instantiation is done with using a constant reference.
1. `LazilyInitializedSingleton.java`: Demonstrates a scenario of maintaining database connections by using singleton pattern. There is only one instantiation that is used to establish and utilize connections. Instantiation is done by doing a check if the reference is already instantiated.
1. `EnumSingleton.java`: Demontsrates a scenrio of using an enum for singletons.