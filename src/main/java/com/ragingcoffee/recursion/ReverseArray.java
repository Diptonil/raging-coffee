package com.ragingcoffee.recursion;

import java.util.Arrays;

public final class ReverseArray {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        reverseArray(array, 0);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array, int marker) {
        if (marker == (int)(array.length / 2)) {
            return;
        }
        int copy = array[marker];
        array[marker] = array[array.length - marker - 1];
        array[array.length - marker - 1] = copy;
        reverseArray(array, marker + 1);
    }
}
