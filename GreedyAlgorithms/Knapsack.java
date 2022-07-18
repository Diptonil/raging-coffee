package GreedyAlgorithms;
import java.util.Scanner;

public class Knapsack {
    private static int capacity, items, weight[], gain[];
    private static float ratio[];

    public static void main(String args[]) {
        getValues();
        System.out.println("Entered data:");
        displayValues();
        sort();
        System.out.println("Sorted data:");
        displayValues();
        System.out.println("Profits: " + profit());
    }

    public static void getValues() {
        try(Scanner scan = new Scanner(System.in)) {
            int iterator;   
            System.out.print("Enter knapsack items: ");
            items = scan.nextInt();
            weight = new int[items];
            gain = new int[items];
            ratio = new float[items];
            System.out.print("Enter knapsack capacity: ");
            capacity = scan.nextInt();
            System.out.print("Enter knapsack weights in order: ");
            for(iterator = 0; iterator < items; iterator ++) {
                weight[iterator] = scan.nextInt();
            }
            System.out.print("Enter knapsack gains in order: ");
            for(iterator = 0; iterator < items; iterator ++) {
                gain[iterator] = scan.nextInt();
            }
            for(iterator = 0; iterator < items; iterator ++) {
                ratio[iterator] = gain[iterator] / weight[iterator];
            }
        } catch(Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

    public static void displayValues() {
        int iterator;
        for(iterator = 0; iterator < items; iterator ++) {
            System.out.println("Item\tWeight\tGain\tRatio of gain to weight");
            System.out.println(iterator + 1 + "\t" + weight[iterator] + gain[iterator] + ratio[iterator]);
        }
    }

    public static void sort() {
        int outer_iterator, inner_iterator, copy;
        float copy_ratio;
        for(outer_iterator = 0; outer_iterator < items; outer_iterator ++) {
            for(inner_iterator = 1; inner_iterator < (items - outer_iterator); inner_iterator ++) {
                if (ratio[inner_iterator - 1] < ratio[inner_iterator]) {
                    copy_ratio = ratio[inner_iterator - 1];
                    ratio[inner_iterator - 1] = ratio[inner_iterator];
                    ratio[inner_iterator] = copy_ratio;
                    copy = weight[inner_iterator];
                    weight[inner_iterator] = weight[inner_iterator - 1];
                    weight[inner_iterator - 1] = copy;
                    copy = gain[inner_iterator];
                    gain[inner_iterator] = gain[inner_iterator - 1];
                    gain[inner_iterator - 1] = copy;
                }
            }
        }
    }

    public static float profit() {
        int space = capacity, iterator = 0;
        float profit = 0;
        while (space > 0 && iterator < items) {
            if(weight[iterator] < space) {
                space -= weight[iterator];
                profit += gain[iterator];
            } else {
                profit += gain[iterator] * ((float)space / (float)weight[iterator]);
            }
            iterator ++;
        }
        return profit;
    }
}
