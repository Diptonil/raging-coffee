package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public final class Leetcode2011 {
    
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        
        for (int i = 0; i < operations.length; i ++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                count ++;
            } else {
                count --;
            }
        }
        
        return count;
    }
}
