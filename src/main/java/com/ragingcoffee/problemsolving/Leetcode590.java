package com.ragingcoffee.problemsolving;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-postorder-traversal/
public final class Leetcode590 {
    
    public List<Integer> postorder(NAryNode root) {
        List<Integer> list = new LinkedList<Integer>();
        postOrder(root, list);
        return list;
    }
    
    public static void postOrder(NAryNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        for (NAryNode node : root.children) {
            postOrder(node, list);
        }
        list.add(root.val);
    }
}
