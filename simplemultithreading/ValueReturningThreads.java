package simplemultithreading;

import java.util.Random;

public final class ValueReturningThreads {
    public static void main(String[] args) {
        Generator thread1 = new Generator();
        for(int iterator = 0; iterator < 5; iterator ++) {
            thread1.thread.start();
            int number = thread1.getValue();
            Square thread2 = new Square(number);
            Cube thread3 = new Cube(number);
            thread2.thread.start();
            thread3.thread.start();
            try {
                Thread.sleep(1000);
            } catch (Exception exception) {
                System.out.print(exception.getMessage());
            }
        }
    }
}

final class Square implements Runnable {
    public Thread thread;
    private int number;

    Square(int number) {
        thread = new Thread(this, "Squaring Thread");
        this.number = number;
    }

    public void run() {
        System.out.println("Squaring thread: Square of number is " + number * number);
    }
}

final class Cube implements Runnable {
    public Thread thread;
    private int number;

    Cube(int number) {
        thread = new Thread(this, "Cubing Thread");
        this.number = number;
    }

    public void run() {
        System.out.println("Cubing thread: Cube of number is " + number * number * number);
    }
}

final class Generator implements Runnable {
    public Thread thread;
    private int number;

    Generator() {
        Random random = new Random();
        number = random.nextInt();
        thread = new Thread(this, "Generator Thread");
    }

    public void run() {
        System.out.println("Generator thread: Randomly generated number is " + number);
    }

    public int getValue() {
        return number;
    }
}
