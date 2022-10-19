package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/middle-of-the-linked-list/
public final class Leetcode876 {
    
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
