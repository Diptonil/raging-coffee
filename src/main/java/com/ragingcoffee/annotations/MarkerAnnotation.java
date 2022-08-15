package com.ragingcoffee.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Marker {}

final class RunningClass {

    @Marker()
    public void methodOne() {
        System.out.print("A marked method.");
    }

    public void methodTwo() {
        System.out.print("An unmarked method.");
    }

    public void methodThree() {
        System.out.print("An unmarked method.");
    }

    @Marker
    public void methodFour() {
        System.out.print("Another marked method.");
    }

    public void methodFive() {
        System.out.print("An unmarked method.");
    }
}

public final class MarkerAnnotation {
    
    public static void main(String[] args) {
        RunningClass runningClass = new RunningClass();
        Class<?> classToQuery = runningClass.getClass();
        String[] methodNames = {"methodOne", "methodTwo", "methodThree", "methodFour", "methodFive"};
        try {
            Method method;
            for (String methodName : methodNames) {
                method = classToQuery.getMethod(methodName);
                if (method.isAnnotationPresent(Marker.class)) {
                    System.out.println("Methods with marker: " + methodName);
                }
            }
        } catch (NoSuchMethodException exception) {
            System.out.print("At least one method mentioned in the parameter is not found.");
        }
    }
}
