## Multithreading

This section covers the Java architecture of Multithreading in detail and explains all the cases involving the use of various methods, used conventions, etc.


## Techniques

The traditional multithreading process in Java can be employed using two methods:
- Extend the thread class
- Implement the Runnable interface.
The latter is always recommended since *programmatically* we only extend/ override if we are to make any enhancements to an existing solution, not plainly use it. Moreover, we can extend only one class in Java and implement many. So implementing makes the class available for further use.
The class implementing or extending is said to represent the independent, asynchronous thread.
We catch InterruptedExceptions in case Thread is involved.


## Thread Class Methods

- start(): Starts a thread
- join(): Makes the currently running thread wait for the completion of the thread that calls this method.
- isAlive(): Returns true if a certain thread is active and running.
- getPriority(): Returns the priority of the thread. Higher it is, the more is its preference of execution with respect to the CPU.
- setPriority(): Allows us to give a priority to a thread from 1 to 10.


## Runnable Interface Methods

- run(): Describe the activity of the thread.
- getValue(): Make the thread return a certain value particular to its own execution.