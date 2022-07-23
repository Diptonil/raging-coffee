package multithreading;

public final class SuspendAndResumeThreads {
    public static void main(String[] args) {
        ExampleThread thread1 = new ExampleThread("Thread One");
        ExampleThread thread2 = new ExampleThread("Thread Two");
        int threadValue;

        thread1.thread.start();
        thread2.thread.start();

        while (thread1.thread.isAlive()) {
            threadValue = thread1.getValue();
            if (threadValue == 4) {
                System.out.println("Thread One suspended for five seconds.");
                thread1.suspend();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException exception) {
                    System.out.print("Main thread has been interrupted.");
                }
                thread1.resume();
            }
        }

        try {
            thread2.thread.join();
            thread1.thread.join();
        } catch (InterruptedException exception) {
            System.out.print("Main thread has been interrupted.");
        }
    }
}

final class ExampleThread implements Runnable {
    public Thread thread;
    private String threadName;
    private boolean isSuspended;
    private int iterator;

    ExampleThread(String threadName) {
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    public void run() {
        try {
            for (iterator = 0; iterator < 10; iterator ++) {
                System.out.println(threadName + ": " + iterator);
                Thread.sleep(1000);
                synchronized (this) {
                    while (isSuspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException exception) {
            System.out.println(threadName + " has been interrupted.");
        }
    }

    public int getValue() {
        return iterator;
    }

    synchronized void suspend() {
        isSuspended = true;
    }

    synchronized void resume() {
        isSuspended = false;
        notify();   
    }
}