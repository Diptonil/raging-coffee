package com.ragingcoffee.sorting;

import java.util.Scanner;
import java.util.Random;

public final class BozoSort {
    
    private static void bozoSort(int array[]) {
        Random random = new Random();
        int copy;
        int randomIndex1;
        int randomIndex2;

        while (!isSorted(array)) {
            randomIndex1 = random.nextInt(array.length);
            randomIndex2 = random.nextInt(array.length);
            copy = array[randomIndex1];
            array[randomIndex1] = array[randomIndex2];
            array[randomIndex2] = copy;
        }
    }

    private static boolean isSorted(int[] array) {
        int previous = array[0];

        for (int element : array) {
            if (previous > element) {
                return false;
            }
            previous = element;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter input size: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        for(int iterator = 0; iterator < size; iterator ++) {
            array[iterator] = random.nextInt(100);
        }
        scan.close();

        long startTime = System.nanoTime();
        bozoSort(array);
        long estimateTime = System.nanoTime() - startTime;

        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(array[iterator] + "\t");
        }
    }
}
