package searching;

import java.util.Random;

public final class LinearSearch {
    private static final int SIZE = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[] array = getArray();
        boolean searchResult = linearSearch(array, searchElement);

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

    private static boolean linearSearch(int[] array, int searchElement) {
        if (array.length > 0) {
            for (int item : array) {
                if (item == searchElement) {
                    return true;      
                }
            }
        }
        return false;
    }
}
