# Interfaces

- Interfaces in Java is one of the prime ways of how abstraction is implemented. It is basically a template structure layout given for accomplishing a particular task by adhering to the structure of that template as specified.
- It is similar to abstract classes but unlike classes, multiple interfaces may be implemented for one particular class.
- It specifies to the programmers as to 'what' to do to solve a problem. the details of 'how' to do is left to the programmers.
- They have no instance variables. However, variables declared within the interface is by default static and final.
- Declared methods are not allowed to have bodies (lot like abstract methods).
- In recent interfaces, it is possible to predefine *some* behavior. Interface methods can be static, private, etc. This, personally, is a bit undesirable and thus for the most part, interfaces here would adhere to its traditional form.
- Methods that implement interfaces should be declared public (in the class using the interface).
- For some reason, we need to put braces for static interface methods. Semicolons are accepted for all other cases. Refer to program 1.
- Extending interfaces is possible. It works similar to class inheritance. Should be used in a lightweight and simple manner.
- The standard convention is:
    `<access-modifier> class [extends superclass] [implements interface1, interface2, interface3...]`


## Interface References

Suppose class `Class` implements `Interface`. We can, in another class (or the same class), create an interface reference that creates a class object as so:
    ```java
    Interface object = new Class(int anyParameters);
    object.methodImplemented()
    ```
**NOTE**: The `methodImplemented()` needs to compulsorily be the method that is implemented from the interface. Any other classs methods not implemented are not allowed. Create a regular class object for those in need be. This also means that since the class is abstract, it cannot be instantiated. Hence the interface methods need to be static, if such a use case is required.


## Incomplete Use of an Interface

It is not a compulsion to use all methods of an interface. In such cases, however, the class implementing the interface should be declared abstract. Refer to program 2. This is a feature that doesn't make a lot of sense to me, in all honesty. I strongly feel that nested interfaces should be used as an alternative since this would require a lot of different types of interfaces to be built, since the abstract class cannot be instantiated if it does not make *complete* use of the interface.

Program 3 illustrates the workaround to use an interface incompletely - by *completely* using a nested interface within another interface. This allows class instantiation. This also lets the class be final. This allows a much cleaner and easy-to-understand abstraction.
**NOTE**: Interfaces may be nested within a class as well.


## Defining Constants

There are two conventional ways to define Java constants:
- Use of final variables.
- Use of interfaces containing just variables.
It is convention that if an interface is containing certain variables, those are constants and may not be altered. An example has been shown in program 4.


## Default (Extension) Methods

- The release of JDK 8 brought forth a new option that was to be able to define interfaces by specifying *some* default behaviour in advance. This somewhat goes against the traditional forms of the interface that did not allow any body.
- This addition somewhat undermines the classic reason for using interfaces because it makes it very similar to abstract classes. And as such the functionality and reason of existence becomes interchangeable (unless I am missing some point here). I'd rather use this than abstract classes, personally.
- The only motivation I find to use this feature is to replace abstract classes completely because in that way we can instantiate classes more and use interfaces with default methods.
- One of the reasons why such a change was considered is because of the the feature that an interface has to be used up completely. This made addition of newer methods to popular and largely used interfaces difficult since a lot of production code already worked fine with previous implementations of interfaces. Any additions would completely break the code if it adopted to future releases.
- Default methods are optional to be used. This makes interfaces much more flexible and impressive.
- The key difference between abstract classes and interfaces is still the fact that interfaces are responsible with specifying type of information and not state. That is something that only classes can do. So the addition of default methods does not violate the design principle of using interfaces to *specify the what* and **not** to *specify the how*.
- Default methods need method bodies and not semicolons (like static interface methods).


## Private Interface Methods

- This is a feature that is utterly useless on its own. This only finds use to complement Extension Methods in Java.
- The idea is to have a method with code specification (like a default method) such that its use case is only limited to only calls by other default interface methods.
- It is `default` by default (it is implied that it contains code).
- Being private, such interfaces can obviously never externally used by any implementing class.
- This is a very trivial topic with respect to classical interfacing. However, it is helpful if certain advantages are to be availed that the current features of interfaces provides.
- This is a powerful feature only if we have some moderate logic in default methods that get reused in multiple default methods. Or it can be used to decrease the lines of code in a particular default method (as recommended by Robert C. Martin in his Clean Code).


## Programs

1. `SimpleInterfacingApplication.java`: The use of simple interfaces is shown here in which there are 2 interface methods - one static and one non-static.
1. `IncompleteInterfacingApplication.java`: The principle behind this program is that if a class implements an interface and does not use all the methods declared in the interface, that class must compulsorily be declared abstract.
1. `NestedInterfacingApplication.java`: The use of nested interfaces is shown here. The example taken clearly shows how nested interfaces may circumvent the issues that get created when an interface is to be incompletely used by a class.
1. `ConstantInterfacingApplication.java`: The use of variables (used as constants) in interfaces is shown by taking an example of an interface that defines constants that are used for switch-case decision making. The use of `final` keyword wasn't necessary for the fields in the interface but has been used to maintain constant conventions.
1. `ExtendedInterfacingApplication.java`: The use of `extend` is highlighted here.
1. `DefaultInterfacingApplication.java`: The use of default methods in interfaces is highlighted here.
