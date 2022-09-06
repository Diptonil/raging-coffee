package com.ragingcoffee.javalang.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Runner {
    
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Tom", 82);
        examineDeclaredFields(cat);
        examineDeclaredMethods(cat);
        alterPrivateValues(cat);
        invokeMethods(cat);
    }

    private static void examineDeclaredFields(Cat cat) {
        Field[] fields = cat.getClass().getDeclaredFields();

        System.out.print("All fields defined in the given class are: ");
        for (Field field : fields) {
            System.out.print(field.getName() + "\t");
        }
    }

    private static void examineDeclaredMethods(Cat cat) {
        Method[] methods = cat.getClass().getDeclaredMethods();

        System.out.print("All methods defined in the given class are: ");
        for (Method method : methods) {
            System.out.print(method.getName() + "\t");
        }
    }

    private static void alterPrivateValues(Cat cat) throws Exception {
        System.out.println("Name:" + cat.getName());
        System.out.println("Age:" + cat.getAge());

        Field[] fields = cat.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(cat, "Crookshanks");
            }
            if (field.getName().equals("age")) {
                field.setAccessible(true);
                field.set(cat, 420);
            }
        }

        System.out.println("New name:" + cat.getName());
        System.out.println("New age:" + cat.getAge());
    }

    private static void invokeMethods(Cat cat) throws Exception{
        Method[] methods = cat.getClass().getDeclaredMethods();

        System.out.println("All methods invokations are: ");
        for (Method method : methods) {
            System.out.print("\t");
            method.setAccessible(true);

            if (method.getName().equals("speak")) {
                method.invoke(cat, "Reflection works... but at what cost?");
            }
            if (method.getName().equals("speakDefault")) {
                method.invoke(null);
            }
        }
    }
}
