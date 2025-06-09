package com.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        BankProcessor[] processList = {new BankProcessor("ATM"), new BankProcessor("Cheque"), new BankProcessor("Online")};
        ExecutorService service = Executors.newFixedThreadPool(2);
        for(BankProcessor process : processList){
            service.submit(process);
        }
    }

}
