# The Builder Pattern

This is a Creational GoF pattern that *provides a way for an object with multiple customisable specifications to get created without improper design*. A class is devoted exclusively to serve as the warden to handle all customisations to the object that is actually wanted. Such a class is called the *Builder* class.


## Requirements

A real-life situation of a character designer in an RPG is assumed for the example to this pattern. Here are the requisites:
1. Builder class to encapsulate all character traits.
1. Main class whose object is to be built with the information provided by the builder class.
1. Helper classes that would store the properties needed by the builder class.
1. Helper enums that would enumerate the possible properties needed by the builder class (optional).<br />
The character class members should be private because that is how it would be in a real game that would incorporate much more methods and functionalities in it's source file. Without all those required methods, it would just be flaws hinted at by the linter. To do away with those errors, fields aren't made private.


## Pros

- Limits the Constructor Telescoping Anti-Pattern.
- Generated user-objects can be thread-safe.
- Creation of objects actually becomes more intuitive and comprehensive, unlike most other patterns, even for new developers.


## Cons

- It uses too much of code just to solve a simple issue.
- Simpler versions of the pattern with much less code can be used to solve most problems with greater simplicities.


## Programs

1. `Hero.java`: The main class whose object is to be created.
1. `CharacterBuilder.java`: The builder class and a set of other helper classes that would aim in character creation.
1. `CharacterCreator.java`: The runner class that would put everything into action as well.
1. `Weapon.java`: Enum to store the weapon types.
1. `Class.java`: Enum to store the classes that can be chosen.
1. `EyeColour.java`": Enum to store all possible eye colours.