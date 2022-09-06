package com.ragingcoffee.javalang.reflection;

public final class Cat {
    
    private final String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public static void speakDefault() {
        System.out.println(": This is a public static method. Meow!");
    }

    public void speak(String speech) {
        System.out.println(name + ": This is a public method. " + speech);
    }
}
