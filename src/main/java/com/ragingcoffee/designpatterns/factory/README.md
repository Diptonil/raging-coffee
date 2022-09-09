# The Factory Pattern

This is a Creational GoF pattern that *provides a static method encapsulated in a class to keep track of objects in the factory class*. This hides the implementation logic and makes the client code focus on usage rather than initializing new objects.


## Requirements

We must have, for applying this pattern, a few things in place as part of the procedure. They include:
- Related classes whose objects is to be created.
- Factory class to create the facilitate the object creation.
- Enum (optional) to identify what type of object is to be created (which class to create the object from).
- Interface to group the related classes together
- Consumers.<br />
We have explored this architecture using the example of a **coin manufacturing service**. In the example we see that the enum is redundant (the same functionality could be achieved with a String as well).<br />
**REMEMBER**: When using the object factory invokations by the consumers, if used the way it is supposed to be used, objects created will always be distinct.


## Pros

- Allows keeping all objects creation in one place and avoid of spreading 'new' keyword across codebase.
- Allows to write loosely coupled code. Some of its main advantages include better testability, easy-to-understand code, swappable components, scalability and isolated features.


## Cons

The code becomes more complicated than it should be.


## Programs

1. `Coin.java`: An interface grouping all the related classes and declaring their behaviours.
1. `CoinType.java`: An enum that defines all the types of coins that can be manufactured.
1. `CopperCoin.java`: A class that defines a coin made out of copper.
1. `SilverCoin.java`: A class that defines a coin made out of silver.
1. `GoldCoin.java`: A class that defines a coin made out of gold.
1. `CoinFactory.java`: The object factory class.
1. `Consumer.java`: The runner class for the whole experiment.