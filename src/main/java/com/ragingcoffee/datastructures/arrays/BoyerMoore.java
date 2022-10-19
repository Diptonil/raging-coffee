package com.ragingcoffee.datastructures.arrays;

import java.util.Scanner;

public final class BoyerMoore {

    public static int boyerMoore(int[] candidates) {
        int votes = 0;
        int winningCandidate = -1;

        for (int candidate : candidates) {
            if (votes == 0) {
                winningCandidate = candidate;
                votes = 1;
            } else {
                if (candidate == winningCandidate) {
                    votes ++;
                } else {
                    votes --;
                }
            }
        }

        votes = 0;
        for (int candidate : candidates) {
            if (candidate == winningCandidate) {
                votes ++;
            }
        }

        if (votes > (int)(candidates.length / 2)) {
            return winningCandidate;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter length of array to be entered: ");
            int length = scanner.nextInt();

            int[] candidates = new int[length];

            System.out.println("Enter array elements: ");
            for (int iterator = 0; iterator < length; iterator ++) {
                candidates[iterator] = scanner.nextInt();
            }

            if (boyerMoore(candidates) == -1) {
                System.out.print("No winning candidates.");
            } else {
                System.out.println("Winner: " + boyerMoore(candidates));
            }
        } catch(Exception exception) {
            System.out.print("Some error with the Scanner resource has occured.");
        }
    }
}
