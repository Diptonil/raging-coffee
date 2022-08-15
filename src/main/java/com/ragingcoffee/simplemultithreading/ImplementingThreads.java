package com.ragingcoffee.simplemultithreading;

public final class ImplementingThreads {

    public static void main(String[] args) {
        ExampleThread childThread = new ExampleThread("Child Thread");
        childThread.thread.start();
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

final class ExampleThread implements Runnable {
    
    public Thread thread;

    ExampleThread(String threadName) {
        thread = new Thread(this, threadName);
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