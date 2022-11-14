# Recursion

- In this section, certain ways and techniques to make recursion more intuitive and obvious would be explored.
- It is basically the technique of calling a function from within itself. This would lead to a continuous chain of calling. This would be similar to an infinite loop and since functions are concerned, each call would place them in the Function Call Stack. This would lead to a StackOverflow. To avoid the uncontrolled spiral of function calls, we use a base case. This can be verified using Debugger.
- A base case is a simple `if` statement that decides when to return, and therfore pop the function from the Call Stack. It basically tells the recursion process when to stop.
- The recursive statement or the recursive call refers to that line of code that makes the recursion happen. This is the statemnet that we shall analyse in the Recursion Tree.
- The recommended approach for solving recursion is to take a pen and paper and look at the dry run of the program.
- The most important thing to do would be to draw a Recursion Tree. It is a tool that helps us visualize recursion by examining each step of it. First we go deep by dry-running every recursive statement. We continue going into the heirarchy unless we reach the base case. After extracting value from the base case, we start coming out sequentially until we have solved all the subproblems and are left with none.


## The Divide and Conquer Approach

- This is a problem-solving technique that should NOT necessarily be understood as some generalized code boilerplate or paradigm but should only be understood in it's philosophy.
- In this process we divide a particular problem into two fragments and repeatedly continue to break up the fragments into two more subproblems. The base case is reached when the subproblems cannot be further divided. In that case, the required operation is done on it and the fragments are all, sequentially and repeatedly merged back into one final block that corresponds to the solution.
- The stages can be divided into DIVIDE, CONQUER & COMBINE.
- The best allusion to understand is the Merge Sort algorithm that encapsulated the crux of this algorithm without straying from the nuances.
- Examples would be Merge Sort, Quick Sort, Karatsuba's Algorithm , Stressen's Algorithm, etc.
- While it cannot and should not be generalized, a few common implementations tend to have O(nlog(n)) complexity. It uses recursion in those implementations.
- Binary Search is NOT a divide and conquer algorithm implementation.


## Parameterized and Functional Recursion

**Parameterized recursive functions** are those that take the desired value that we ultimately need as a secondary parameter. Oftentimes, such functions can be used to simplify complex approaches. Such functions are, at times, unable to return some values and can be good for printing or calling some other function. <br />
**Functional recursive functions** exist to strictly take an input value as a paremeter and return the output value. There is no intermediate secondary parameter that exists in its method signature. Sometimes, proceeding with this technique might be difficult or induce complexities. This works well, however, for succinct and easy problems. While solving a problem, this method should be given more preference since it leads to more standard approaches.


## Common Problems

- **Fibonacci Sequence**
    - Classic implementation is noted here: recursive function definition, base case definition, recursive call.
    - It finds the nth Fibonacci term in series: 0, 1, 1, 2, 3, 5, 8...
    - Follows the formula of *previous term* + *the term before*, if greater than 1 or 0.
- **Number Factor**
    - Adding more to the classic implementation. The section of recursive calls is made more extensive with functionality.
    - It finds only the possible occurences of sum sequences having 1, 3 or 4.
    - The number should be `number = 1x + 3y + 4z`, where we need to find all occurences of `(x, y, z)`, even with 0s.
- **House Robber**
    - In recursive call step we get the two possibilities: if the currently considered house is being robbed, in which case the next house to be robbed can be eligible from the alternate house. If the currently considered house is not being robbed, the adjacent house may be robbed next.
    - This solution using recursion is quite inefficient. We use dynamic programming to decrease the number of calls made to solve the same subproblem.


## Programs

It is recommended to go through the programs sequentially for ease in learning:
1. `Factorial.java`: The classic recursive impementation of factorial.
1. `SumOfN.java`: Recursively calculate sum of first *n* natural numbers.
1. `CountZeroes.java`: Recursively count the number of zeroes.
1. `FibonacciNumber.java`: Recursively find the Fibonacci number in the sequence at a given position.
1. `ReverseArray.java`: Recursively reverse an array.
1. `PalindromeString.java`: Recursively check if a String is palindrome.
1. `NumberReversal.java`: Various recursive implementations to find reverse of a number.
1. `NumberFactor.java`: Recursively find multiples of 1, 3 and 4 that sum up to the number.
1. `HouseRobber.java`: Recursively find the maximum profit that may be gained by a robber given the condition that he isn't allowed to rob adjacent houses.