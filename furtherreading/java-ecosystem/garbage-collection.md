# Garbage Collection

Garbage Collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in-use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused object, or unreferenced object, is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed. <br />
In a programming language like C, allocating and deallocating memory is a manual process. In Java, process of deallocating memory is handled automatically by the garbage collector.


## Steps in Automatic Garbage Collection

1. **Marking**: This is the first phase in which the objects in the memory are all scanned and marked as either *being used* or *not being used*. Since all objects need to be scanned, this can be utterly time consuming.
1. **Deletion**: This phase removes unreferenced objects leaving referenced objects and pointers to free space.
    - **Normal Deletion**: This folows a basic deletion algorithm of just deleting an unused object as and when it is encountered. That area gets freed. The memory allocator holds *references to each and every block of free space where new object can be allocated*. This process, however, can be optimized.
    - **Deletion with Compacting**: As and when unreferenced objects are deleted, the in-use objects are shifted to a corner such that space can be compacted. This leaves *a part of the heap containing in-use objects and another part of the heap that is empty*, as opposed to periodic free and full areas in heap out of normal deletion. This requires overhead to shift memory. <br />
Whatever technique for deletion is used, it is excessively time consuming with associated overhead. Hence, we resort to empirical analysis to make further optimizations.


## JVM Generations

As stated earlier, having to mark and compact all the objects in a JVM is inefficient. As more and more objects are allocated, the list of objects grows and grows leading to longer and longer garbage collection time. However, empirical analysis of applications has shown that most objects are short lived. This gives way to a very important concept of JVM Generations. <br />
Theoretically, information learned from the object allocation behaviour can be used to enhance the performance of the JVM. Heap is broken up into 4 parts:
1. **Young Generation**
    - This is where all new objects are allocated and aged. When this fills up, *minor garbage collection* occurs. Minor collections can be optimized assuming a high object mortality rate.
    - Minor garbage collections are always Stop the World events. This means that all application threads are stopped until the operation completes.
1. **Survivor Space**: These are compartments that exist to segregate objects that should be garbage collected and those that should not be. They are referred to as S0, S1 and S2 for survivor space one, two and three.
1. **Old Generation**
    - This is used to store long surviving objects. Typically, a threshold is set for young generation object and when that age is met, the object gets moved here. Eventually, the old generation needs to be collected. This event is called a *major garbage collection*.
    - Major garbage collection are also Stop the World events.
    - Often a major collection is much slower because it involves all live objects.
    - So for Responsive applications, major garbage collections should be minimized.
1. **Permanent Generation**
    - This contains metadata required by the JVM to describe the classes and methods used in the application. It is populated by the JVM at runtime based on classes in use by the application. In addition, Java SE library classes and methods may be stored here.
    - Classes may get collected (unloaded) if the JVM finds they are no longer needed and space may be needed for other classes.
    - The permanent generation is included in a full garbage collection.


## Generational Garbage Collection

This is the optimized model of garbage collection that is generally followed. The whole process can be summarized as:
- New objects get allocated to the *Eden Space*.
- Minor Garbage Collection is triggered when the *Eden Space* fills up.
- Referenced objects are moved to the first survivor space. Unreferenced objects are deleted when the eden space is cleared.
- At the next minor GC, the same thing happens for the eden space. Unreferenced objects are deleted and referenced objects are moved to a survivor space. However, in this case, they are moved to the second survivor space (S1). In addition, objects from the last minor GC on the first survivor space (S0) have their age incremented and get moved to S1. Once all surviving objects have been moved to S1, both S0 and eden are cleared. Notice we now have differently aged object in the survivor space.
- At the next minor GC, the same process repeats. However this time the survivor spaces switch. Referenced objects are moved to S0. Surviving objects are aged. Eden and S1 are cleared.
- This slide demonstrates promotion. After a minor GC, when aged objects reach a certain age threshold they are promoted from young generation to old generation.
- As minor GCs continue to occure objects will continue to be promoted to the old generation space.
- So that pretty much covers the entire process with the young generation. Eventually, a major GC will be performed on the old generation which cleans up and compacts that space.


## Common Heap Related Switches

The switches that would be discussed here are not specific to Garbage Collection. It is specific to JVM. They provide certain specifications as to how the JVM should behave while running any program.
- `-Xms`: Sets the initial heap size for when the JVM starts.
- `-Xmx`: Sets the max heap size.
- `-Xmn`: Sets the size of the Young Generation.
- `-XX:PermSize`: Sets the starting size of the Permanent Generation.
- `-XX:MaxPermSize`: Sets the maximum size of the Permanent Generation.


## Serial Garbage Collector

The Serial GC is the garbage collector of choice for most applications that do not have low pause time requirements and run on client-style machines. It takes advantage of only a single virtual processor for garbage collection work (therefore, its name). Still, on today's hardware, the Serial GC can efficiently manage a lot of non-trivial applications with a few hundred MBs of Java heap, with relatively short worst-case pauses (around a couple of seconds for full garbage collections).


## Concurrent Mark Sweep Garbage Collector

The Concurrent Mark Sweep (CMS) collector (also referred to as the concurrent low pause collector) collects the tenured generation. It attempts to minimize the pauses due to garbage collection by doing most of the garbage collection work concurrently with the application threads. Normally the concurrent low pause collector does not copy or compact the live objects. A garbage collection is done without moving the live objects. If fragmentation becomes a problem, allocate a larger heap.


## G1 Parallel Garbage Collector

The Garbage First or G1 garbage collector is available in Java 7 and is designed to be the long term replacement for the CMS collector. The G1 collector is a parallel, concurrent, and incrementally compacting low-pause garbage collector that has quite a different layout from the other garbage collectors described previously.