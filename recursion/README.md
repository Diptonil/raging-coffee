# Recursion

- In this section, certain ways and techniques to make recursion more intuitive and obvious would be explored.
- It is basically the technique of calling a function from within itself. This would lead to a continuous chain of calling. This would be similar to an infinite loop and since functions are concerned, each call would place them in the Function Call Stack. This would lead to a StackOverflow. To avoid the uncontrolled spiral of function calls, we use a base case. This can be verified using Debugger.
- A base case is a simple `if` statement that decides when to return, and therfore pop the function from the Call Stack. It basically tells the recursion process when to stop.
- The recursive statement or the recursive call refers to that line of code that makes the recursion happen. This is the statemnet that we shall analyse in the Recursion Tree.
- The recommended approach for solving recursion is to take a pen and paper and look at the dry run of the program.
- The most important thing to do would be to draw a Recursion Tree. It is a tool that helps us visualize recursion by examining each step of it. First we go deep by dry-running every recursive statement. We continue going into the heirarchy unless we reach the base case. After extracting value from the base case, we start coming out sequentially until we have solved all the subproblems and are left with none.


## Programs

1. `Factorial.java`: The classic recursive impementation of factorial.
1. `NumberReversal.java`: Various recursive implementations to find reverse of a number.
1. `CountZeroes.java`: Recursively count the number of zeroes.