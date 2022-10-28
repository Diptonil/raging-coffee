package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/balanced-binary-tree/
public final class Leetcode110 {
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        int leftSubtreeHeight = height(root.left);
        int rightSubtreeHeight = height(root.right);

        return (Math.abs(leftSubtreeHeight - rightSubtreeHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right))? true:false;
    }
    
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
