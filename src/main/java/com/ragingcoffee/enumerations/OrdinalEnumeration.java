package com.ragingcoffee.enumerations;

public final class OrdinalEnumeration {

    public static void main(String[] args) {
        Color colorOne = Color.Red;
        Color colorTwo = Color.Blue;
        Color colorSimilar = Color.Red;

        System.out.println("The ordinal values of the enum:");
        for (Color iterator : Color.values()) {
            System.out.println("Of " + iterator + ": " + iterator.ordinal());
        }

        if (colorTwo.compareTo(colorOne) < 0) {
            System.out.println(colorOne + " is, with repect to list position (ordinality), greater than " + colorTwo);
        } else if (colorTwo.compareTo(colorOne) > 0) {
            System.out.println(colorTwo + " is, with repect to list position (ordinality), greater than " + colorOne);
        } else {
            System.out.println("Both colors have same ordinality");
        }

        if (colorOne == colorSimilar) {
            System.out.println("Both colors are same");
        }

        if (colorOne.equals(colorSimilar)) {
            System.out.println("Both colors are same");
        }
    }
}