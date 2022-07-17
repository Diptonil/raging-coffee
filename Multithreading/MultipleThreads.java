package Multithreading;

public class MultipleThreads {
    public static void main(String args[]) {
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

class ExampleThread implements Runnable {
    Thread thread;
    String threadName;

    ExampleThread(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        System.out.println(threadName + " thread has been created!");
    }
    
    public void run() {
        try {
            for(int iterator = 0; iterator <= 5; iterator ++) {
                System.out.println(iterator);
                Thread.sleep(1000);
            }
        } catch(InterruptedException exception) {
            System.out.println("Child thread interrupted.");
        } finally {
            System.out.println(threadName + " exiting.");
        }
    }
}
