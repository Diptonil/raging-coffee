package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public final class Leetcode1832 {
    
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        int[] counter = new int[26];
        int i;
        
        for (i = 0; i < sentence.length(); i ++) {
            counter[(int)sentence.charAt(i) - (int)'a'] ++;
            System.out.println((int)sentence.charAt(i) - (int)'a');
        }
        for (i = 0; i < 26; i ++) {
            if (counter[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
