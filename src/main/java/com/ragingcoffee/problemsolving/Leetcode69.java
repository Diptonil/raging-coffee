package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/sqrtx/
public final class Leetcode69 {
    
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long i = x;
        while (i > x / i) {
            i = (i + x / i) / 2;   
        }
        return (int)i;
    }
}
