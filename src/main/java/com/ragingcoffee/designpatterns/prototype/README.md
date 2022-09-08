# Prototype Pattern

This is a Creational GoF pattern that *allows us to use a copy of an object distinctively by making a few alterations to it to support our use-case*. This is useful at times when the creation of objects from scratch would be a costly affair in terms of time. The philosophy of object cloning is used in this case.<br />
It must be remembered that this pattern can be applied to very specific instances or cases to actually enjoy certain optimizations and benefits.


## Cloning

Cloning is the standard way in Object Oriented Programming to replicate objects rather than resorting to create a new one to avoid the associated overhead. This can be done by:
- *Shallow Cloning*: The reference to the original object is retained by the cloned object. Therefore, any change to either of objects would result in a change in all the cloned and the original object(s).
- *Deep Cloning*: There is no relation between the cloned object and the original object. Both become independent of any changes and have different references.
- *Lazy Cloning*: It can be defined as a combination of both. The mechanism follows a simple approach – at the initial state, shallow copy approach is used. A counter is also used to keep a track on how many objects share the data. When the program wants to modify the original object, it checks whether the object is shared or not. If the object is shared, then the deep copy mechanism is initiated.<br />
**NOTE**: We must note that when it comes to immutables and primitives, there is no difference between deep and shallow cloning.


## Deep Cloning in Prototyping

The entire process of creation and instantiation of object takes a lot of time and resources. In case when we need an object similar to the one created before in a program, we go for this design pattern. Upon cloning, we may make some minor changes to readjust the cloned object to our specifications.<br />
We achieve cloning here by these steps:
1. Implement the `Cloneable` interface to override the `clone()` method.
1. Deep copy to clone the object.<br />
This behaviour has been shown in the `EmployeeCategoriser.java` file.


## The Factory API

This is the class whose objects get cloned. In `EmployeeCategoriser.java`, the `Employee` class was the factory API. In this pattern, instead of instantiating using the `new` keyword, we use the factory API to create all the objects. 


## Pros

- Reduced need to subclass.
- Reduced initialization. The clients can get new objects without knowing which type of object it will be.
- Single copy process using `clone()`.
- Reusability


## Cons

- Each subclass has to implement clone() methods or alternative copy methods.
- Building clones for existing classes may be complicated.
- Implementing Cloneable interface can constrain all subclasses/implementation to implement theclone() method (some class may not need).


## Programs

1. `ShallowCloningExample.java`: Illustrates shallow cloning. We notice that upon reassignment of the original object, the state of the cloned object changes.
1. `DeepCloningExample.java`: Illustrates deep cloning. We notice that upon reassignment of the original object, the state of the cloned object does not change.
1. `EmployeeCategoriser.java`: Shows example of a basic implementation of the Prototype pattern.