package com.ragingcoffee.designpatterns.singleton;

final class EagerDatabase {

    private static final EagerDatabase DATABASE = new EagerDatabase();

    private EagerDatabase() {}

    public static EagerDatabase getInstance() {
        return DATABASE;
    }

    public boolean isConnected() {
        if (DATABASE == null) {
            return false;
        }
        return true;
    }
}

public final class EagerlyInitializedSingleton {

    public static void main(String[] args) {
        EagerDatabase databaseConnectionOne = EagerDatabase.getInstance();
        EagerDatabase databaseConnectionTwo = EagerDatabase.getInstance();
        System.out.println(databaseConnectionOne.isConnected() ? "Connection one active." : "Connection one inactive.");
        System.out.println(databaseConnectionTwo.isConnected() ? "Connection two active." : "Connection two inactive.");
    }
}
