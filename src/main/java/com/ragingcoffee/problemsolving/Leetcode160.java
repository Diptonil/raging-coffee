package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public final class Leetcode160 {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode trav1 = headA;
        ListNode trav2 = headB;
        while (trav1 != trav2) {
            if (trav1 != null) {
                trav1 = trav1.next;
            } else {
                trav1 = headB;
            }
            if (trav2 != null) {
                trav2 = trav2.next;
            } else {
                trav2 = headA;
            }
        }
        return trav1;
    }
}
