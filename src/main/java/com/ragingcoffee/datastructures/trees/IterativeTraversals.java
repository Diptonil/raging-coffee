package com.ragingcoffee.datastructures.trees;

import java.util.Stack;

public final class IterativeTraversals {
    
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
        Stack<Tree> stack = new Stack<Tree>();
        Tree traversingNode = root;

        while (traversingNode != null || stack.isEmpty()) {
            while (root != null) {
                stack.add(traversingNode);
                traversingNode = traversingNode.left;
            }
            traversingNode = stack.pop();
            System.out.print(traversingNode.value + " ");
            traversingNode = traversingNode.right;
        }
    }

    public static void postorderTraversal(Tree root) {
        Stack<Tree> stack = new Stack<Tree>();
        Tree traversingNode = root;
        stack.push(traversingNode);

        while (stack.isEmpty()) {
            traversingNode = stack.peek();
            if (traversingNode.left != null) {
                Tree newNode = traversingNode.left;
                stack.push(newNode);
            } else if (traversingNode.right != null) {
                Tree newNode = traversingNode.right;
                stack.push(newNode);
            } else {
                stack.pop();
                System.out.print(traversingNode.value + " ");
            }
        }
    }

    public static void preorderTraversal(Tree root) {
        Stack<Tree> stack = new Stack<Tree>();
        Tree traversingNode = root;
        stack.push(traversingNode);

        while (stack.isEmpty()) {
            traversingNode = stack.peek();
            stack.pop();
            System.out.print(traversingNode.value + " ");
            if (traversingNode.left != null) {
                Tree newNode = traversingNode.left;
                stack.push(newNode);
            } else if (traversingNode.right != null) {
                Tree newNode = traversingNode.right;
                stack.push(newNode);
            }
        }
    }
}
