package multithreading;

public class WaitingThreads {
    public static void main(String[] args) {
        ThreadContent threadContent = new ThreadContent();
        ProducerThread producerThread = new ProducerThread(threadContent);
        ConsumerThread consumerThread = new ConsumerThread(threadContent);

        producerThread.thread.start();
        consumerThread.thread.start();
    }
}

class ProducerThread implements Runnable {
    public Thread thread;
    private String threadName;
    private ThreadContent threadContent;

    ProducerThread(ThreadContent threadContent) {
        this.threadName = "Producer Thread";
        thread = new Thread(this, threadName);
        this.threadContent = threadContent;
    }

    public void run() {
        for (int iterator = 0; ; iterator ++) {
            threadContent.produce(iterator);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.print("Producer thread interrupted.");
            }
        }
    }
}

class ConsumerThread implements Runnable {
    public Thread thread;
    private String threadName;
    private ThreadContent threadContent;

    ConsumerThread(ThreadContent threadContent) {
        this.threadName = "Consumer Thread";
        thread = new Thread(this, threadName);
        this.threadContent = threadContent;
    }

    public void run() {
        for (int iterator = 0; iterator < 10; iterator ++) {
            threadContent.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                System.out.print("Consumer thread interrupted.");
            }
        }
    }
}

class ThreadContent {
    private int number;
    private boolean flag = false;

    synchronized public void produce(int number) {
        while (flag){
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println("Producer thread interrupted.");
            }
            this.number = number;
            System.out.println("Produced value: " + number);
            notify();
        }
    }

    synchronized public void consume() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println("Consumer thread interrupted.");
            }
            System.out.println("Consumed value: " + number);
            flag = false;
            notify();
        }
    }
}
