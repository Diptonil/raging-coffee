package com.ragingcoffee.exceptions;

public class BasicExceptionHandler {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int quotient = (int) (numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.print("Attempt to divide by zero. Any code succeeding this block will remain unexecuted.");
        }
    }
}