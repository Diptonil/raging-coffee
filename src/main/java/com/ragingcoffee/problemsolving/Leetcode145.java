package com.ragingcoffee.problemsolving;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
public final class Leetcode145 {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        postOrder(root, list);
        return list;
    }
    
    public static void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
