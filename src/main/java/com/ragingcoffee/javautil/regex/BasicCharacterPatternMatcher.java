package com.ragingcoffee.javautil.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class BasicCharacterPatternMatcher {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Java");
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
    }
}
