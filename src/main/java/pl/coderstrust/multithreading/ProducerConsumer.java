package pl.coderstrust.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private static BlockingQueue<Integer> commonQueue = new ArrayBlockingQueue<>(10);

    private static void produce() {

        int value;
        for (value = 1; value < 100000; value++) {

            System.out.println("Produced: " + value);

            try {
                commonQueue.put(value);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private static void consume() {

        while (true) {

            int value2 = 0;
            try {
                value2 = commonQueue.take();
                System.out.println("Consumed: " + value2);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> produce());

        Thread t2 = new Thread(() -> consume());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}