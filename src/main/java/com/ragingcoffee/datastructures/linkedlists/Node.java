package com.ragingcoffee.datastructures.linkedlists;

public final class Node {

    public int value;
    public Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int value) {
        this.value = value;
        next = null;
    }

    Node() {
        next = null;
    }
}
