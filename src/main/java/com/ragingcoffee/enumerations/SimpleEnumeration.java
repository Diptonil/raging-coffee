package com.ragingcoffee.enumerations;

enum Color {
    Red, Blue, Green, Black, White
}

public final class SimpleEnumeration {

    public static void main(String[] args) {
        Color color;
        color = Color.White;

        System.out.println("The value of the color variable is " + color);

        if (color == Color.Black) {
            System.out.println("There is no color.");
        } else {
            System.out.println("There is an actual color.");
        }

        switch (color) {
            case Black:
                System.out.println("Color is black.");
                break;
            case White:
                System.out.println("Color is white.");
                break;
            case Blue:
                System.out.println("Color is blue.");
                break;
            case Red:
                System.out.println("Color is red.");
                break;
            case Green:
                System.out.println("Color is green.");
        }
    }
}