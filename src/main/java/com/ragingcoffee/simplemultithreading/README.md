# Multithreading

- This section covers the Java architecture of Multithreading in detail and explains all the cases involving the use of various methods, used conventions, etc.
- Multithreading utilizes the principles of concurrency within systems to make efficient use of system's resources without taking up more time and making the system perform synchronously. Threads are lightweight processes sharing code, files and CPU time among themselves.
- The Join/ Fork architecture is used these days over traditional multithreading using Runnable and Thread as desxcribed in java.lang.
- Multithreading is a concurrency technique that must be used minimally. In some cases when the use of threads is unreasonably extensive, it makes performance poor since there is an overhead in suspending, changing and resuming threads. It must be used minimally and wisely.


## Techniques

The traditional multithreading process in Java can be employed using two methods:
- **Extend the thread class.**
- **Implement the Runnable interface.**
The latter is always recommended since *programmatically* we only extend/ override if we are to make any enhancements to an existing solution, not plainly use it. Moreover, we can extend only one class in Java and implement many. So implementing makes the class available for further use.
The class implementing or extending is said to represent the independent, asynchronous thread.
We catch InterruptedExceptions in case Thread is involved.


## The Main Thread

The main thread is the thread running the main method in every program. It is an implied thread.
The main thread is expected to exit after all the other threads have finished running.
Best practices may dictate that all the other threads should be first joined before the main thread is allowed to end. This is expected to be done in every multithreading program.


## Synchronization

For two/ more threads seeking the same shared CPU resource, there needs to be a mechanism to ensure that the resource gets handled by just one thread at a time, otherwise a single resource would exist in more than one state, which is impossible. A *monitor* is an object that acts as a mutually exclusive lock. A thread interacting with a resource possesses the lock and acquires the monitor. None else can possess it until the monitor is let go. There are two methods for this:
- Synchronized methods
- Synchronized statements


## Thread Class Methods

- start(): Starts a thread.
- join(): Makes the currently running thread wait for the completion of the thread that invokes this method.
- isAlive(): Returns true if a certain thread is active and running.
- getPriority(): Returns the priority of the thread. Higher it is, the more is its preference of execution with respect to the CPU.
- setPriority(): Allows us to give a priority to a thread from 1 to 10.
- wait(): Locks entry and makes further threads wait and is useful in making suspend operations.
- notify(): Releases locks and is useful in making resume operations.
- notifyAll(): Releases all locks.
- getState(): Returns an enum constant stating the estimated thread state.
- resume(): Used to resume a thread (**DEPRECIATED**).
- suspend(): Used to pause a thread (**DEPRECIATED**).
- stop(): Used to permanently stop a thread (**DEPRECIATED**). These three operations can be done by applying wait() and notify() in a more standard way as described in `SuspendAndResumeThreads.java`.


## The State Enumeration

Within the Thread class, there is the State enumeration that has certain constants that give information about the supposed state of the thread on which the method getState() is invoked:
- Thread.State.BLOCKED: Thread that has suspended execution because it is waiting to acquire a lock.
- Thread.State.NEW: Thread just created and not started.
- Thread.State.RUNNABLE: Thread that is currently executing/ will execute upon gaining access to CPU.
- Thread.State.TERMINATED: Thread that has completed execution.
- Thread.State.WAITING: Thread waiting for an action to occur because of a call to wait() or join().
It is worth knowing that the way we program a thread with an intent might be perceived differently by the system. Therefore, this enumeration is never used for exact reports on thread state. It can be used as a benchmarking or a profiling tool instead of a solid condition.


## Runnable Interface Methods

- run(): Describe the activity of the thread.
- getValue(): Make the thread return a certain value particular to its own execution.


## Programs

1. `ImplementingThreads.java`: We implement the Runnable interface to run a simple thread. This is the preferred standard.
1. `InheritingThreads.java`: We inherit the Thread interface to run a simple thread. This *isn't* the preferred standard.
1. `JoiningThreads.java`: We accomplish proper closure of the main thread by joining the other threads with it to signal their end. this allows the main method to end properly.
1. `MultipleThreads.java`: We concurrently run multiple threads.
1. `SuspendAndResumeThreads.java`: We include pause and resume functionality in threads the standard way (using wait() and notify()) instead of the depreciated ways.
1. `SynchronizedMethodThreads.java`: We use a synchronized method to sync threads.
1. `SynchronizedStatementThreads.java`: We use a synchronized keyword to sync threads.
1. `ValueReturningThreads.java`: We use a thread to return a value on which other threads are dependent.
1. `WaitingThreads.java`: We use the wait() function to achieve concurrent synchronization correctly.