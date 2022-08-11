package interfaces;

import java.util.Random;

interface SimpleInterface {
    static void simpleTaskOne(int parameter) {}
    static void simpleTaskTwo(int parameter) {}
    static void simpleTaskThree(int parameter) {}
}

public abstract class IncompleteInterfacingApplication implements SimpleInterface{
    
    private static final int BOUND = 100;

    public static void main(String[] args) {
        Random random = new Random();

        int parameter = random.nextInt(BOUND);

        simpleTaskOne(parameter);
        simpleTaskTwo(parameter);
    }

    public static void simpleTaskOne(int parameter) {
        System.out.println("Task one is to print the value of parameter: " + parameter);
    }

    public static void simpleTaskTwo(int parameter) {
        System.out.println("Task two is to print the value of parameter's square: " + parameter * parameter);
    }
}
