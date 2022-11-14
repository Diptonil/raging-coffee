package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/length-of-last-word/
public final class Leetcode58 {
    
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
