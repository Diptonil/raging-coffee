# Complete Usage of Certain Java Keywords

A keyword might have many associated uses that may vary from one context to another. Here we have the list of all keywords that are important and have varying uses. They have been elaborated on in the sections making use of them as well but here is the compilation (in no particular order):


## `final`

1. To declare the equivalent of a named constant.
1. To restrict a method from being overriden. A final method is opposite to that of an abstract method - overriding is illegal and gives compilation errors.
1. To restrict a class from being inherited. This imposes strict decisions on design choices and makes structure more elegant.
When a superclass' method becomes final, the compiler is spared of the overhead of deciding which method to call at the runtime. This makes way for inline method calls. Inlining happens when instead of runtime (as Java usually does), the method call is substituted at the compile-time with the code within the method. So the bytecode made ships *with* the inline method call and the JVM is spared of the oevrhead that is incurred in regular dynamic method calls.


## `abstract`

1. To declare classes abstract and make it known that the class contains methods that exist to be overriden.
1. To declare methods abstract and make it known that within an abstract class, these methods are meant to be overriden.
1. To declare classes that make incomplete use of interface methods. In any case, it cannot be final if this happens.
