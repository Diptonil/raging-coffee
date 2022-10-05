package com.ragingcoffee.strings;

import java.util.Scanner;

public final class StringSplit {
    
    public static String split(String input) {
        try {
            String details[] = input.split(",");
            String name = details[0];
            String dob[] = details[1].split("/");
            return "Name: " + name + "\nYear born: " + dob[2] + "\nMonth: " + dob[1] + "\nDay:" + dob[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "Commas or backslashes absent from the input string.";
        }
    }

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter personal details in format <name, dd/mm/yyyy>: ");
            String input = scan.nextLine();
            System.out.print(split(input));
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }
}
