package com.ragingcoffee.problemsolving;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public final class Leetcode94 {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        inOrder(root, list);
        return list;
    }
    
    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    } 
}
