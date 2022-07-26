package greedyalgorithms;

import java.util.Scanner;

public final class CoinChange {
    public static void main(String[] args) {
        int iterator;
        int currency = 0;
        int[] coins = new int[8];
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 1000};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Available denominations are: 1, 2, 5, 10, 20, 50, 100, 1000");
            System.out.print("Enter currency: ");
            currency = scanner.nextInt();
        } catch(Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }

        for (iterator = 7; iterator > -1; iterator -- ) {
            coins[iterator] = (currency / denominations[iterator]);
            currency -= coins[iterator] * denominations[iterator];
        }
        System.out.println("All denominations: ");
        for (iterator = 7; iterator > -1; iterator -- ) {
            System.out.println("Coins valued at " + denominations[iterator] + ": " + coins[iterator]);
        }
    }
}
