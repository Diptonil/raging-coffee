package com.ragingcoffee.simplemultithreading;

public final class SynchronizedStatementThreads {
    
    public static void main(String[] args) {
        ThreadContent threadContent = new ThreadContent();
        ExampleThread thread1 = new ExampleThread(threadContent, "Thread One");
        ExampleThread thread2 = new ExampleThread(threadContent, "Thread Two");
        ExampleThread thread3 = new ExampleThread(threadContent, "Thread Three");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();
    }
}

final class ExampleThread implements Runnable {

    public Thread thread;
    private String threadName;
    private ThreadContent threadContent;

    ExampleThread(ThreadContent threadContent, String threadName) {
        this.threadContent = threadContent;
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    public void run() {
        synchronized (threadContent) {
            threadContent.call(threadName + " is running now. Only this thread can access the shared resource (code) that runs.");
        }
    }
}

final class ThreadContent {

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