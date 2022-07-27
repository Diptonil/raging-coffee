# Interfaces

- Interfaces in Java is one of the prime ways of how abstraction is implemented. It is basically a template structure layout given for accomplishing a particular task by adhering to the structure of that template as specified.
- It is similar to abstract classes but unlike classes, multiple interfaces may be implemented for one particular class.
- It specifies to the programmers as to 'what' to do to solve a problem. the details of 'how' to do is left to the programmers.
- They have no instance variables. However, variables declared within the interface is by default static and final.
- Declared methods are not allowed to have bodies (lot like abstract methods).
- In recent interfaces, it is possible to add *some* behavior. Interface methods can be static, private, etc. This, personally, is a bit undesirable and thus for the most part, interfaces here would adhere to its traditional form.
- Methods that implement interfaces should be declared public (in the class using the interface).
- For some reason, we need to put braces for static interface methods. Semicolons are accepted for all other cases.


## Programs

1. `SimpleInterfacing.java`: The use of simple interfaces are shown here in which there are 2 interface methods - one static and one non-static.
1. 