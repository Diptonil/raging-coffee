package com.ragingcoffee.datastructures.linkedlists;

public final class CircularLinkedList {
    
    private static Node head;
    private static Node tail;
    
    private static void insert(int value) {
        Node node = new Node(value, head);
        head = node;

        if(tail == null) {
            tail = head;
            head.next = head;
        } else {
            tail.next = node;
        }
    }

    private static void delete(int value) {
        Node traversingNode = head;
        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        if (tail.value == value) {
            traversingNode = head;
            while (traversingNode.next != tail) {
                traversingNode = traversingNode.next;
            }
            traversingNode.next = head;
            tail = traversingNode;
            return;
        }
        while (traversingNode != tail) {
            if (traversingNode.next.value == value) {
                traversingNode.next = traversingNode.next.next;
                break;
            }
            traversingNode = traversingNode.next;
        }
    }

    private static void show() {
        Node traversingNode = head;

        System.out.print("The singly linked list looks like: ");
        while (traversingNode != tail) {
            System.out.print(traversingNode.value + " ");
            traversingNode = traversingNode.next;
        }
        System.out.println(traversingNode.value + " ");
    }

    public static void main(String[] args) {
        insert(50);
        insert(40);
        insert(30);
        insert(20);
        insert(10);
        insert(0);
        show();
        delete(0);
        delete(30);
        delete(50);
        show();
    }
}
