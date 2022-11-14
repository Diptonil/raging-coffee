package com.ragingcoffee.recursion;

import java.util.Scanner;

public final class SumOfN {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number to be expressed as sum of 1, 3 and 4: ");
            int number = scanner.nextInt();
            System.out.print("The number of possibilities are: " + sumOfN(number));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static int sumOfN(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfN(number - 1);
    }
}
