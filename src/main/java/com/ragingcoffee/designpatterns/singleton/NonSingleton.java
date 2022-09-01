package com.ragingcoffee.designpatterns.singleton;

final class Database {

    Database() {
        System.out.println("Object created.");
    }

    public boolean isConnected() {
        return true;
    }
}

public final class NonSingleton {
    
    public static void main(String[] args) {
        Database databaseConnectionOne = new Database();
        Database databaseConnectionTwo = new Database();
        System.out.println(databaseConnectionOne.isConnected() ? "Connection one active." : "Connection one inactive.");
        System.out.println(databaseConnectionTwo.isConnected() ? "Connection two active." : "Connection two inactive.");
    }
}