package com.ragingcoffee.datastructures.arrays;

import java.util.Scanner;
import java.util.Random;

public final class SlidingWindow {
    
    private static final int BOUND = 100;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Size of array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.print("Length of chain of adjacent elements: ");
            int adjacentElementsCount = scanner.nextInt();

            for (int iterator = 0; iterator < size; iterator ++) {
                array[iterator] = random.nextInt(BOUND);
            }

            if (adjacentElementsCount > array.length) {
                System.out.print("Chain length larger than array size.");
            } else {
                System.out.print("Maximum possible value: " + slidingWindow(array, adjacentElementsCount));
            }
        }
    }

    private static int slidingWindow(int[] array, int adjacentElementsCount) {
        int iterator = 0;
        int sum = 0;
        int previous_index;
        
        for (; iterator < adjacentElementsCount; iterator ++) {
            sum += array[iterator];
        }
        int maximumValue = sum;
        for (iterator = adjacentElementsCount, previous_index = 0; iterator < array.length; iterator ++, previous_index ++) {
            sum += array[iterator] - array[previous_index];
            if (maximumValue < sum) {
                maximumValue = sum;
            }
        }

        return sum;
    }
}
