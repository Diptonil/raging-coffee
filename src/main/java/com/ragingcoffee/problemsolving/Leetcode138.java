package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/copy-list-with-random-pointer/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public final class Leetcode138 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node trav = head;
        while (trav.next != null) {
            Node newNode = new Node(trav.val);
            newNode.next = trav.next;
            newNode.random = null;
            trav.next = newNode;
            trav = trav.next.next;
        }
        Node newNode = new Node(trav.val);
        newNode.next = trav.next;
        newNode.random = null;
        trav.next = newNode;
        
        trav = head;
        while (trav != null && trav.next != null) {
            if (trav.random != null) {
                trav.next.random = trav.random.next;
            } else {
                trav.next.random = null;
            }
            trav = trav.next.next;
        }
        
        trav = head;
        Node result = new Node(0);
        Node resultTrav = result;
        while (head != null && head.next != null) {
            resultTrav.next = head.next;
            resultTrav = resultTrav.next;
            head.next = head.next.next;
            head = head.next;
        }
        return result.next;
    }
}
