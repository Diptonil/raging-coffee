# Linked Lists

A linked list is a linear data structure that has no bounds (ideally) and in which data is contained in a node chained to one another. The data stored may not be contiguous in the heap.


## Terminologies

1. Node: The space where data gets stored.
1. Link: The connection that a node has to any other node is established when a link of a node points to another node.
1. Head: The first node that marks the start of the linked list.
1. Tail: The last node that marks the end of the list.<br />
**NOTE**: In certain implementations, the head is referred to as the first node containing a value and in others it is referred to as the node that has no value but points to the first valued node in the list. Both implementations are correct and there is no general correct answer to this.<br />
In our case, we assume that the first valued element itself is the head.


## Pros

1. No size boundaries as in case of arrays.
1. Insertion or deletion of nodes at certain points are easier as compared to arrays.
1. Prior knowledge of sizes are not necessary.


## Cons

1. Direct indexed addressing is not possible. There are no indexes here.
1. The links take up some extra space that is not the case with arrays.


## Implementations

- Some lists require a tail to exist as a separate reference. This makes it easier for us in the long run in case of backward insertions due to the O(1) time complexity advantage.
- Some lists have an empty head and some have a valued head.
- Some lists have size restrictions imposed on them.
- Most problems have a varying implementation of linked list out there.


## Programs

1. `Node.java`: Representation of a simple single and circular linked list node.
1. `DoubleLinkNode.java`: Representation of a simple doubly linked list node.
1. `SinglyLinkedList.java`: Representation of a singly linked list.