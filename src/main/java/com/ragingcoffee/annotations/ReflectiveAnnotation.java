package com.ragingcoffee.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotationWithFields {
    String information();
    int degree();
}

final class RunningClassThree {

    @MethodAnnotationWithFields(information = "Information about the first method.", degree = 1)
    public void methodOne() {
        System.out.print("The first method.");
    }

    @MethodAnnotationWithFields(information = "Information about the second method.", degree = 2)
    public void methodTwo() {
        System.out.print("The second method.");
    }
}

public final class ReflectiveAnnotation {
    
    public static void main(String[] args) {
        RunningClassThree runningClass = new RunningClassThree();
        Class<?> classToQuery = runningClass.getClass();
        
        try {
            Method firstMethod = classToQuery.getMethod("methodOne");
            Method secondMethod = classToQuery.getMethod("methodTwo");
            Annotation annotationOne = firstMethod.getAnnotation(MethodAnnotation.class);
            Annotation annotationTwo = secondMethod.getAnnotation(MethodAnnotation.class);
            System.out.println(annotationOne.toString());
            System.out.println(annotationTwo.toString());
        } catch(NoSuchMethodException exception) {
            System.out.print("At least one method mentioned in the parameter is not found.");
        }
    }
}
