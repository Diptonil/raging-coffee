package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/reverse-nodes-in-k-group/
public final class Leetcode25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        
        int count = 0;
        ListNode starter = new ListNode();
        starter.next = head;
        ListNode before = starter;
        ListNode trav =  starter;
        ListNode after = starter;
        
        while (trav.next != null) {
            trav = trav.next;
            count ++;
        }
        
        trav = starter;
        while (count >= k) {
            trav = before.next;
            after = trav.next;
            for (int i = 1; i < k; i ++) {
                trav.next = after.next;
                after.next = before.next;
                before.next = after;
                after = trav.next;
            }
            before = trav;
            count -= k;
        }
        return starter.next;
    }
    
}
