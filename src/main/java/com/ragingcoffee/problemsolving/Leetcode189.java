package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/rotate-array/
public final class Leetcode189 {
    
    public void rotate(int[] nums, int k) {
        int[] result=new int[nums.length];

        if (k > nums.length) {
            k = k % nums.length;
        }
        int j=0;
        for(int i=k;i<nums.length;i++){
            result[i]=nums[j];
            j++;
        }
        for(int i=0;i<k;i++){
            result[i]=nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length );
    }
}
