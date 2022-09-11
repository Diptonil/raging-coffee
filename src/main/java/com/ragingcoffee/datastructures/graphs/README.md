# Graphs

These are a form of data structures that are used to represent relationships between objects in a given situation. An example would be the network of friends on Facebook. It may or may not need to have any heirarchy (like trees). This data structure has no definite point of start and end.


## Basic Terms

- **Node**/**Vertex**: The data elements that are to be represented.
- **Edge**: The connections between two vertices.
- **Bridges**: Edges whose absence causes increase in components in a graph.
- **Cut Vertex/ Articulation Point**: Vertices whose absence causes increase in components in a graph.
- **Weights**: The cost associated to an edge between two vertices.
- **Negative Cycles**: Closed routes i which the sum of the weights is negative. These are undesirable in a graph.
- **Weighted graphs**: Graphs having edges that are weighted.
- **Sparse graphs**: Graphs having very less edges as compared to the vertices.
- **Dense graphs**: Graphs having multiple edges, almost interconnected completely.
- **Directed graphs**: Graphs having edges that can point from the source to destination and is not implied to have a back-connection (or point back).
- **Undirected graphs**: Graphs having edges that can point from the source to destination and is implied to have a back-connection (or point back).


## Representation of Graphs

There are many ways, with their each pros and cons, to represent a graph. Some are:
1. Adjacency Matrix:
- Represents a graph of *n* vertices as an *nxn* matrix with elements corresponding to the weight of the edges connecting the vertices. It is zero for same-element relations. It is infinite for vertices having no relations.
- Pros:
  - Space efficient to represent dense graphs.
  - Edge weight lookup is O(1).
  - Simple.
- Cons:
  - Space complexity in all cases is O(n^2) even if connections are less.
  - Wastage of space for sparse graphs.
  - Iteration over all edges require O(n^2) time complexity.
2. Adjacency List:
- Represents a graph by listing out all its vertices and assigning them lists to all the vertices the vertex in question is connected to (and by what weight).
- Pros:
  - Space efficient for sparse graphs.
  - Iteration over edges is more efficient.
- Cons:
  - Less space efficient for denser graphs.
  - Edge weight lookup is O(e), where *e* is the number of edges.
  - Complex.
3. Edge List:
- Represents a graph as an unordered list of edges assuming the notation of (source vertex, destination vertex, edge weight). It is seldom used.
- Pros:
  - Simple.
  - Iteration over both edges and vertices are easy.
  - Space efficient for sparse graphs.
- Cons:
  - Lacks structure to be flawlessly used in all algorithms.
  - Less space efficient for denser graphs.
  - Edge weight lookup is O(e), where *e* is the number of edges.


## Types of Problems

- **Connectivity**: These problems are concerned with if a said vertex is connected to a given vertex in any way. Can be solved using Depth First Search or Union Finding Technique.
- **Shortest Path to a Vertex**: These problems are concerned with finding the shortest sequence of edges to reach a particular given vertex. Can be solved using Bellman-Ford Algorithm, Floyd's Algorithm, Breadth First Search & Dijkstra's Algorithm.
- **Negative Cycles**: These problems are concerned with finding the negative cycles in a weighted graph. Can be solved using Bellman-Ford Algorithm or Floyd Warshall's Algorithm.
- **Strongly Connected Components**: Every vertex in a cycle should reach every other vertex in that same cycle for components to be strongly connected. Tarjan's and Kosaraju's Algorithm seek to accomplish this.
- **The Travelling Salesman Problem**: To find the minimal cost to traverse all the vertices in a graph and return to the same vertex. Branch and Bound algorithms, Approximation Algorithms and Held-Karp method can do this.
- **Bridge/ Cut Vertex Detection**: Bridges may hint at vulnerabilities, weak links or bottlenecks in a graph, so they need to be detected.
- **Minimum Spanning Tree**: It is a subset of the edges of a connected graph that connects to all the vertices in the least costly manner with no cycles. Prim's, Kruskal's and Boruvska's Algorithms can be used.
- **Network Flow**: It considers all the edges as networks with capacities through which flow of a certain entity is to be decides. We already have preordained sources and destinations. Dinic's Algorithm, Ford-Fulkerson's or Edmonds-Karp Algorithms may be used.


## Depth First Search

- Search algorithm used to explore vertices and edges of a graph with the use of a stack.
- When augmented with other major algorithm to solve complicated problems, it shines and is thus used as a building blcok for other algorithms.
- Runs with O(n + e) time complexity.
- Basically, it plunges into the graph and attempts to go in a downward exploratory fashion, not caring about any vertices lying ahead. If the depths have been explored, it backtracks and goes over to the next vertices.
- Can be used to find the number of components in a graph.


## Programs

1. `AdjacencyMatrix.java`: Multiple ways to accept and represent an adjacency matrix using a 2D array.