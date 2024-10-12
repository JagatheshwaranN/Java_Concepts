package java.features.multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _29_ThreadPool {
    public static void main(String[] args) {

        /*
            Thread Pools (Executor Framework)
            =================================
            Creating a new thread for every job may create performance and memory problems.
            To overcome this, we should go for ThreadPool. ThreadPool is a pool of already
            created threads ready to do our jobs. Java 1.5 version introduced the ThreadPool
            Framework to implement the ThreadPools. ThreadPool framework is also known as
            Executor Framework.

            We can create a ThreadPool as follows,

            ExecutorService serv = Executors.newFixedThreadPool(3);

            We can submit a runnable job by using submit method.
            serv.submit(job);

            We can shut down the ExecutorService using shutdown method.
            serv.shutdown();
        */

        /*
            In the below example, two threads are responsible to execute the 4 Jobs. So that a
            single thread can be reused for multiple jobs.

            Note:
            =====
            While developing/designing the web servers / application servers we can use the
            ThreadPool concept.
        */
        PrintJob[] jobs = { new PrintJob("John"), new PrintJob("Alex"),
                new PrintJob("Blake"), new PrintJob("Eric")};
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
        System.out.println(name +" job started by a Thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(name +" job completed by a Thread "+Thread.currentThread().getName());
    }
}