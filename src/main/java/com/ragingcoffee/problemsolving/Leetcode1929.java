package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/concatenation-of-array/
public final class Leetcode1929 {
    
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        
        for (int i = 0; i < nums.length; i ++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        
        return result;
    }
}
