package com.ragingcoffee.javautil.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class BasicPatternMatcher {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        pattern = Pattern.compile("Java 8");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }

        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Java 8");
        if (matcher.matches()) {
            System.out.print("The Matcher object has been able to find a match in the pattern.");
        } else {
            System.out.print("The Matcher object has not been able to find a match in the pattern.");
        }
    }
}
