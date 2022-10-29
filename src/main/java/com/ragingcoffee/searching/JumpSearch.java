package com.ragingcoffee.searching;

import java.util.Arrays;
import java.util.Random;

public final class JumpSearch {
    
    private static final int SIZE = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[] array = getArray();
        Arrays.sort(array);
        boolean searchResult = jumpSearch(array, searchElement);

        System.out.println("Element to search for: " + searchElement);
        System.out.print("Array: ");
        for (int item : array) {
            System.out.print(item + "\t");
        }
        System.out.println();

        if (searchResult){
            System.out.print("Element exists in the array.");
        } else {
            System.out.print("Element doesn't exist in the array.");
        }
    }

    private static int[] getArray() {
        int[] array = new int[SIZE];

        for (int iterator = 0; iterator < SIZE; iterator ++) {
            array[iterator] = random.nextInt(SIZE);
        }

        return array;
    }

    private static boolean jumpSearch(int[] array, int searchElement) {
        int stepSize = (int)Math.floor(Math.sqrt(array.length));
        int currentPointer = 0;

        while (array[Math.min(stepSize, array.length) - 1] < searchElement) {
            currentPointer = stepSize;
            stepSize *= 2;
            if (currentPointer >= array.length) {
                return false;
            }
        }

        while (array[currentPointer] <= searchElement) {
            if (array[currentPointer] == searchElement) {
                return true;
            }
            if (currentPointer >= array.length) {
                return false;
            }
            currentPointer ++;
        }

        return false;
    }
}
