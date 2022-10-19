package com.ragingcoffee.dynamicprogramming;

import java.util.Scanner;

public final class StaircaseProblem {

    public static void main(String[] args) {
        int stairs;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("We can either jump one or two steps at a time to ascend a staircase. Enter the staircase count: ");
            stairs = scanner.nextInt();
            System.out.println("The total number of ways in which a person may ascend the staircase: " + climbStairs(stairs));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }
    
    public static int climbStairs(int stairs) {
        if (stairs == 2) {
            return 2;
        }
        if (stairs == 1) {
            return 1;
        }
        int[] staircase = new int[stairs + 1];
        staircase[1] = 1;
        staircase[2] = 2;
        for (int iterator = 3; iterator <= stairs; iterator ++) {
            staircase[iterator] = staircase[iterator - 1] + staircase[iterator - 2];
        }
        return staircase[stairs];
    }
}
