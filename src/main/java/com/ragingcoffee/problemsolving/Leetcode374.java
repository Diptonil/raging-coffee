package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/guess-number-higher-or-lower/
public final class Leetcode374 {

    // Not a part of the real solution - a placeholder to avoid compilation issues
    private int guess(int num) {
        // This is a meaningless statement created just to replicate the built-in Leetcode API
        return num;
    }
    
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        int pick;
        
        while(low <= high) {
            pick = low + (high - low) / 2;
            if (guess(pick) == -1) {
                high = pick - 1;
            } else if (guess(pick) == 1) {
                low = pick + 1;
            } else {
                return pick;
            }
        }
        
        return -1;
    }
}
