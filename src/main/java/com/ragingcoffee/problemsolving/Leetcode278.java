package com.ragingcoffee.problemsolving;

/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); 
*/

/*
// https://leetcode.com/problems/first-bad-version/
public class Leetcode278 extends VersionControl {
    
    public int firstBadVersion(int n) {
        int leftPointer = 0, rightPointer = n, midPointer = 0;
        while (leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
             
            if (isBadVersion(midPointer) && !isBadVersion(midPointer - 1)) {
                return midPointer;
            } else if (isBadVersion(midPointer) && isBadVersion(midPointer - 1)) {
                rightPointer = midPointer - 1;
            } else if (!isBadVersion(midPointer)) leftPointer = midPointer + 1;
        }
        return midPointer;
    }
}
*/