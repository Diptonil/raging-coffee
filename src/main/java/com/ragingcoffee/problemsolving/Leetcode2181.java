package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/merge-nodes-in-between-zeros/
public final class Leetcode2181 {
    
    public ListNode mergeNodes(ListNode head) {
        ListNode ret = new ListNode();
        ListNode trav = head.next;
        ListNode retTrav = ret;
        
        while (trav != null) {
            if (trav.val != 0) {
                retTrav.val += trav.val;
            } else if (trav.val == 0 && trav.next != null) {
                ListNode node = new ListNode(0, null);
                retTrav.next = node;
                retTrav = node;
            }
            trav = trav.next;
        }
        
        return ret;
    }
}
