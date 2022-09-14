package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/reverse-linked-list/
class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next; 
    }
}


public final class Leetcode206 {

   public ListNode reverseList(ListNode head) {
       ListNode reverse = null;
       ListNode traversalNode = head;
       ListNode nextNode = null;
       while (traversalNode != null) {
           nextNode = traversalNode.next;
           traversalNode.next = reverse;
           reverse = traversalNode;
           traversalNode = nextNode;
       }
       return reverse;
   }
}
