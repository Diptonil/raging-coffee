# Design Principles

Certain design principles are used globally to drive structure and cleanliness of code that enhances the architecture and ease of implementation. The design principles listed below apply to many different design patterns and are considered to be guidelines (that would not always be enforcable for all patterns) that are to be kept in mind while adopting a design.


## Single Responsibility Principle (SRP)

- **DEFINITION**: To put it simply, *each class should have a single coherent responsibility that is well-defined and not more*. This rule is also a fundamental tenet in writing clean, production-level code.<br />
Every class must have only one job so that the behaviour of objects can be restricted. This makes the purpose of an object clear and code becomes more succinct. For example, an object responsible to manipulate certain text elements should not have the responsibility of convert those text elements into some other forms as well.
- **FLAWS**: In some cases, however, it is logically desirable to define a similar behaviour under a same class (if a certain class seems to be a certain data structure or some similar use-case). In such cases, SRP is not the way to go.
- **CONCLUSION**: It is just a design technique that can yield good results in MOST cases by making code succinct but it might not always be a good choice.
- **VIOLATIONS**: The Singleton pattern lies in a clear conflict to this rule.


## Coupling

- **DEFINITION**: Coupling refers to the degree of direct knowledge that one element has of another. In other words, how often do changes in class A force related changes in class B. 
- **TIGHT COUPLING**: Tight coupling means the two classes often change together. In other words, if A knows more than it should about the way in which B was implemented, then A and B are tightly coupled. This concept is used in Remote Method Invocation.
- **LOOSE COUPLING**: Loose coupling means they are mostly independent. If the only knowledge that class A has about class B, is what class B has exposed through its interface, then class A and class B are said to be loosely coupled.
- Both are good in their own ways. Tight Coupling is more easy, readable in case of client side coding and API use. Loose coupling is a better design strategy if used for development of services and APIs for programmers to use.


## Remote Method Invokation