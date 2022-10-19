package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/majority-element/
public final class Leetcode169 {
    
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int number : nums) {
            if (count == 0) {
                candidate = number;
                count = 1;
            } else {
                if (candidate == number) {
                    count ++;
                } else {
                    count --;
                }
            }
        }
        return candidate;
    }
}
