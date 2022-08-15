package com.ragingcoffee.javalang;

import java.util.Random;

public final class CopyingArray {
    
    private static final int SIZE = 10;
    private static final int BOUND = 100;

    public static void main(String args[]) {
        Random random = new Random();
        int arr1[] = new int[SIZE];
        int arr2[] = new int[SIZE]; 
        int iterator;

        for(iterator = 0; iterator < SIZE; iterator ++) {
            arr1[iterator] = random.nextInt(BOUND);
            arr2[iterator] = random.nextInt(BOUND);
        }

        System.out.println("The original arrays are: ");
        for(iterator = 0; iterator < SIZE; iterator ++) {
            System.out.print(arr1[iterator] + "\t");
        }
        System.out.println();
        for(iterator = 0; iterator < SIZE; iterator ++) {
            System.out.print(arr2[iterator] + "\t");
        }

        long startTime1 = System.currentTimeMillis();
        System.arraycopy(arr1, 4, arr2, 0, 5);
        long estimateTime1 = System.currentTimeMillis() - startTime1;

        long startTime2 = System.nanoTime();
        System.arraycopy(arr1, 0, arr2, 4, 5);
        long estimateTime2 = System.nanoTime() - startTime2;

        System.out.println("Nanotime results are " + estimateTime2 + " while Millis time results are " + estimateTime1);

        System.out.println("The copied array is: ");
        for(iterator = 0; iterator < SIZE; iterator ++) {
            System.out.print(arr2[iterator] + "\t");
        }
    }
}
