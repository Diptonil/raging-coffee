package com.ragingcoffee.cachingalgorithms;

import java.util.Scanner;

public final class ImplementCache {

    private static int lookUpElement = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which implementation would you like to witness?");
        System.out.println("1. First In First Out Cache\n2. Last In First Out Cache\n3. Least Frequently Used Cache");
        System.out.println("4. Least Recently Used Cache\n5. Most Recently Used Cache\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                firstInFirstOutCache();
                break;
            case 2:
                lastInFirstOutCache();
                break;
            default:
                System.out.print("Invalid choice.");
        }
        scanner.close();
    }

    private static void operate(CacheMechanism cacheMechanism) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an element to look up: ");
        lookUpElement = scan.nextInt();
        if (!cacheMechanism.get(lookUpElement)) {
            System.out.println("Main memory miss.");
        }
        System.out.println("Current state of cache: " + cacheMechanism.getCache());
        System.out.println();
    }

    private static void firstInFirstOutCache() {
        FirstInFirstOutCache fifoCaching = new FirstInFirstOutCache();

        System.out.println("Initial state of main memory: " + fifoCaching.getMemory());
        System.out.println("Initial state of cache is empty. So we load some random elements into the cache.");
        System.out.println("State of cache after loading it up is: " + fifoCaching.loadCache());
        System.out.println();

        for (int iterator = 0; iterator < 5; iterator ++) {
            operate(fifoCaching);
        }
    }

    private static void lastInFirstOutCache() {
        FirstInFirstOutCache lifoCaching = new FirstInFirstOutCache();
    }
}
