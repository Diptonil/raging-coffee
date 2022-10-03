package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/merge-two-sorted-lists/
public final class Leetcode21 {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode iterator1 = list1;
        ListNode iterator2 = list2;
        ListNode ans = null;
        ListNode ansIterator = ans;
        
        if (iterator1 == null) {
            return list2;
        } else if (iterator2 == null) {
            return list1;
        }
        
        while (iterator1 != null && iterator2 != null) {
            if (ans == null) {
                if (iterator1.val > iterator2.val) {
                    ans = new ListNode(iterator2.val, null);
                    iterator2 = iterator2.next;
                } else {
                    ans = new ListNode(iterator1.val, null);
                    iterator1 = iterator1.next;
                }
                ansIterator = ans;
            } else {
                ListNode node;
                if (iterator1.val > iterator2.val) {
                    node = new ListNode(iterator2.val, null);
                    iterator2 = iterator2.next;
                } else {
                    node = new ListNode(iterator1.val, null); 
                    iterator1 = iterator1.next;
                } 
                ansIterator.next = node;
                ansIterator = ansIterator.next;
            }
        }
        
        if (iterator1 == null) {
            ansIterator.next = iterator2;
        }
        if (iterator2 == null) {
            ansIterator.next = iterator1;
        }
        
        return ans;
    }
}
