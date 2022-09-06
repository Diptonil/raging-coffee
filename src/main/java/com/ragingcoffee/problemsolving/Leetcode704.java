package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/binary-search/
public final class Leetcode704 {
    
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int midPointer;
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
        return -1;
    }
}
