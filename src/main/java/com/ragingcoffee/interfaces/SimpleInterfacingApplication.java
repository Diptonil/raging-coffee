package com.ragingcoffee.interfaces;

import java.util.Random;

interface SimpleInterface {
    static void simpleTaskOne(int parameter) {}
    void simpleTaskTwo(int parameter);
}

public final class SimpleInterfacingApplication implements SimpleInterface{
    
    private static final int BOUND = 100;

    public static void main(String[] args) {
        SimpleInterfacingApplication simpleInterfacing = new SimpleInterfacingApplication();
        Random random = new Random();

        int parameter = random.nextInt(BOUND);
        simpleTaskOne(parameter);
        simpleInterfacing.simpleTaskTwo(parameter);
    }

    public static void simpleTaskOne(int parameter) {
        System.out.println("Task one is to print the value of parameter: " + parameter);
    }

    public void simpleTaskTwo(int parameter) {
        System.out.println("Task two is to print the value of parameter's square: " + parameter * parameter);
    }
}
