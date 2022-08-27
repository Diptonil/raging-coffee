package com.ragingcoffee.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotation {
    String information();
    int degree();
}

final class RunningClassFour {

    @MethodAnnotation(information = "Information about the first method.", degree = 1)
    public void methodOne(int integer) {
        System.out.print("The first method.");
    }

    @MethodAnnotation(information = "Information about the second method.", degree = 2)
    public void methodTwo(int integer, String string) {
        System.out.print("The second method.");
    }
}

public final class ReflectiveKnownAnnotation {
    
    public static void main(String[] args) {
        RunningClassFour runningClass = new RunningClassFour();

        Class<?> classToQuery = runningClass.getClass();
        try {
            Method firstMethod = classToQuery.getMethod("methodOne", int.class);
            Method secondMethod = classToQuery.getMethod("methodTwo", int.class, String.class);
            MethodAnnotation annotationOne = firstMethod.getAnnotation(MethodAnnotation.class);
            MethodAnnotation annotationTwo = secondMethod.getAnnotation(MethodAnnotation.class);
            System.out.println(annotationOne.information() + ", " + annotationOne.degree());
            System.out.println(annotationTwo.information() + ", " + annotationTwo.degree());
        } catch(NoSuchMethodException exception) {
            System.out.print("At least one method mentioned in the parameter is not found.");
        }
    }
}
