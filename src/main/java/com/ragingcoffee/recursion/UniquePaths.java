package com.ragingcoffee.recursion;

import java.util.Scanner;

public final class UniquePaths {
    
    public static void main(String[] args) {
        int length;
        int breadth;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the grid size as m x n: ");
            length = scanner.nextInt();
            breadth = scanner.nextInt();
            System.out.print("The number of unique ways to traverse to that point if starting from (0,0) are: " + uniquePaths(length, breadth));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uniquePaths(m, n - 1) + uniquePaths(m - 1, n); 
    }
}
