package strings;

import java.util.Scanner;

public class StringSplit {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter personal details in format <name, dd/mm/yyyy>: ");
            String details[] = scan.nextLine().split(",");
            String name = details[0];
            String dob[] = details[1].split("/");
            System.out.print("Name: " + name + ", year born: " + dob[2] + ", month: " + dob[1] + ", day:" + dob[0]);
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }
}
