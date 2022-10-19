package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/linked-list-cycle-ii/
public final class Leetcode142 {
    
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode travToSlow = head;
                while (travToSlow != slow) {
                    travToSlow = travToSlow.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
