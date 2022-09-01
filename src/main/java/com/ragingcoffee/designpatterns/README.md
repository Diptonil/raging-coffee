# Design Patterns

This directory deals with the general and most commonly used patterns used in software development (that is not just specific to Java but other languages as well).<br />
The topic might seem redundant at first but there are certain policies and processes of thoughts that help us program more efficiently. We might be able to understand the significance of proper software design if we take a classic example that has been shown below.


## The Classic Introductory Design Problem

The problem is to construct a design that represents ducks. There are various types of ducks: Mallards, Redheads (even plastic and wooden ducks! Despite the silliness, the nuance to the problem is brought in to this problem by this example itself). We need to represent them as components in a program or application with the promise of most succinct and reusable code that is optimally written. We assume that we are not assigning any sort of magnitude or type to the behaviour of quacking or flying, as of now (no dependent attributes).<br />
**SOLUTION 1**: Design a superclass `Duck` that describes all their common features as behaviours like `fly()` and `quack()`. Design other types of ducks (`MallardDuck`, `RedheadedDuck`) as subclasses to it. **FLAW**: `PlasticDuck` cannot fly and `WoodenDuck` can neither fly nor quack.<br />
**SOLUTION 2**: Override `fly()` and `quack()` in the required classes to do nothing. **FLAW**: The behaviour of `fly()` still technically exists in these classes even if they are nullified. Moreover, this would be a bad practice of overriding.<br />
**SOLUTION 3**: Create `Flyable` and `Quackable` interfaces. Implement these to the duck classes that fly or quack accordingly. **FLAW**: Too many methods in total to override, resulting in code duplication for i=similar instances. A better approach may yet be found...<br />
**SOLUTION 4**: Repeat the previous solution with `default` methods in interfaces. This would considerably decrease repetitive code. This is a fairly optimal solution. But there can be more.


## Patterns Covered

- Gand of Four Patterns
  - Class Patterns
    - [ ] Singleton
  - Object Patterns
    - 
- 
