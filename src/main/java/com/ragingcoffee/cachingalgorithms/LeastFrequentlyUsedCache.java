package com.ragingcoffee.cachingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class LeastFrequentlyUsedCache implements CacheMechanism {

    private int[][] cache;
    private ArrayList<Integer> memory;
    private final int CACHE_SIZE = 5;
    private final int MEMORY_SIZE = 20;

    LeastFrequentlyUsedCache() {
        cache = new int[2][CACHE_SIZE];
        memory = new ArrayList<Integer>(MEMORY_SIZE);
        for (int iterator = 0; iterator < MEMORY_SIZE; iterator ++) {
            memory.add(iterator + 1);
        }
    }

    public String loadCache() {
        Random random = new Random();
        List<Integer> randomValues = random.ints(0, MEMORY_SIZE).distinct().limit(CACHE_SIZE).boxed().collect(Collectors.toList());
        for (int iterator = 0; iterator < CACHE_SIZE; iterator ++) {
            cache[0][iterator] = randomValues.get(iterator);
            cache[1][iterator] = 0;
        }
        return Arrays.toString(cache[0]);
    }

    public boolean get(int value) {
        for (int iterator = 0; iterator < CACHE_SIZE; iterator ++) {
            if (cache[0][iterator] == value) {
                System.out.println("Cache hit: " + value);
                cache[1][iterator] ++;
                return true;
            }
        }
        if (memory.contains(value)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                System.out.println("There has been some error with the program threads. Exiting now.");
                System.exit(0);
            }
            System.out.println("Cache miss: " + value);
            int minimumIndex = 0;
            for (int iterator = 0; iterator < CACHE_SIZE; iterator ++) {
                if (cache[1][minimumIndex] > cache[1][iterator]) {
                    minimumIndex = iterator;
                }
            }
            cache[0][minimumIndex] = value;
            cache[1][minimumIndex] = 0;
            return true;
        }
        return false;
    }

    public String getCache() {
        return Arrays.toString(cache[0]);
    }

    public String getMemory() {
        return memory.toString();
    }
}