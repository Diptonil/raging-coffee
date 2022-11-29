package com.ragingcoffee.javautil.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class OccurenceFinder {
    
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("java");
        Matcher matcher = pattern.matcher("javajavajajava");
        int count = 0;

        while(matcher.find()) {
            count ++;
        }

        System.out.print("The number of matches: " + count);
    }
}
