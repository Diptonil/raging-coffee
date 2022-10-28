package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;

public final class Leetcode20 {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char character : s.toCharArray()) {
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
            } else if (character == '}') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (character == ']') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (character == ')') {
                if (stack.empty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
}
