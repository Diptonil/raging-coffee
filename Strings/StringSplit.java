package Strings;
import java.util.Scanner;

public class StringSplit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter personal details in format <name, dd/mm/yyyy>: ");
        String details[] = scan.nextLine().split(",");
        String name = details[0], dob[] = details[1].split("/");
        System.out.print("Name: " + name + ", year born: " + dob[2] + ", month: " + dob[1] + ", day:" + dob[0]);
        scan.close();
    }
}
