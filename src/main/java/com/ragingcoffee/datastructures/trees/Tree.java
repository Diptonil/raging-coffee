package com.ragingcoffee.datastructures.trees;

public final class Tree {
    
    public int value;
    public Tree right;
    public Tree left;

    Tree(int value) {
        this.value = value;
        right = left = null;
    }
}
