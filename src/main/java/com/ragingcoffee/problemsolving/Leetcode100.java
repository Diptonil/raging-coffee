package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/same-tree/
public final class Leetcode100 {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] flag = {true};
        check(p, q, flag);
        return flag[0];
    }
    
    public static void check(TreeNode p, TreeNode q, boolean[] flag) {
        if (p == null && q == null) {
            return;
        } else if (p == null || q == null) {
            flag[0] = false;
            return;
        }
        if (q.val != p.val) {
            flag[0] = false;
        }
        check(p.left, q.left, flag);
        check(p.right, q.right, flag);
    }
}
