package sorting;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public final class InBuiltSort {
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
        Arrays.sort(arr);
        long estimateTime = System.nanoTime() - startTime;
        
        System.out.println("Array sorted in " + estimateTime + " looks like:");
        for(int iterator = 0; iterator < size; iterator ++) {
            System.out.print(arr[iterator] + "\t");
        }
    }
}
