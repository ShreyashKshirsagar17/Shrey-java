package dsa;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {

    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (queue.size() == capacity)
            wait();

        queue.add(value);

        System.out.println("Produced : " + value);

        notifyAll();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (queue.isEmpty())
            wait();

        int value = queue.poll();

        System.out.println("Consumed : " + value);

        notifyAll();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {

            int value = 1;

            while (true) {
                try {
                    buffer.produce(value++);
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        Thread consumer = new Thread(() -> {

            while (true) {
                try {
                    buffer.consume();
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        producer.start();
        consumer.start();
    }
}