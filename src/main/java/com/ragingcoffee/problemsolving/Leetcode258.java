package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/add-digits/
public final class Leetcode258 {
    
    public int addDigits(int num) {
        int i = num;
        int digit;
        int sum = 0;
        
        if (num < 10) {
            return num;
        }
        
        while (i >= 10) {
            while (i != 0) {
                digit = i % 10;
                sum += digit;
                i /= 10;
            }
            i = sum;
            sum = 0;
        }
        
        return i;
    }
}
