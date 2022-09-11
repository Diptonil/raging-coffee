package com.ragingcoffee.datastructures.graphs;

import java.util.Scanner;

public final class AdjacencyMatrix {

    private static int[][] graph;
    private static int vertices;

    static void addDirectedEdge(int source, int destination, int weight) {
        graph[source][destination] = weight;
    }

    static void removeDirectedEdge(int source, int destination) {
        if (source == destination) {
            graph[source][destination] = 0;
            return;
        }
        graph[source][destination] = Integer.MAX_VALUE;
    }

    static void addUndirectedEdge(int source, int destination, int weight) {
        graph[source][destination] = graph[destination][source] = weight;
    }

    static void removeUndirectedEdge(int source, int destination) {
        if (source == destination) {
            graph[source][destination] = 0;
            return;
        }
        graph[source][destination] = graph[destination][source] = Integer.MAX_VALUE;
    }

    static void setGraph() {
        Scanner scanner = new Scanner(System.in);
        int inner_iterator, outer_iterator;

        System.out.println("Enter adjancency matrix: ");

        for (outer_iterator = 0; outer_iterator < vertices; outer_iterator ++) {
            for (inner_iterator = 0; inner_iterator < vertices; inner_iterator ++) {
                graph[outer_iterator][inner_iterator] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    static void getGraph() {
        int inner_iterator, outer_iterator;

        System.out.println("The adjancency matrix: ");

        for (outer_iterator = 0; outer_iterator < vertices; outer_iterator ++) {
            for (inner_iterator = 0; inner_iterator < vertices; inner_iterator ++) {
                System.out.print(graph[outer_iterator][inner_iterator] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        vertices = scanner.nextInt();
        scanner.close();

        graph = new int[vertices][vertices];

        setGraph();
        addDirectedEdge(0, vertices / 2, 69);
        addDirectedEdge(vertices / 2, vertices - 1, 420);
        removeDirectedEdge(0, vertices / 2);
        getGraph();
    }
}
