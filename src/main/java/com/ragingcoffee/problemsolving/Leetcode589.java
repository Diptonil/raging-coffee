package com.ragingcoffee.problemsolving;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
class NAryNode {
    public int val;
    public List<NAryNode> children;

    public NAryNode() {}

    public NAryNode(int _val) {
        val = _val;
    }

    public NAryNode(int _val, List<NAryNode> _children) {
        val = _val;
        children = _children;
    }
}

public final class Leetcode589 {
    
    public List<Integer> preorder(NAryNode root) {
        List<Integer> list = new LinkedList<Integer>();
        preOrder(root, list);
        return list;
    }
    
    public static void preOrder(NAryNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (NAryNode node : root.children) {
            preOrder(node, list);
        }
    }
}
