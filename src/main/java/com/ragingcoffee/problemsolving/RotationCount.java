package com.ragingcoffee.problemsolving;

// from GeeksForGeeks
public final class RotationCount {
    public static int rotationCountInRotatedSortedArray(int[] array) {
        int leftPointer = 0;
        int rightPointer = array.length;
        int midPointer;
        int pivot = 0;

        while (leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;

            if (midPointer == 0 || midPointer + 1 == array.length) {
                pivot = midPointer;
                break;
            }
            if (array[midPointer] > array[midPointer + 1]) {
                pivot = midPointer;
                break;
            } else if (array[midPointer] < array[midPointer - 1]) {
                pivot = midPointer - 1;
                break;
            } else if (array[0] > array[midPointer]) {
                rightPointer = midPointer - 1;
            } else if (array[0] < array[midPointer]) {
                leftPointer = midPointer + 1;
            }
        }

        return pivot + 1;
    }
}
