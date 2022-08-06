package interfaces;

import java.util.Random;

interface SimpleInterface {
    void simpleTaskOne(int parameter);
    void simpleTaskTwo(int parameter);
    default void simpleTaskThree(int parameter) {
        System.out.println("Task two is to print the value of parameter's cube: " + parameter * parameter * parameter);
    }
    default void simpleTaskFour(int parameter) {
        System.out.println("We'll leave this method not used by the implementing class.");
    }
    default void simpleTaskFive(int parameter) {}
}

public final class DefaultInterfacingApplication implements SimpleInterface{
    private static final int BOUND = 100;

    public static void main(String[] args) {
        DefaultInterfacingApplication defaultInterfacingApplication = new DefaultInterfacingApplication();
        Random random = new Random();

        int parameter = random.nextInt(BOUND);

        defaultInterfacingApplication.simpleTaskOne(parameter);
        defaultInterfacingApplication.simpleTaskTwo(parameter);
        defaultInterfacingApplication.simpleTaskThree(parameter);
    }

    public void simpleTaskOne(int parameter) {
        System.out.println("Task one is to print the value of parameter: " + parameter);
    }

    public void simpleTaskTwo(int parameter) {
        System.out.println("Task two is to print the value of parameter's square: " + parameter * parameter);
    }
}
