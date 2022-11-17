package com.ragingcoffee.recursion;

import java.util.Arrays;
import java.util.LinkedList;

public final class ArraySubsequences {
    
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
		LinkedList<Integer> subsequence = new LinkedList<Integer>();

        System.out.println("The initial array: " + Arrays.toString(array));
        System.out.print("The subsequences that are possible: ");
		subsequenceGenerator(0, subsequence, array);
    }

    private static void subsequenceGenerator(int index, LinkedList<Integer> subsequence, int[] array) {
        if (index == array.length) {
            System.out.print(subsequence);
            return;
        }
        subsequence.addLast(array[index]);
        subsequenceGenerator(index + 1, subsequence, array);
        subsequence.pop();
        subsequenceGenerator(index + 1, subsequence, array);
    }
}
