package com.ragingcoffee.dynamicprogramming;

import java.util.Scanner;

public final class FibonacciNumber {
    
    public static void main(String[] args) {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the position of the element for which the Fibonacci number is to be obtained: ");
            number = scanner.nextInt();
            System.out.println("The Fibonacci number is: " + fibonacciNumber(number));
            System.out.println("The Fibonacci number is (without using an array): " + fibonacciNumberWithoutArray(number));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    public static int fibonacciNumber(int number) {
        int[] memoizationArray = new int[number + 1];
        memoizationArray[0] = 0;
        memoizationArray[1] = 1;
        for (int iterator = 2; iterator <= number; iterator ++) {
            memoizationArray[iterator] = memoizationArray[iterator - 1] + memoizationArray[iterator - 2];
        }
        return memoizationArray[number];
    }

    public static int fibonacciNumberWithoutArray(int number) {
        int first = 0;
        int second = 1;
        int temporary;
        for (int iterator = 2; iterator <= number; iterator ++) {
            temporary = first + second;
            first = second;
            second = temporary;
        }
        return second;
    }
}
