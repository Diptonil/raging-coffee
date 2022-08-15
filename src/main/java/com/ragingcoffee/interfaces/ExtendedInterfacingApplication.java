package com.ragingcoffee.interfaces;

interface InterfaceOne {
    void methodOne();
    void methodTwo();
}

interface InterfaceTwo extends InterfaceOne {
    void methodThree();
}

public final class ExtendedInterfacingApplication implements InterfaceTwo {
    
    public static void main(String[] args) {
        ExtendedInterfacingApplication extendedInterfacingApplication = new ExtendedInterfacingApplication();
        extendedInterfacingApplication.methodOne();
        extendedInterfacingApplication.methodTwo();
        extendedInterfacingApplication.methodThree();
    }

    public void methodOne() {
        System.out.println("Method one implemented.");
    }

    public void methodTwo() {
        System.out.println("Method two implemented.");
    }

    public void methodThree() {
        System.out.println("Method three implemented.");
    }
}
