package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/add-two-numbers/
public final class Leetcode2 {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode result = null;
        ListNode trav = result;
        while (l1 != null || l2 != null || carry == 1) {
            sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum %= 10;
            if (result == null) {
                result = new ListNode(sum, null);
                trav = result;
            } else {
                ListNode newNode = new ListNode(sum, null);
                trav.next = newNode;
                trav = trav.next;
            }
        }
        return result;
    }
}
