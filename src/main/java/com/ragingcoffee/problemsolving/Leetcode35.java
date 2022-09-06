package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/search-insert-position/
public final class Leetcode35 {
    
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int midPointer = 0;
        int rightPointer = nums.length - 1;
        
        while (leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (target == nums[midPointer]) {
                return midPointer;
            } else if (target > nums[midPointer]) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }
        
        return leftPointer;
    }
}
