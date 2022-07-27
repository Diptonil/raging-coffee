# The Divide and Conquer Approach

- Here we dive deep into the Divide and Conquer programming heuristic and analyse all the problems that it solves and how it is implemented.
- This is a programming technique that should NOT necessarily be understood as some generalized code boilerplate or paradigm but should only be understood in it's philosophy.
- In this process we divide a particular problem into two fragments and repeatedly continue to break up the fragments into two more subproblems. The base case is reached when the subproblems cannot be further divided. In that case, the required operation is done on it and the fragments are all, sequentially and repeatedly merged back into one final block that corresponds to the solution.
- The stages can be divided into DIVIDE, CONQUER & COMBINE.
- The best allusion to understand is the Merge Sort algorithm that encapsulated the crux of this algorithm without straying from the nuances.
- Examples would be Merge Sort, Quick Sort, Karatsuba's Algorithm , Stressen's Algorithm, etc.
- While it cannot and should not be generalized, a few common implementations tend to have O(nlog(n)) complexity. It uses recursion in those implementations.
- Binary Search is NOT a divide and conquer algorithm implementation.


## A Possible Strategy

During the Divide & Conquer algorithm, we may derive the recursive call statements by constructing a *this-or-that* tree. That gives us an idea of what to put in the recursive call statements and how to solve by divisions.


## Fibonacci Number

- Classic implementation is noted here: recursive function definition, base case definition, recursive call.
- It finds the nth Fibonacci term in series: 0, 1, 1, 2, 3, 5, 8...
  Follows the formula of *previous term* + *the term before*, if greater than 1 or 0.


## Number Factor

- Adding more to the classic implementation. The section of recursive calls is made more extensive with functionality.
- It finds only the possible occurences of sum sequences having 1, 3 or 4.
  The number should be `number = 1x + 3y + 4z`, where we need to find all occurences of `(x, y, z)`, even with 0s.


## House Robber

- In recursive call step we get the two possibilities: if the currently considered house is being robbed, in which case the next house to be robbed can be eligible from the alternate house. If the currently considered house is not being robbed, the adjacent house may be robbed next.