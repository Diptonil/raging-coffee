package com.ragingcoffee.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface ExampleAnnotation {
    String information();
    int degree();
}

public final class SimpleAnnotation {

    @ExampleAnnotation(information = "This is the main method", degree = 1)
    public static void main(String[] args) {
        System.out.print("This is the main method.");
    }
}