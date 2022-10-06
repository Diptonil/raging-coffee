package com.ragingcoffee.cachingalgorithms;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;
import java.util.stream.Collectors;

public final class LastInFirstOutCache implements CacheMechanism {

    private Stack<Integer> cache;
    private ArrayList<Integer> memory;
    private final int CACHE_SIZE = 5;
    private final int MEMORY_SIZE = 20;

    LastInFirstOutCache () {
        cache = new Stack<Integer>();
        memory = new ArrayList<Integer>(MEMORY_SIZE);
        for (int iterator = 0; iterator < MEMORY_SIZE; iterator ++) {
            memory.add(iterator + 1);
        }
    }

    public String loadCache() {
        Random random = new Random();
        random.ints(0, MEMORY_SIZE).distinct().limit(CACHE_SIZE).boxed().collect(Collectors.toList()).forEach(cache::add);
        return cache.toString();
    }

    public boolean get(int value) {
        if (cache.contains(value)) {
            System.out.println("Cache hit: " + value);
            return true;
        } else if (memory.contains(value)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exception) {
                System.out.println("There has been some error with the program threads. Exiting now.");
                System.exit(0);
            }
            System.out.println("Cache miss: " + value);
            cache.pop();
            cache.push(value);
            return true;
        }
        return false;
    }

    public String getCache() {
        return cache.toString();
    }

    public String getMemory() {
        return memory.toString();
    }
}