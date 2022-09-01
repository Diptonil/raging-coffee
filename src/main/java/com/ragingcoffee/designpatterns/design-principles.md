# Design Principles

Certain design principles are used globally to drive structure and cleanliness of code that enhances the architecture and ease of implementation. The design principles listed below apply to many different design patterns and are considered to be guidelines (that would not always be enforcable for all patterns) that are to be kept in mind while adopting a design.


## Single Responsibility Principle (SRP)

- **DEFINITION**: To put it simply, *each class should have a single coherent responsibility that is well-defined and not more*. This rule is also a fundamental tenet in writing clean, production-level code.<br />
Every class must have only one job so that the behaviour of objects can be restricted. This makes the purpose of an object clear and code becomes more succinct. For example, an object responsible to manipulate certain text elements should not have the responsibility of convert those text elements into some other forms as well.
- **FLAWS**: In some cases, however, it is logically desirable to define a similar behaviour under a same class (if a certain class seems to be a certain data structure or some similar use-case). In such cases, SRP is not the way to go.
- **CONCLUSION**: It is just a design technique that can yield good results in MOST cases by making code succinct but it might not always be a good choice.
- **VIOLATIONS**: The Singleton pattern lies in a clear conflict to this rule.