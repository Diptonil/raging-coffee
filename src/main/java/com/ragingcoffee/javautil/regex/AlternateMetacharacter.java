package com.ragingcoffee.javautil.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AlternateMetacharacter {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java|Python");
        Matcher matcher = pattern.matcher("Java");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("Realisticially, for most use-cases, Python is the better choice.");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("a");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        pattern = Pattern.compile("a|b");
        matcher = pattern.matcher("Java");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("Python");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        matcher = pattern.matcher("a");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }
    }
}
