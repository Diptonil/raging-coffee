package divideandconquer;

import java.util.Scanner;

public final class FibonacciNumber {
    public static void main(String[] args) {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the position of the element for which the Fibonacci number is to be obtained: ");
            number = scanner.nextInt();
            System.out.print("The Fibonacci number is: " + fibonacciNumber(number));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static int fibonacciNumber(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }
}
