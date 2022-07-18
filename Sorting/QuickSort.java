package Sorting;
import java.util.Scanner;
import java.util.Random;

public class QuickSort {
    private static int partition(int arr[], int lowerIndex, int higherIndex) {
        int lowerPointer = lowerIndex, higherPointer = higherIndex;
        int pivot = arr[higherIndex];
        while (lowerPointer < higherPointer) {
            while (lowerPointer < higherPointer && arr[lowerPointer] < pivot) {
                lowerPointer ++;
            }
            while (lowerPointer < higherPointer && arr[higherPointer] > pivot) {
                higherPointer ++;
            }
            swap(arr, lowerPointer, higherPointer);
        }
        return lowerPointer;
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int arr[], int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int partitionPointer = partition(arr, lowerIndex, higherIndex);
            quickSort(arr, lowerIndex, partitionPointer - 1);
            quickSort(arr, partitionPointer + 1, higherIndex);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter input size: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int iterator = 0; iterator < size; iterator ++) {
            arr[iterator] = random.nextInt(100);
        }
        scan.close();

        long startTime = System.nanoTime();
        quickSort(arr);
        long estimateTime = System.nanoTime() - startTime;
        
        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(arr[iterator] + "\t");
        }
    }
}
