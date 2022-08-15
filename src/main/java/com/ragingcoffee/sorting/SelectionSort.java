package com.ragingcoffee.sorting;

import java.util.Scanner;
import java.util.Random;

public final class SelectionSort {
    
    private static void selectionSort(int arr[]) {
        int inner_iterator, outer_iterator, minimum_index, copy;
        for (outer_iterator = 0; outer_iterator < arr.length - 1; outer_iterator ++) {
            minimum_index = outer_iterator;
            for (inner_iterator = outer_iterator + 1; inner_iterator < arr.length; inner_iterator ++) {
                if (arr[minimum_index] > arr[inner_iterator]) {
                    arr[minimum_index] = arr[inner_iterator];
                }
            }
            copy = arr[outer_iterator];
            arr[outer_iterator] = minimum_index;
            arr[minimum_index] = copy;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter input size: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int iterator = 0; iterator < size; iterator ++) {
            arr[iterator] = random.nextInt();
        }
        scan.close();

        long startTime = System.nanoTime();
        selectionSort(arr);
        long estimateTime = System.nanoTime() - startTime;
        
        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(arr[iterator] + "\t");
        }
    }   
}
