package searching;

import java.util.Random;
import java.util.Arrays;

public final class BinarySearch {
    private static final int SIZE = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[] array = getArray();
        Arrays.sort(array);
        boolean searchResult = binarySearch(array, searchElement);

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

    private static boolean binarySearch(int[] array, int searchElement) {
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int midPointer;

        while(leftPointer <= rightPointer) {
            midPointer = leftPointer + (rightPointer - leftPointer) / 2;
            if (array[midPointer] == searchElement) {
                return true;
            } else if (array[midPointer] > searchElement) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return false;
    }

    private static boolean binarySearch(int[] array, int searchElement, int leftPointer, int rightPointer) {
        if (leftPointer > rightPointer) {
            return false;
        }

        int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
        if (array[midPointer] == searchElement) {
            return true;
        } else if (array[midPointer] > searchElement) {
            return binarySearch(array, searchElement, leftPointer, midPointer - 1);
        } else {
            return binarySearch(array, searchElement, midPointer + 1, rightPointer);
        }
    }
}
