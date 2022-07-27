package searching;

import java.util.Random;
import java.util.Arrays;

public final class SearchInInfiniteArray {
    // For practical purposes, we assume SIZE to be 100 but restrict ourselves from using the length parameter.
    private static final int SIZE = 100;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[] array = getArray();
        Arrays.sort(array);
        boolean searchResult = infiniteSearch(array, searchElement);

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

    private static boolean infiniteSearch(int[] array, int searchElement) {
        int leftPointer = 0;
        int rightPointer = 1;
        int midPointer;

        while(searchElement > array[rightPointer]) {
            rightPointer *= 2;
            leftPointer = rightPointer + 1;
        }

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
}
