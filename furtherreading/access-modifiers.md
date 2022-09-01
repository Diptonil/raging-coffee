# Access Modifiers in Java

Here we shall discuss the strucure of access modifiers and their effects and use cases with respect to subclasses, superclasses, methods, packages and data members.
**NOTE**: I am still yet to find any officially accurate source to distinguish between Access Modifiers and Access Specifiers. Hence I shall use the former terminology *with the assumption* that both mean the same.


## A Special Access Modifier: `final`
- It restricts methods from being inherited by subclasses.
- It restricts a class from becoming a superclass.


## Data Members: Same Package

- Imagine that class B subclasses class A. Class A has a private, a public, a protected and a default member.
  - The private member cannot be accessed.
  - The public, protected and default members can be accessed.
- Imagine that class C creates an object of class A.
  - The private member cannot be accessed.
  - The public, protected and default members can be accessed.


## Data Members: Different Packages

- Imagine that class B subclasses class A. Class A has a private, a public, a protected and a default member.
  - The private, default members cannot be accessed.
  - The public, protected members can be accessed.
- Imagine that class C creates an object of class A.
  - The private, default and protected members cannot be accessed.
  - The public member can be accessed. 
- **No imports are being used**. So when creating objects or inheriting, the class should be referenced as `packageName.className`.
  it is possible to work with or without imports. So contrary to belief, import is technically optional (but conventionally a must):
  ```java
  import java.util.*;
  class NewClass extends Date {
  }
  ```
  **OR**
  ```java
  class NewClass extends java.util.Date {
  }
  ```
  While importing, it is worth knowing that only subclasses can be used for imported classes or interfaces IF they are not public. If public, their objects may be liberally created.