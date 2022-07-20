## Multithreading

This section covers the Java architecture of Multithreading in detail and explains all the cases involving the use of various methods, used conventions, etc.
Multithreading utilizes the principles of concurrency within systems to make efficient use of system's resources without taking up more time and making the system perform synchronously. Threads are lightweight processes sharing code, files and CPU time among themselves.


## Techniques

The traditional multithreading process in Java can be employed using two methods:
- Extend the thread class
- Implement the Runnable interface.
The latter is always recommended since *programmatically* we only extend/ override if we are to make any enhancements to an existing solution, not plainly use it. Moreover, we can extend only one class in Java and implement many. So implementing makes the class available for further use.
The class implementing or extending is said to represent the independent, asynchronous thread.
We catch InterruptedExceptions in case Thread is involved.


## The Main Thread

The main thread is the thread running the main method in every program. It is an implied thread.
The main thread is expected to exit after all the other threads have finished running.
Best practices may dictate that all the other threads should be first joined before the main thread is allowed to end.


## Synchronization

For two/ more threads seeking the same shared CPU resource, there needs to be a mechanism to ensure that the resource gets handled by just one thread at a time, otherwise a single resource would exist in more than one state, which is impossible. A *monitor* is an object that acts as a mutually exclusive lock. A thread interacting with a resource possesses the lock and acquires the monitor. None else can possess it until the monitor is let go. There are two methods for this:
- Synchronized methods
- Synchronized statements



## Thread Class Methods

- start(): Starts a thread
- join(): Makes the currently running thread wait for the completion of the thread that calls this method.
- isAlive(): Returns true if a certain thread is active and running.
- getPriority(): Returns the priority of the thread. Higher it is, the more is its preference of execution with respect to the CPU.
- setPriority(): Allows us to give a priority to a thread from 1 to 10.


## Runnable Interface Methods

- run(): Describe the activity of the thread.
- getValue(): Make the thread return a certain value particular to its own execution.