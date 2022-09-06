package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/find-pivot-index/
public final class Leetcode724 {
    
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; i ++) {
            sum -= nums[i];
            if (sum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
