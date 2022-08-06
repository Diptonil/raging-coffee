package simplemultithreading;

public final class JoiningThreads {
    public static void main(String args[]) {
        ExampleThread thread1 = new ExampleThread("Thread One");
        ExampleThread thread2 = new ExampleThread("Thread Two");
        ExampleThread thread3 = new ExampleThread("Thread Three");

        thread1.thread.start();
        thread2.thread.start();
        thread3.thread.start();

        System.out.println("Thread One status:" + thread1.thread.isAlive());
        System.out.println("Thread Two status:" + thread2.thread.isAlive());
        System.out.println("Thread Three status:" + thread3.thread.isAlive());
        
        try {
            thread1.thread.join();
            thread2.thread.join();
            thread3.thread.join();
        } catch(InterruptedException exception) {
            System.out.println("Main thread interrupted.");
        } finally {
            System.out.println("Thread One status:" + thread1.thread.isAlive());
            System.out.println("Thread Two status:" + thread2.thread.isAlive());
            System.out.println("Thread Three status:" + thread3.thread.isAlive());
            System.out.println("Main thread exiting.");
        }
    }
}

final class ExampleThread implements Runnable {
    public Thread thread;
    private String threadName;

    ExampleThread(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
    }

    public void run() {
        for(int iterator = 0; iterator < 5; iterator ++) {
            try {
                System.out.println(threadName + ": " + iterator);
                Thread.sleep(1000);
            } catch(InterruptedException exception) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " exiting.");
    }
}
