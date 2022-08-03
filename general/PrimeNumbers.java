package general;

import java.util.Scanner;

public final class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number whose to be checked: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println("This is a prime number.");
            } else {
                System.out.println("This is not a prime number.");
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int iterator = 2; iterator <= (int)Math.sqrt(number); iterator ++) {
            if (number % iterator == 0) {
                return false;
            }
        }
        return true;
    }
}