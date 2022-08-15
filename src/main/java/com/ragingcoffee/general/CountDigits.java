package com.ragingcoffee.general;

import java.util.Scanner;

public final class CountDigits {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number whose digits are to be found: ");
            int number = scanner.nextInt();

            System.out.println("Digits using continued remainder method: " + countDigitsWithRemainder(number));
            System.out.println("Digits using optimized logarithmic method: " + countDigitsWithLogarithm(number));
            System.out.println("Digits using String class method: " + countDigitsWithStrings(number));
        }
    }

    private static int countDigitsWithRemainder(int number) {
        int count = 0;

        if (number < 0) {
            number *= -1;
        }
        for (int iterator = number; iterator != 0; iterator /= 10) {
            count ++;
        }

        return count;
    }

    private static int countDigitsWithLogarithm(int number) {
        if (number < 0) {
            number *= -1;
        }

        return (int)(Math.log10(number)) + 1;
    }

    private static int countDigitsWithStrings(int number) {
        if (number < 0) {
            number *= -1;
        }

        return Integer.toString(number).length();
    }
}
