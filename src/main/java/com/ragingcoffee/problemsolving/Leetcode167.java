package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public final class Leetcode167 {
    
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int[] res = new int[2];

        while (leftPointer < rightPointer) {
            if (numbers[leftPointer] + numbers[rightPointer] == target) {
                res[0] = leftPointer + 1;
                res[1] = rightPointer + 1;
                break;
            } else if (numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer --;
            } else {
                leftPointer ++;
            }
        }
        return res;
    }
}
