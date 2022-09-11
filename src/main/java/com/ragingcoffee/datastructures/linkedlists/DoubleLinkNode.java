package com.ragingcoffee.datastructures.linkedlists;

public final class DoubleLinkNode {
    
    public int value;
    public DoubleLinkNode left;
    public DoubleLinkNode right;

    DoubleLinkNode(int value, DoubleLinkNode left, DoubleLinkNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    DoubleLinkNode(int value) {
        this.value = value;
        left = right = null;
    }

    DoubleLinkNode() {
        left = right = null;
    }
}
