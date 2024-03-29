package com.ragingcoffee.enumerations;

enum UpgradedColor {
    Red(1), Blue(2), Green(0), Black(3), White(3);

    private int cred;

    UpgradedColor(int cred) {
        this.cred = cred;
    }

    int getCred() {
        return cred;
    }
}

public final class UpgradedEnumeration {
    
    public static void main(String[] args) {
        UpgradedColor color = UpgradedColor.Blue;
        System.out.println("The street credibility of the blue color variable is " + color.getCred());

        System.out.println("The respective credibilities of all colors thus defined are:");
        for (UpgradedColor iterator : UpgradedColor.values()) {
            System.out.println("The credibility of the color " + iterator + " is " + iterator.getCred());
        }
    }
}
