package pl.coderstrust.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    private static BlockingQueue<Integer> commonQueue = new ArrayBlockingQueue<Integer>(10);
    int capacity = 10;

    private void produce() throws InterruptedException {

        int value = 0;
        for (value = 0; value < 100000; value++) {
            wait();

            System.out.println("Produced: " + value);

            commonQueue.put(value);
        }

    }

    private void consume() throws InterruptedException {

        while (commonQueue.size() == 0) {

            wait();
            int value2 = commonQueue.take();
            System.out.println("Consumed: " + value2);
            Thread.sleep(2000);

        }
    }

    public static main(String[] args) throws InterruptedException {

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
