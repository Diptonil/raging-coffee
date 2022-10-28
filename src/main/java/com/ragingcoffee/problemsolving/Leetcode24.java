package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public final class Leetcode24 {
    
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode trav = head;
        ListNode previous = null;
        
        while (trav != null && trav.next != null) {
            ListNode temp = trav.next;
            trav.next = temp.next;
            temp.next = trav;
            trav = temp;
            if (previous == null) {
                head = trav;
            } else {
                previous.next = trav;
            }
            previous = trav.next;
            trav = previous.next;
        }
        
        return head;
    }
}
