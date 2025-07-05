package com.others;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

    private final BlockingQueue<String> queue;

    public OrderConsumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
