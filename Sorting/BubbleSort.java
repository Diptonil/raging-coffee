package sorting;

import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
    private static void bubbleSort(int arr[]) {
        int inner_iterator, outer_iterator, size = arr.length, copy;
        for(outer_iterator = 0; outer_iterator < size; outer_iterator ++) {
            for(inner_iterator = 1; inner_iterator < (size - outer_iterator); inner_iterator ++) {
                if(arr[inner_iterator - 1] > arr[inner_iterator]) {
                    copy = arr[inner_iterator];
                    arr[inner_iterator] = arr[inner_iterator - 1];
                    arr[inner_iterator - 1] = copy;
                }
            }
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
        bubbleSort(arr);
        long estimateTime = System.nanoTime() - startTime;

        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(arr[iterator] + "\t");
        }
    }
}
