package com.ragingcoffee.datastructures.trees;

public final class BalancedTree {
    
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

        if (isBalancedTopDown(root)) {
            System.out.print("Tree is balanced (observed using the top down approach).");
        } else {
            System.out.print("Tree is not balanced (observed using the top down approach).");
        }

        if (isBalancedBottomUp(root) != -1) {
            System.out.print("Tree is balanced (observed using the top down approach).");
        } else {
            System.out.print("Tree is not balanced (observed using the top down approach).");
        }
    }

    public static int isBalancedBottomUp(Tree root) {
        int leftSubtreeHeight = isBalancedBottomUp(root.left);
        int rightSubtreeHeight = isBalancedBottomUp(root.right);

        if (leftSubtreeHeight == -1 || rightSubtreeHeight == -1) {
            return -1;
        }
        if (Math.abs(rightSubtreeHeight - leftSubtreeHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
    }

    public static boolean isBalancedTopDown(Tree root) {
        int leftSubtreeHeight = height(root.left);
        int rightSubtreeHeight = height(root.right);

        return (Math.abs(leftSubtreeHeight - rightSubtreeHeight) == 1 && isBalancedTopDown(root.left) && isBalancedTopDown(root.right)) ? true:false;
    }

    public static int height(Tree root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
