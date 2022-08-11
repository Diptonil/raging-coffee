package divideandconquer;

import java.util.Scanner;

public final class NumberFactor {
    
    public static void main(String[] args) {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number to be expressed as sum of 1, 3 and 4: ");
            number = scanner.nextInt();
            System.out.print("The number of possibilities are: " + numberFactor(number));
        } catch (Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static int numberFactor(int number) {
        if (number == 0 || number == 1 || number == 2) {
            return 1;
        } else if (number == 3) {
            return 2;
        }

        int minusOne = numberFactor(number - 1);
        int minusThree = numberFactor(number - 3);
        int minusFour = numberFactor(number - 4);

        return minusFour + minusThree + minusOne;
    }
}
