# Dynamic Programming

Dynamic Programming is a problem-solving paradigm that can be employed to solve a given problem that can be divided into sub-problems such that the sub-problem that has already been solved before (overlapping sub-problems) are not recalculated. <br />
It can be said to be an optimization over plain recursion. When a recursive solution has repeated calls for any given input, we can stop all those calls from ever happening in dynamic programming. The tradeoff in achieving speed in this case is space. <br />
The idea is to store the results of sub-problems so that recomputations of the same values, in case of repetition, can be avoided. <br />
**Memoization** is the process of storing the value of the overlapping sub-problems so as to avoid recomputation.


## Techniques

A problem that can be solved using dynamic programming might be solved using techniques of recursion as well. The only problem with that approach is that it becomes unnecessarily unintuitive. Moreover, a recursive solution may take O(2^n) time complexity while the dynamic programming solution would take O(n) time complexity. Both take the same space complexity of O(n).
1. **Bottom-Up**: Supposing we need to solve a problem for *n*, we start off by storing solutions for smaller values, gradually building up to *n*. This is the preferred approach here. 
1. **Top-Down**: Supposing we need to solve a problem for *n*, we start off at *n* and gradually break down the problem into smaller steps and reach the lowermost granular solution, which we use to construct the solution for *n*.


## Recognizing a Dynamic Programing Problem

There are many problems that we might apply this approach. However, it is worth knowing the patterns to quickly conclude on the best technique to do something. If we see something like these, we first go for the **recursive** approach before thinking about dynamic programming, since a lot of it is actually based on being able to apply the formula of the recurrence relation:
- Exploring/ count *all possible ways* to accomplish something.
- Choose the best/ worst scenario after evaluating *all possible ways*. <br />
We go for the recursive approach just to find the recurrence relation that we have to use to formulate the statement to complete the data structure that we use for memoization.


## Programs

1. `FibonacciNumber.java`: Finding out Fibonacci numbers.
1. `StaircaseProblem.java`: Finding out the total number of ways to climb a staircase, accepting the number of stairs as input, if we can climb either one or two steps at a time. Upon close observation, it can be concluded as a minor variation on the Fibonacci sequence.
1. `EnergyLossOfFrog.java`: 