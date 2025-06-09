package com.executorservice;

import java.util.concurrent.*;

public class CallableFutureDemo {

    public static void main(String[] args) {

        SumProcessor[] processes = {new SumProcessor(10), new SumProcessor(20),
                new SumProcessor(30), new SumProcessor(40),
                new SumProcessor(50)};
        ExecutorService service = Executors.newFixedThreadPool(2);
        for(SumProcessor process : processes) {
            Future<Integer> future = service.submit(process);
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
