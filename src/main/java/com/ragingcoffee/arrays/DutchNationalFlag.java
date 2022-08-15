package com.ragingcoffee.arrays;

import java.util.Random;

public final class DutchNationalFlag {
    
    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = getArray();
        array = transformArray(array);
        displayArray(array);
    }

    private static int[] getArray() {
        Random random = new Random();
        int[] array = new int[SIZE];

        for (int iterator = 0; iterator < SIZE; iterator ++) {
            array[iterator] = random.nextInt(2);
        }

        return array;
    }

    private static int[] transformArray(int[] array) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int midPointer = 0;
        int copy;

        while (midPointer <= rightPointer) {
            if (array[midPointer] == 0) {
                copy = array[midPointer];
                array[midPointer] = array[leftPointer];
                array[leftPointer] = copy;
                leftPointer ++;
                midPointer ++;
            } else if (array[midPointer] == 1) {
                midPointer ++;
            } else if (array[midPointer] == 2) {
                copy = array[midPointer];
                array[midPointer] = array[rightPointer];
                array[rightPointer] = copy;
                rightPointer --;
            }
        }

        return array;
    }

    public static void displayArray(int[] array) {
        System.out.print("The sorted array is: ");
        for (int item : array) {
            System.out.print(item + "\t");
        }
    }
}
