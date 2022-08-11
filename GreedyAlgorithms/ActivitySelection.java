package greedyalgorithms;

import java.util.Scanner;

public final class ActivitySelection {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter types of possible tasks: ");
            int iterator;
            int taskCount = scanner.nextInt();
            int[] startTime = new int[taskCount];
            int[] endTime = new int[taskCount];
            System.out.print("Enter starting time of all tasks: ");
            for (iterator = 0; iterator < taskCount; iterator ++) {
                startTime[iterator] = scanner.nextInt();
            }
            System.out.print("Enter ending time of all tasks: ");
            for (iterator = 0; iterator < taskCount; iterator ++) {
                endTime[iterator] = scanner.nextInt();
            }
            int totalTasks = activitySelection(startTime, endTime);
            System.out.print("Total tasks that may be performed: " + totalTasks);
        } catch(Exception exception) {
            System.out.print("Some problem with the Scanner resource has occured.");
        }
    }

    private static int activitySelection(int[] startTime, int[] endTime) {
        int iterator;
        int totalTasks = 1;
        int max = endTime[0];

        sort(startTime, endTime);
        for (iterator = 0; iterator < endTime.length - 1; iterator ++) {
            if (max <= startTime[iterator + 1]) {
                max = endTime[iterator];
                totalTasks ++;
            }
        }

        return totalTasks;
    }

    private static void sort(int[] startTime, int[] endTime) {
        int inner_iterator;
        int outer_iterator;
        int copy;

        for (outer_iterator = 0; outer_iterator < endTime.length; outer_iterator ++) {
            for (inner_iterator = 1; inner_iterator < endTime.length - outer_iterator; inner_iterator ++) {
                if (endTime[inner_iterator] < endTime[inner_iterator - 1]) {
                    copy = endTime[inner_iterator];
                    endTime[inner_iterator] = endTime[inner_iterator - 1];
                    endTime[inner_iterator - 1] = copy;
                    copy = startTime[inner_iterator];
                    startTime[inner_iterator] = startTime[inner_iterator - 1];
                    startTime[inner_iterator - 1] = copy;
                }
            }
        }
    }
}
