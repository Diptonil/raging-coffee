package com.ragingcoffee.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface InformationAnnotation {
    String information();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DegreeAnnotation {
    int degree();
}

@InformationAnnotation(information = "The class.")
@DegreeAnnotation(degree = 0)
final class RunningClass {

    @InformationAnnotation(information = "The first method.")
    @DegreeAnnotation(degree = 1)
    public void methodOne() {
        System.out.print("The first method.");
    }

    @InformationAnnotation(information = "The second method.")
    @DegreeAnnotation(degree = 2)
    public void methodTwo() {
        System.out.print("The second method.");
    }
}

public final class AllAnnotation {
    
    public static void main(String[] args) {
        RunningClass runningClass = new RunningClass();
        Class<?> classToQuery = runningClass.getClass();

        try {
            Method firstMethod = classToQuery.getMethod("methodOne");
            Method secondMethod = classToQuery.getMethod("methodTwo");

            Annotation[] annotationMethodOne = firstMethod.getAnnotations();
            Annotation[] annotationMethodTwo = secondMethod.getAnnotations();
            Annotation[] annotationClass = classToQuery.getAnnotations();

            System.out.println("Class annotations:");
            for (Annotation iterator : annotationClass) {
                System.out.println(iterator.toString());
            }
            System.out.println("Method one annotations:");
            for (Annotation iterator : annotationMethodOne) {
                System.out.println(iterator.toString());
            }
            System.out.println("method two annotations:");
            for (Annotation iterator : annotationMethodTwo) {
                System.out.println(iterator.toString());
            }
        } catch(NoSuchMethodException exception) {
            System.out.print("At least one method mentioned in the parameter is not found.");
        }
    }
}
