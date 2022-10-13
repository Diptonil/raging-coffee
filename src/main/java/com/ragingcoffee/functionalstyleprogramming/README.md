# Functional Style Programming in Java

For years, Java has followed a greatly imperative style of programming - it dots all the 'I's and crosses all the 'T's, requires programmers to hardcode every minor detail and step for it to execute correctly. Such code often recieves a lot of flak (especially in Java more than any other Object Oriented Languages due to it relying on a structure completely composed of classes) due to the added redundancy in details and verbosity. Programmers often look for more simpler and elegant solutions - a paradigm as strong as the OO approach but not having the imposed boilerplates. <br />
The declarative style of programming focusses on just *what* we want rather than *how* we want what we want. A difference between the two approaches can be seen in the example here where we need to find if we have an element "Chicago" in an array of Strings called `cities`:
- **Imperative approach**:
```java
boolean found = false;
for(String city : cities) {
if(city.equals("Chicago")) {
found = true;
break;
}
```
- **Declarative approach**:
```java
boolean found = cities.contains("Chicago");
```


## Observable Improvements in Declarative Style

- Shorter and cleaner code.
- Easier to understand and maintain.
- Abstraction is observed even more strongly. Iterative steps get resolved within the `contains()` method.
- Reduced chances of errors.


## Why Code in Functional Style?

It is important to note that Java is not (and never will quite be) a fully functional programming language like Haskell or Clojure. And that is good, in fact, since that is not what Java ever really promised to be when it was designed. Java can, however, support *functional style* programming, which is not strictly functional but can be structured in a manner to emulate that behaviour. Programmers may use the strengths of both paradigms to design their code. Whether people prefer that or not is a matter of opinion. This is just something that Java enables us to do from the advent of Java 8. <br />
Coding in Java using the general approach is simple but things may turn sour when large projects in Java need to be maintained. Looking at things and ensuring every small detail has been dealt with is challenging.


## Object Immutability

This means restricting an object from being changed in any way. It is an important rule in functional style programming because avoiding mutability we can create pure functions - that is, functions with no side effects. Java supports immutability in various parts of programming library APIs as well as with the use of the `final` keyword. <br />
A function without "side effects" is immutable and does not change its input or anything in its reach. The lack of side effects removes any concerns of race conditions or simultaneous updates. We can also easily parallelize execution of such functions. For example, Java's classical approach of multithreading is quite risky and overly complex to be used effectively. Making sure that it is error-prone is extremely tough. Race conditions might happen and break the functionality of a certain utlity in an app completely.


## Higher Order Functions

Technically, methods in Java are associated to objects and changing of states. They are always a dependent part of a class and hence are an important aspect in OOP. *Higher order functions* can pass, return and create functions within themselves. They do to functions what methods do to objects. The whole process of Java handling functions as arguments is achieved using *lambda expressions*.


## Anonymous Classes

To understand lambdas, we need insight into anonymous classes. 

