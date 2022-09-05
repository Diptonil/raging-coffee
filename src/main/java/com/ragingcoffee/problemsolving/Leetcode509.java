package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/fibonacci-number/
public final class Leetcode509 {
    
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
