package com.others;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

    private final BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Dell Inspiration");
            queue.put("HP Enrich");
            queue.put("Acer Streak");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
