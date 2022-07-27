package interfaces;

import java.util.Random;

interface SimpleInterface {
    static void simpleTaskOne(int parameter) {}
    void simpleTaskTwo(int parameter);
}

public class SimpleInterfacing implements SimpleInterface{
    private static final int BOUND = 100;

    public static void main(String[] args) {
        SimpleInterfacing simpleInterfacing = new SimpleInterfacing();
        Random random = new Random();

        int parameter = random.nextInt(BOUND);
        simpleTaskOne(parameter);
        simpleInterfacing.simpleTaskTwo(parameter);
    }

    public static void simpleTaskOne(int parameter) {
        System.out.println("Task one is to print the value of parameter: " + parameter);
    }

    public void simpleTaskTwo(int parameter) {
        System.out.println("Task one is to print the value of parameter's square: " + parameter * parameter);
    }
}
