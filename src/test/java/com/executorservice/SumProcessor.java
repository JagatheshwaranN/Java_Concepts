package com.executorservice;

import java.util.concurrent.Callable;

public class SumProcessor implements Callable<Integer> {

    public int number;

    public SumProcessor(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(STR."\{Thread.currentThread().getName()} calculates sum of numbers till \{number} is \{sum}");
        return sum;
    }

}
