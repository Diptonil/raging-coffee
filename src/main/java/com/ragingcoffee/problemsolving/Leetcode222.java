package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/count-complete-tree-nodes/
public final class Leetcode222 {
    
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return count(root);
    }
    
    private static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.right) + count(root.left);
    }
}
