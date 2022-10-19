package com.ragingcoffee.problemsolving;

//https://leetcode.com/problems/climbing-stairs/
public final class Leetcode70 {
    
    public int climbStairs(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        int[] staircase = new int[n + 1];
        staircase[1] = 1;
        staircase[2] = 2;
        for (int i = 3; i <= n; i ++) {
            staircase[i] = staircase[i - 1] + staircase[i - 2];
        }
        return staircase[n];
    }
}
