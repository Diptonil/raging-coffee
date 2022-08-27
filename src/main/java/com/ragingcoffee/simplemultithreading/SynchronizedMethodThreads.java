package com.ragingcoffee.simplemultithreading;

public final class SynchronizedMethodThreads {
    
    public static void main(String[] args) {
        ThreadContentSynced threadContent = new ThreadContentSynced();
        ExampleThreadSynced thread1 = new ExampleThreadSynced(threadContent, "Thread One");
        ExampleThreadSynced thread2 = new ExampleThreadSynced(threadContent, "Thread Two");
        ExampleThreadSynced thread3 = new ExampleThreadSynced(threadContent, "Thread Three");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();
    }
}

final class ExampleThreadSynced implements Runnable {

    public Thread thread;
    private String threadName;
    private ThreadContentSynced threadContent;

    ExampleThreadSynced(ThreadContentSynced threadContent, String threadName) {
        this.threadContent = threadContent;
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    public void run() {
        threadContent.call(threadName + " is running now. Only this thread can access the shared resource (code) that runs.");
    }
}

final class ThreadContentSynced {

    synchronized public void call(String message) {
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