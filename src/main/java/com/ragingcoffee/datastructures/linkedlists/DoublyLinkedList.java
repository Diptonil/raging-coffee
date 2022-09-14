package com.ragingcoffee.datastructures.linkedlists;

public final class DoublyLinkedList {

    private static DoubleLinkNode head;
    private static DoubleLinkNode tail;
    private static int size;

    private static void insertFront(int value) {
        DoubleLinkNode node = new DoubleLinkNode(value, null, head);
        if (head != null) {
            head.previous = node;
        }
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

        DoubleLinkNode node = new DoubleLinkNode(value, tail, null);
        tail.next = node;
        tail = node;
        tail.next = null;
        tail.previous = node.previous;
        size ++;
    }

    private static void insertAfter(int value, int index) {
        DoubleLinkNode traversingNode = head;
        int count = 0;

        if (index > size - 1) {
            System.out.print("Index higher than total nodes.");
            return;
        }

        while (count < size) {
            if (count == index) {
                DoubleLinkNode node = new DoubleLinkNode(value, traversingNode, traversingNode.next);
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

    private static void show(DoubleLinkNode head) {
        DoubleLinkNode traversingNode = head;

        System.out.print("The doubly linked list looks like: ");
        while (traversingNode != null) {
            System.out.print(traversingNode.value + " ");
            traversingNode = traversingNode.next;
        }
        System.out.println();
    }

    private static int deleteFirst() {
        int deletedValue = head.value;

        if (head == null) {
            return Integer.MIN_VALUE;
        }
        head = head.next;
        head.previous = null;

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

        DoubleLinkNode traversingNode = head;

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
            DoubleLinkNode traversingNode = head;
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

    private static void reverse() {
        DoubleLinkNode traversingNode = tail;

        System.out.print("The doubly linked list looks like: ");
        while (traversingNode.previous != null) {
            System.out.print(traversingNode.value + " ");
            traversingNode = traversingNode.previous;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        insertFront(10);
        insertFront(0);
        insertRear(20);
        insertRear(30);
        show(head);
        insertAfter(420, 2);
        show(head);
        reverse();
        deleteAfter(3);
        deleteFirst();
        deleteRear();
        show(head);
    }
}
