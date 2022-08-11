package divideandconquer;

import java.util.Scanner;

public final class HouseRobber {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of houses: ");
            int totalHouses = scanner.nextInt();
            int[] houses = new int[totalHouses];
            int iterator;
            System.out.print("Enter avaiable loot in the houses: ");
            for (iterator = 0; iterator < totalHouses; iterator ++) {
                houses[iterator] = scanner.nextInt();
            }
            int maxProfit = houseRobber(houses, 0);
            System.out.print("The maximum profit that may be derived by robbing smartly (without robbing adjacent homes): " + maxProfit);
        }
    }

    private static int houseRobber(int[] houses, int currentHouse) {
        if (currentHouse >= houses.length) {
            return 0;
        }

        int stealFromCurrent = houses[currentHouse] + houseRobber(houses, currentHouse + 2);
        int stealFromNext = houseRobber(houses, currentHouse + 1);

        return Math.max(stealFromCurrent, stealFromNext);
    }
}
