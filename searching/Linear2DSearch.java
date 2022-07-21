import java.util.Random;

public class Linear2DSearch {
    private static final int SIZE = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int searchElement = random.nextInt(SIZE);
        int[][] array = getArray();
        boolean searchResult = linearSearch(array, searchElement);

        System.out.println("Element to search for: " + searchElement);
        System.out.println("Array: ");
        for (int[] items : array) {
            for (int item : items) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println();

        if (searchResult){
            System.out.print("Element exists in the array.");
        } else {
            System.out.print("Element doesn't exist in the array.");
        }
    }

    private static int[][] getArray() {
        int[][] array = new int[SIZE][SIZE];

        for (int iterator = 0; iterator < SIZE; iterator ++) {
            for (int inner_iterator = 0; inner_iterator < SIZE; inner_iterator ++) {
                array[iterator][inner_iterator] = random.nextInt(SIZE);
            }
        }

        return array;
    }

    private static boolean linearSearch(int[][] array, int searchElement) {
        if (array.length > 0) {
            for (int[] items : array) {
                for (int item : items) {
                    if (item == searchElement) {
                        return true;      
                    }
                }
            }
        }

        return false;
    }
}
