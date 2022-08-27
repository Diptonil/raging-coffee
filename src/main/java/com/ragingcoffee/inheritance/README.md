# Inheritance

- This section covers inheritance in detail. It is the policy by which resuablility and abstraction in implemented in Java. We can extend and reuse functionality without reinventing the wheel. This also makes for more effective program partitioning and segregation.
- The scope of inheritance is largely influenced by access specifiers.
- Multiple inheritance is not supported. Heirarchial multilevel inheritance is.
- In all the programs, multiple classes have been noted in one source file. This is *not* the norm and is strongly discouraged for industry-level projects. The norm is segregating all the classes in their own source files and declaring them as public so that they can be accessed within the same package. Only such classes should remain in one source file that do not need to be accessed from any other source file outside. This involves classes serving as abstract dependencies to the public class for a source file in question.


## Private Superclass Access Specifier

A subclass cannot access any member of the superclass that has been declared as private. Neither can the object of that superclass created anywhere else.


## The Empty Contructor of Superclass

Contructors are never inherited. Hence, there is no way for the child class to decipher about the parent's constructor. Hence an empty constructor needs to be present. To overcome this problem, use the `super` keyword in the subclass (wherever applicable) to avoid creating empty constructors. In fact, the super keyword is almost mandatorily used in inheritance.


## The Super Keyword

Its basic use is referring to the superclass from the subclass. There are 2 different ways super is used:
- **Calling superclass constructors**: The most basic use. Instead of initialising in the subclass constructors all the values of the superclass constructors manually, we call the constructor of the superclass to do the job. We must legitimately pass in all the parameters to the super keyword to call the right constructor of the superclass from the concerned subclass constructor.
- **Differentiate between superclass and subclass members of the same name**: Just like the this keyword, this can be used to namespace variables having same names in both the inheriting classes.


## Order of Constructor Execution

If the order of inheritance is C extends B while B extends A, the oder in which the constructors would get executed if an object of C is created is A->B->C.


## Method Overriding & Dynamic Method Dispatch

- A subclass is said to *override* a method of a superclass when the signatures of the methods in both the classes are same. When the method is called from the subclass, the modified version will be executed and the method defined by the superclass would be hidden. To refer to the superclass method, `super.methodName(...)` may be used.
In case method signatures don't match and just the names are same, simple overloading occurs.
- Dynamic Method Dispatch is the concept in Java with which runtime polymorphism is possible. It works on two priciples: method overriding and the fact that the superclass can reference a subclass object. This follows that if a subclass object is created and is assigned to the superclass reference, the method calls made by that reference would call the subclass methods belonging to the object and not the reference.


## Abstract Classes

There are instances (like the `Figure.getArea()` from `DynamicMethodDispatchInheritance.java` which says "Figure is undefined"; something that makes zero sense) when the superclass has a method that is literally of no use in itself but exists so that it may be overriden by the subclass for building functionality of its own subclass. Abstract classes exist just for this.
Abstract classes have normal methods that exist to be overriden and concerete methods that have their own implementation. They *cannot* be instantiated. However, their reference may be declared.


## Inlining and Use of Final

The three uses of the `final` keyword are:
- To declare the equivalent of a named constant.
- To restrict a method from being overriden. A final method is opposite to that of an abstract method - overriding is illegal and gives compilation errors.
- To restrict a class from being inherited. This imposes strict decisions on design choices and makes structure more elegant.
When a superclass' method becomes final, the compiler is spared of the overhead of deciding which method to call at the runtime. This makes way for inline method calls. Inlining happens when instead of runtime (as Java usually does), the method call is substituted at the compile-time with the code within the method. So the bytecode made ships *with* the inline method call and the JVM is spared of the oevrhead that is incurred in regular dynamic method calls.


## Type Inference with the Var Keyword

The `var` keyword, when an object is instantiated using it, always consideres it's superclass rather than the class of the object.
If we do something like this:
```java
var variable = new SubclassConstructor();
```
This would result in the type inference to be of `Superclass`. If we do this:
```java
Subclass subclass = new SubclassConstructor();
var variable = subclass;
```
This *should* result in the type inference of the `Subclass` datatype.


## The Object Class

There is only one superior, special class - Object. This is the class that *every* other Java class inherits implicitly. The method it defines is available for every other object possible in the language:
- Object clone(): Clones an object. Used to separate reference. Like Python's copy().
- boolean equals(Object object): Checks equality.
- void wait()
- void notify()
- void notifyAll()
- Class<?> getClass(): Obtains class of an object at runtime. Similar to type() in Python.
- String toString(): Returns a String that describes an object. this method is automatically called when print functions are being used. This method is overriden by most classes on whose objects it is invoked.
- int hashCode(): returns the hashcode of the invoking object.


## Programs

1. `SimpleInheritance.java`: This shows basic inheritance and how the subclasss has access to *every* public or default methods and members of the superclass.
1. `SuperclassSubclassReferenceInheritance.java`: This illustrates the necessity of having empty parent class constructors as well as the fact that parent class objects may have reference to a subclass object.
1. `SuperForConstructorInheritance.java`: This shows the behaviour of the super keyword by calling the superclass constructors from the subclass.
1. `DynamicMethodDispatchInheritance.java`: This illustrates method overriding and dynamic method dispatch.
1. `AbstractInheritance.java`: This shows abstract and concrete methods within abstract classes. Basically an improvement on the design of the previous program.
1. `Box.java`: Common helper class to illustrate inheritance.
