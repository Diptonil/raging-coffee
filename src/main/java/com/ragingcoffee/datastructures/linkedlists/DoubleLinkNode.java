package com.ragingcoffee.datastructures.linkedlists;

public final class DoubleLinkNode {
    
    public int value;
    public DoubleLinkNode previous;
    public DoubleLinkNode next;

    DoubleLinkNode(int value, DoubleLinkNode previous, DoubleLinkNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    DoubleLinkNode(int value) {
        this.value = value;
        next = previous = null;
    }

    DoubleLinkNode() {
        next = previous = null;
    }
}
