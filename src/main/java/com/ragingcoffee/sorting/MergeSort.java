package com.ragingcoffee.sorting;

import java.util.Random;
import java.util.Scanner;

public final class MergeSort {
    
    public static void merge(int arr[], int arr1[], int arr2[]) {
    }

    public static void mergeSort(int arr[]) {
        int size = arr.length, iterator;
        if (size == 1) {
            return;
        }
        int arr1[] = new int[size / 2], arr2[] = new int[size - size / 2];
        for(iterator = 0; iterator < size / 2; iterator ++) {
            arr1[iterator] = arr[iterator];
        }
        for(iterator = 0; iterator < size - size / 2; iterator ++) {
            arr2[iterator] = arr[iterator + size / 2];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr, arr1, arr2);
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
        mergeSort(arr);
        long estimateTime = System.nanoTime() - startTime;
        
        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(arr[iterator] + "\t");
        }
    }
}
