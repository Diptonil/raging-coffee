package com.ragingcoffee.datastructures.trees;

public final class MaximumDepth {

    public static void main(String[] args) {
        Tree root = new Tree(3);
        Tree leftChild = new Tree(1);
        Tree rightChild = new Tree(5);
        Tree leftRightChild = new Tree(2);
        Tree rightRightChild = new Tree(6);
        Tree rightLeftChild = new Tree(4);

        root.left = leftChild;
        root.right = rightChild;
        leftChild.right = leftRightChild;
        rightChild.left = rightLeftChild;
        rightChild.right = rightRightChild;

        System.out.print("Maximum depth of tree is " + maximumDepth(root));
    }
    
    public static int maximumDepth(Tree root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maximumDepth(root.left), maximumDepth(root.right));
    }
}
