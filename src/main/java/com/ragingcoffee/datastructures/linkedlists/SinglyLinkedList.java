package com.ragingcoffee.datastructures.linkedlists;

public final class SinglyLinkedList {

    private static Node head;
    private static Node tail;
    private static int size;
    
    private static void insertFront(int value) {
        Node node = new Node(value, head);
        head = node;

        if(tail == null) {
            tail = head;
        }
        size ++;
    }

    private static void insertRear(int value) {
        if(tail == null) {
            insertFront(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    private static void insertAfter(int value, int index) {
        Node traversingNode = head;
        int count = 0;

        if (index > size - 1) {
            System.out.print("Index higher than total nodes.");
            return;
        }

        while (count < size) {
            if (count == index) {
                Node node = new Node(value, traversingNode.next);
                if (index == size - 1) {
                    tail = node;
                }
                traversingNode.next = node;
                break;
            }
            traversingNode = traversingNode.next;
            count ++;
        }
        size ++;
    }

    private static int deleteFirst() {
        int deletedValue = head.value;

        if (head == null) {
            return Integer.MIN_VALUE;
        }
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size --;
        return deletedValue;
    }

    private static int deleteRear() {
        int deletedValue = 0;

        if (tail == null) {
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            head = tail = null;
            return head.value;
        }

        Node traversingNode = head;

        while (traversingNode.next.next != null) {
            traversingNode = traversingNode.next;
        }
        deletedValue = traversingNode.next.value;
        traversingNode.next = null;
        tail = traversingNode;
        
        size --;
        return deletedValue;
    }

    private static int deleteAfter(int index) {
        int deletedValue = 0;

        if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteRear();
        } else {
            Node traversingNode = head;
            int count = 0;
            while (count < size) {
                if (count == index) {
                    deletedValue = traversingNode.next.value;
                    traversingNode.next = traversingNode.next.next;
                    break;
                }
                traversingNode = traversingNode.next;
                count ++;
            }
        }
        return deletedValue;
    }

    private static void show(Node head) {
        Node traversingNode = head;

        System.out.print("The singly linked list looks like: ");
        while (traversingNode != null) {
            System.out.print(traversingNode.value + " ");
            traversingNode = traversingNode.next;
        }
        System.out.println();
    }

    private static Node reverse() {
        Node reverse = null;
        Node nextNode = null;
        Node traversingNode = head;
        while (traversingNode != null) {
            nextNode = traversingNode.next;
            traversingNode.next = reverse;
            reverse = traversingNode;
            traversingNode = nextNode;
        }
        return reverse;
    }

    public static void main(String[] args) {
        insertFront(10);
        insertFront(0);
        insertRear(20);
        insertRear(30);
        insertAfter(420, 2);
        show(head);
        deleteAfter(3);
        deleteFirst();
        deleteRear();
        show(head);
        Node reverse = reverse();
        show(reverse);
    }
}
