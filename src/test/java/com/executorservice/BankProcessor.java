package com.executorservice;

public class BankProcessor implements Runnable {

    public String name;

    BankProcessor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(STR."\{name} Bank Proccesses started with \{Thread.currentThread().getName()}");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(STR."\{name} Bank Proccesses completed with \{Thread.currentThread().getName()}");
    }
}
