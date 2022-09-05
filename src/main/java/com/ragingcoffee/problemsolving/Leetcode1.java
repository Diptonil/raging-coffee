package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/two-sum/
public final class Leetcode1 {

    public int[] twoSum(int[] nums, int target)
    {
        int sum = 0, i = 0, l = 0;
        outerloop:
        for (l = 0; l < nums.length; l ++)
        {
            for (i = l + 1; i < nums.length; i ++)
            {
                sum = nums[i] + nums[l];
                if (sum == target) {
                    break outerloop;
                }
            }
        }
        int a[] = {l, i};
        return a;
    }
}
