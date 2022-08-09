package recursion;

public final class Factorial {

    public static void main(String[] args) {
        int number = 9;
        System.out.print("The value of the factorial of " + number + " is " + factorial(number) + ".");
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(-- number);
    }
}