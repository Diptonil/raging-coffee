package com.ragingcoffee.problemsolving;


// https://leetcode.com/problems/n-th-tribonacci-number/
public final class Leetcode1137 {
    
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        int i;
        int[] tribonacci = new int[n + 1];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;
        
        for (i = 3; i <= n; i ++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }
        return tribonacci[i - 1];
    }
}
