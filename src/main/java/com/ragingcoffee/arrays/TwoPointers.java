package com.ragingcoffee.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class TwoPointers {
    
    private static final int BOUND = 100;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Size of array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            Arrays.sort(array);
            System.out.print("Expected sum of pairs: ");
            int sum = scanner.nextInt();

            for (int iterator = 0; iterator < size; iterator ++) {
                array[iterator] = random.nextInt(BOUND);
            }

            int[] answer = twoPointers(array, sum);
            if (answer[0] == -1) {
                System.out.print("There exists no such pair.");
            } else {
                System.out.print("The array pair would be the elements " + array[answer[0]] + " and " + array[answer[1]]);
            }
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

    private static int[] twoPointers(int[] array, int sum) {
        int[] answer = {-1, -1};
        int leftPointer = 0;
        int rightPointer = array.length;
        int pairSum;

        while (leftPointer < rightPointer) {
            pairSum = array[leftPointer] + array[rightPointer];
            if (pairSum == sum) {
                answer[0] = leftPointer;
                answer[1] = rightPointer;
                return answer;
            } else if (pairSum > sum) {
                rightPointer --;
            } else {
                leftPointer ++;
            }
        }
        return answer;
    }
}
