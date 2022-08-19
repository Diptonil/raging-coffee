package com.ragingcoffee.cachingalgorithms;

public interface CacheMechanism {
    String loadCache();
    boolean get(int value);
    String getCache();
    String getMemory();
}
