package com.ragingcoffee.problemsolving;

import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public final class Leetcode589 {
    
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<Integer>();
        preOrder(root, list);
        return list;
    }
    
    public static void preOrder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node node : root.children) {
            preOrder(node, list);
        }
    }
}
