package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/delete-node-in-a-linked-list/
public final class Leetcode237 {

    public void deleteNode(ListNode node) {
        if(node!=null && node.next!=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
