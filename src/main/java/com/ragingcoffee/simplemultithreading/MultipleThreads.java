package com.ragingcoffee.simplemultithreading;

public final class MultipleThreads {

    public static void main(String[] args) {
        ExampleThread childThread1 = new ExampleThread("First Thread");
        ExampleThread childThread2 = new ExampleThread("Second Thread");
        ExampleThread childThread3 = new ExampleThread("Third Thread");

        childThread1.thread.start();
        childThread2.thread.start();
        childThread3.thread.start();

        try {
            Thread.sleep(6000);
        } catch(InterruptedException exception) {
            System.out.print("Main thread interrupted.");
        } finally {
            System.out.println("Main thread exiting.");
        }
    }
}
