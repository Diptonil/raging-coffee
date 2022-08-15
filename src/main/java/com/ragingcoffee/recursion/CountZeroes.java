package com.ragingcoffee.recursion;

public final class CountZeroes {
    
    public static void main(String[] args) {
        int number = 9;
        System.out.println("The number of zeroes in " + number + " is " + countZeroes(number, 0) + ".");
    }

    public static int countZeroes(int number, int count) {
        if (number % 10 == 0) {
            count ++;
        }
        if (number % 10 == number) {
            return count;
        }
        return countZeroes(number / 10, count);
    }
}
