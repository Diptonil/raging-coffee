package com.ragingcoffee.datastructures.trees;

public final class RecursiveTraversals {
    
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

        System.out.print("Inorder traversal: ");
        inorderTraversal(root);
        System.out.println();
        System.out.print("Preorder traversal: ");
        preorderTraversal(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        postorderTraversal(root);
    }

    public static void inorderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }

    public static void preorderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        inorderTraversal(root.left);
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        System.out.print(root.value + " ");
    }
}
