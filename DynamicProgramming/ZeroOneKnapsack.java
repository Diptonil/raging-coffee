package dynamicprogramming;

import java.util.Scanner;

public class ZeroOneKnapsack {
    private static int capacity;
    private static int items;
    private static int weight[];
    private static int gain[];

    public static void main(String args[]) {
        getValues();
        System.out.println("Entered data:");
        displayValues();
        System.out.print("The total profit obtained is " + dynamicProgram());
    }

    public static void getValues() {
        try(Scanner scan = new Scanner(System.in)) {
            int iterator;   
            System.out.print("Enter knapsack items: ");
            items = scan.nextInt();
            weight = new int[items];
            gain = new int[items];
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
        } catch(Exception exception) {
            System.out.print(exception.getMessage());
        }
    }

    public static void displayValues() {
        for(int iterator = 0; iterator < items; iterator ++) {
            System.out.println("Item\tWeight\tGain");
            System.out.println(iterator + 1 + "\t" + weight[iterator] + gain[iterator]);
        }
    }
    
    public static int dynamicProgram() {
        int matrix[][] = new int[items + 1][capacity + 1];
        int current_capacity;
        for(int item = 0; item <= items; item ++) {
            for(current_capacity = 0; current_capacity <= capacity; current_capacity ++) {
                if(item == 0 || current_capacity == 0) {
                    matrix[item][current_capacity] = 0;
                } else if(current_capacity >= weight[item - 1]) {
                    matrix[item][current_capacity] = max(matrix[item - 1][current_capacity], gain[item - 1] + matrix[item - 1][current_capacity - weight[item - 1]]);
                } else {
                    matrix[item][current_capacity] = matrix[item - 1][current_capacity];
                }

            }
        }
        return matrix[items][capacity];
    }

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
}