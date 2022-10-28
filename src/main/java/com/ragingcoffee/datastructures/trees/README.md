# Trees

A tree is a data structure that can be used to represent heirarchial relationships between data elements in order of a certain precedence. These data items have no linear linkages. The data structure may be visualized as a family-tree. It might have any number of children nodes. In other words, it is a rooted directional graph.


## Terminology

To understand trees completely, exposure to graphs and Graph Theory is needed since Trees can be referred to as a special form of graph. However, a basic understanding and a broad overview rather than an in-depth knowledge shall suffice.
1. Node: The space where data gets stored.
1. Root: The first node that has no parent.
1. Child: The successor nodes of a particular node.
1. Parent: The predecessor node of a particular node.
1. Depth: The number of levels in which the nodes are kept, with root starting at level 1 (relative - see note below).
1. Subtree Height: The number of edges leading back to the root from the youngest (bottom-most) child node in the subtree.
1. Binary Tree: A tree whose every node has either one, two or no child nodes.
1. Skewed Tree: A tree in which every node either has a continued chain of unisuccessive left or right child nodes. Both are not allowed.
1. Balanced Binary Tree: Tree for which the difference between the left and right subtree heights is less than or equal to one.


## Controversial Definitions of Level, Height, Depth...

Many reputed sources of addressing this topic are conflicting in their definitions of certain tree terminologies. Some definitions assume the root node to be kept at a level of 0, while some assume it to be 1. There is no standard definition that has been unanimously agreed upon. <br />
There is a similar disagreement between definitions of the natural numbers; most texts define that 0 is the first natural number, some say 1 is. In practice, this creates almost no problems because either the definition is stated before it is used, or you can work out from the context which definition is being used, or it's used in a context where it makes no difference. <br />
Bottomline is that the answer depends on the context. If problem-solving is involved, it is best to first ask the personnel who is tasked with querying what exactly they mean by such terms of level, height, depth, etc.<br />
In further discussion, root starts at level 1 in the case of this project.


## Programs

1. `Tree.java`: Representation of a simple tree node.
1. `RecursiveTraversals.java`: Traversing a node in inorder, postorder and preorder techniques using recursion.
1. `IterativeTraversals.java`: Traversing a node in inorder, postorder and preorder techniques using iteration.
1. `MaximumDepth.java`: Recursively finding the maximum depth of tree by using the simple recurrence of `1 + max(depth(root.left), depth(root.right))`. If the root happens to be null, 0 is returned. If not, the left and right subtrees are traversed down. Obviously, the depth of that node would correspond to the maximum value of the left or right traversals that could be made.
1. `BalancedTree.java`: Finds if a binary tree is balanced or not using bottom up (depth-first search) and top down approaches. Top-down approach checks continuously if the left and right subtrees to the root node AND the left subtree root node AND the right subtree root node (in the recurrence relation) evaluate to give a net result of 1 or less (as stated by the definition). This process gives a O(N^2) complexity and is not recommended. The DFS technique gives a negative result as soon as a condition violating the definition is found, without branching further into the recursions. This makes the process faster and also gives a linear time complexity.