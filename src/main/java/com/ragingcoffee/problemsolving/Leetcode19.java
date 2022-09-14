package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public final class Leetcode19 {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trav = head;
        ListNode nextNode = null;
        ListNode reverse = null;
        
        while (trav != null) {
            nextNode = trav.next;
            trav.next = reverse;
            reverse = trav;
            trav = nextNode;
        }
        
        trav = reverse;
        int count = 1;
        while(count < n - 1) {
            trav = trav.next;
            count ++;
        }
        if (trav.next != null) {
            if (n != 1)
                trav.next = trav.next.next;
            else
                reverse = trav.next;
        }
        else
            reverse = null;
        
        trav = reverse;
        nextNode = null;
        reverse = null;
        
        while (trav != null) {
            nextNode = trav.next;
            trav.next = reverse;
            reverse = trav;
            trav = nextNode;
        }
        
        return reverse;
    }
}
