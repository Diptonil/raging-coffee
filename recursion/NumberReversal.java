package recursion;

public final class NumberReversal {

    private static int externalVariable = 0;
    
    public static void main(String[] args) {
        int number = 9;
        int digits = (int)(Math.log10(number)) + 1;
        reverseWithExternalVariable(number);
        System.out.println("The reverse of " + number + " using external variable is " + externalVariable + ".");
        System.out.print("The reverse of " + number + " using external variable is " + reverseWithExtraParameter(number, digits) + ".");

    }

    public static void reverseWithExternalVariable(int number) {
        if (number % 10 == number) {
            externalVariable = number % 10 + externalVariable * 10;
            return;
        }
        externalVariable = number % 10 + externalVariable * 10;
        reverseWithExternalVariable(number);
    }

    public static int reverseWithExtraParameter(int number, int digits) {
        if (number % 10 == number) {
            return number;
        }
        return (number % 10) * (int)(Math.pow(10, digits - 1)) + reverseWithExtraParameter(number / 10, digits - 1);
    }
}
