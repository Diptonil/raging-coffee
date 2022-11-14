package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/number-of-good-pairs/
public final class Leetcode1512 {
    
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] == nums[j]) {
                    count ++;
                }
            }
        }
        
        return count;
    }
}
