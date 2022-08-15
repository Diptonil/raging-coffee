package com.ragingcoffee.collectionsframework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Scanner;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.SOURCE)
@interface MethodUse {
    String value();
}

public final class ArrayListCollection {

    private static final int INITIAL_SIZE = 4;
    private static final int INCREMENT_FACTOR = 3;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(INITIAL_SIZE);
        arrayList.ensureCapacity(INITIAL_SIZE * INCREMENT_FACTOR);
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.print("Keep on entering values with spaces. Enter -1 to stop: ");
        while (input != -1) {
            input = scanner.nextInt();
            arrayList.add(input);
        }
        scanner.close();
        arrayList.remove(Integer.valueOf(-1));

        System.out.println("The current ArrayList with size " + arrayList.size() + " is:");
        for (Integer iterator : arrayList) {
            System.out.print(iterator + "\t");
        }
        System.out.println();

        arrayList.trimToSize();
        System.out.println("The current ArrayList with size " + arrayList.size() + " is: " + arrayList.toString());

        Integer[] array = new Integer[arrayList.size()];
        array = arrayList.toArray(array);
    }
}
