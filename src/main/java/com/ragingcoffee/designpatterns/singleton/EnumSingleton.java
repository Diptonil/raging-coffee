package com.ragingcoffee.designpatterns.singleton;

enum EnumDatabase {
    DATABASE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

public final class EnumSingleton {

    public static void main(String[] args) {
        EnumDatabase enumDatabaseOne = EnumDatabase.DATABASE;
        EnumDatabase enumDatabaseTwo = EnumDatabase.DATABASE;
        System.out.println(enumDatabaseOne);
        System.out.println(enumDatabaseTwo);
    }
}
