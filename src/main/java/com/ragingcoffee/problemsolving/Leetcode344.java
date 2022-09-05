package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/reverse-string/
public final class Leetcode344 {
    
    public void reverseString(char[] s) {
        int leftPointer = 0;
        int rightPointer = s.length - 1;
        char copy;

        while (leftPointer < rightPointer) {
            copy = s[leftPointer];
            s[leftPointer] = s[rightPointer];
            s[rightPointer] = copy;
            leftPointer ++;
            rightPointer --;
        } 
    }
}
