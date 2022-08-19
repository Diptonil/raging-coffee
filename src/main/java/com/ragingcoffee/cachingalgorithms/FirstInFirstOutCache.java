package com.ragingcoffee.cachingalgorithms;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Queue;
import java.util.Random;

public final class FirstInFirstOutCache implements CacheMechanism {

    private Queue<Integer> cache;
    private ArrayList<Integer> memory;
    private final int CACHE_SIZE = 5;
    private final int MEMORY_SIZE = 20;

    FirstInFirstOutCache () {
        cache = new LinkedBlockingQueue<Integer>(CACHE_SIZE);
        memory = new ArrayList<Integer>(MEMORY_SIZE);
        for (int iterator = 0; iterator < MEMORY_SIZE; iterator ++) {
            memory.add(iterator + 1);
        }
    }

    public String loadCache() {
        Random random = new Random();
        for (int iterator = 0; iterator < CACHE_SIZE; iterator ++) {
            cache.add(random.nextInt(MEMORY_SIZE + 1));
        }
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
            System.out.println("Cache miss " + value);
            cache.poll();
            cache.add(value);
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