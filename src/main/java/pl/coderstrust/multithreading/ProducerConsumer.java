package pl.coderstrust.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private static BlockingQueue<Integer> commonQueue = new ArrayBlockingQueue<Integer>(10);
    int capacity = 10;

    private static void produce() throws InterruptedException {

        int value;
        for (value = 1; value < 100000; value++) {

            System.out.println("Produced: " + value);

            commonQueue.put(value);
            Thread.sleep(1400);
        }

    }

    private static void consume() throws InterruptedException {

        while (true) {

            int value2 = commonQueue.take();
            System.out.println("Consumed: " + value2);
            Thread.sleep(1300);

        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {

                try {
                    consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}