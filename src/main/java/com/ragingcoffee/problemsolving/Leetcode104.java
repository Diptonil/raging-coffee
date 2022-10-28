package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public final class Leetcode104 {
    
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
