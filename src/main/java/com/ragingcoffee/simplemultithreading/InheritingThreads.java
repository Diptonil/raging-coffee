package com.ragingcoffee.simplemultithreading;

public final class InheritingThreads {
    
    public static void main(String[] args) {
        ExampleThreadExtendable childThread = new ExampleThreadExtendable("Child Thread");
        childThread.start();
        try {
            for(int iterator = 0; iterator <= 5; iterator ++) {
                System.out.println(iterator);
                Thread.sleep(1000);
            }
        } catch(InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        } finally {
            System.out.println("Main thread exiting.");
        }
    }
}

final class ExampleThreadExtendable extends Thread {

    ExampleThreadExtendable(String threadName) {
        super(threadName);
        System.out.println(threadName + " thread has been created!");
    }

    public void run() {
        try {
            for(int iterator = 0; iterator <= 5; iterator ++) {
                System.out.println(iterator);
                Thread.sleep(500);
            }
        } catch(InterruptedException exception) {
            System.out.println("Child thread interrupted.");
        } finally {
            System.out.println("Child thread exiting.");
        }
    }
}