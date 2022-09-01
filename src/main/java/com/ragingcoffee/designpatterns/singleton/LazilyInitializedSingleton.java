package com.ragingcoffee.designpatterns.singleton;

final class LazyDatabase {

    private static LazyDatabase database;

    private LazyDatabase() {}

    public static synchronized LazyDatabase getInstance() {
        if (database == null) {
            database = new LazyDatabase();
            System.out.println("Object created.");
        }
        return database;
    }

    public boolean isConnected() {
        if (database == null) {
            return false;
        }
        return true;
    }
}

public final class LazilyInitializedSingleton {

    public static void main(String[] args) {
        LazyDatabase databaseConnectionOne = LazyDatabase.getInstance();
        LazyDatabase databaseConnectionTwo = LazyDatabase.getInstance();
        System.out.println(databaseConnectionOne.isConnected() ? "Connection one active." : "Connection one inactive.");
        System.out.println(databaseConnectionTwo.isConnected() ? "Connection two active." : "Connection two inactive.");
    }
}