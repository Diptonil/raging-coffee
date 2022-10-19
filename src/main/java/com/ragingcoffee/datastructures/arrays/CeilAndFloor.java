package com.ragingcoffee.datastructures.arrays;

import java.util.Random;
import java.util.Arrays;

// Complementary Binary Search technique 
public final class CeilAndFloor {
    private static final int SIZE = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[] array = getArray();
        Arrays.sort(array);
        int ceilResult = ceil(array, searchElement);
        int floorResult = floor(array, searchElement);

        System.out.println("Element to search for: " + searchElement);
        System.out.print("Array: ");
        for (int item : array) {
            System.out.print(item + "\t");
        }
        System.out.println("Floor and Ceil: " + floorResult + ", " + ceilResult);
    }

    private static int[] getArray() {
        int[] array = new int[SIZE];

        for (int iterator = 0; iterator < SIZE; iterator ++) {
            array[iterator] = random.nextInt(SIZE);
        }

        return array;
    }

    private static int ceil(int[] array, int searchElement) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int midPointer;

        if (searchElement > array[rightPointer] || searchElement < array[leftPointer]) {
            return -1;
        }
        while(leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (array[midPointer] == searchElement) {
                return searchElement;
            } else if (array[midPointer] > searchElement) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return array[leftPointer];
    }

    private static int floor(int[] array, int searchElement) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int midPointer;

        if (searchElement > array[rightPointer] || searchElement < array[leftPointer]) {
            return -1;
        }
        while(leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (array[midPointer] == searchElement) {
                return searchElement;
            } else if (array[midPointer] > searchElement) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return array[rightPointer];
    }
}
