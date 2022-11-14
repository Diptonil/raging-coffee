package com.ragingcoffee.recursion;

import java.util.Scanner;

public final class PalindromeString {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string to check: ");
            String input = scanner.nextLine();
            System.out.print(isPalindrome(input, 0)? "It is palindrome." : "It is not palindrome");
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static boolean isPalindrome(String input, int marker) {
        if (marker == (int)(input.length() / 2)) {
            return true;
        }
        if (input.charAt(marker) != input.charAt(input.length() - 1 - marker)) {
            return false;
        }
        return isPalindrome(input, marker + 1);
    }
}
