package com.ragingcoffee.javautil.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ZeroMoreQuantifier {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java*");
        Matcher matcher = pattern.matcher("Java");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("Jav");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("Javaaaa");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("javaJavjavaaa");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("aaa");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }
    }
}
