package com.ragingcoffee.problemsolving;

import java.util.ArrayList;

// https://leetcode.com/problems/palindrome-linked-list/
public final class Leetcode234 {
    
    public boolean isPalindrome(ListNode head) {
        ListNode trav = head;
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        while (trav != null) {
            array.add(trav.val);
            trav = trav.next;
        }
        
        for (int i = 0; i < array.size(); i ++) {
            if (array.get(i) != array.get(array.size() - 1 - i))
                return false;
        }
        
        return true;
    }
}
