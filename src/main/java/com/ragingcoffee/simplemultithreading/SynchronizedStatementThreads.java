package com.ragingcoffee.simplemultithreading;

public final class SynchronizedStatementThreads {
    
    public static void main(String[] args) {
        ThreadContentStatement threadContent = new ThreadContentStatement();
        ExampleThreadStatement thread1 = new ExampleThreadStatement(threadContent, "Thread One");
        ExampleThreadStatement thread2 = new ExampleThreadStatement(threadContent, "Thread Two");
        ExampleThreadStatement thread3 = new ExampleThreadStatement(threadContent, "Thread Three");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();
    }
}
final class ExampleThreadStatement implements Runnable {

    public Thread thread;
    private String threadName;
    private ThreadContentStatement threadContent;

    ExampleThreadStatement(ThreadContentStatement threadContent, String threadName) {
        this.threadContent = threadContent;
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    public void run() {
        threadContent.call(threadName + " is running now. Only this thread can access the shared resource (code) that runs.");
    }
}

final class ThreadContentStatement {

    public void call(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.print("Thread has been interrupted.");
        } finally {
            System.out.println("]");
        }
    }
}