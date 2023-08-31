package java7andbelow.features.multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _29_ThreadPool {
    public static void main(String[] args) {

        /*
            Thread Pools (Executor Framework)
            =================================
            Creating a new thread for every job may create performance and memory problems.
            To overcome this, we should go for Thread Pool. Thread Pool is a pool of already
            created threads ready to do our jobs. Java 1.5 version introduced the Thread Pool
            Framework to implement the Thread Pools. Thread Pool framework is also known as
            Executor Framework.

            We can create a Thread Pool as follows,

            Executor Service serv = Executors.newFixedThreadPool(3);

            We can submit a runnable job by using submit method.
            serv.submit(job);

            We can shut down the executor service using shutdown method.
            serv.shutdown();
        */

        PrintJob[] jobs = { new PrintJob("John"), new PrintJob("Alex"), new PrintJob("Blake"), new PrintJob("Eric")};
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for( PrintJob job : jobs){
            executorService.submit(job);
        }
        executorService.shutdown();
    }
}

class PrintJob implements Runnable {

    String name;
    PrintJob(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name +" job started by Thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(name +" job completed by Thread "+Thread.currentThread().getName());
    }
}