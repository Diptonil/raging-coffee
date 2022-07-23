package system;

import java.io.Console;

public final class ConsoleInput {
    public static void main(String args[]) {
        Console console = System.console();

        System.out.print("Enter username: ");
        String username = console.readLine();
        
        System.out.print("Enter password: ");
        String password = String.valueOf(console.readPassword());

        System.out.print("Username and password is " + username + " & " + password + " respectively.");
    }
}
