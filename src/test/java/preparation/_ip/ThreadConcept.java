package preparation._ip;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadConcept {

    public static void main(String[] args) {
        executorFixedThreadPool();
        executorCachedThreadPool();
        Counter counter = new Counter();
        counter.increment();
        counter.displayCounter();
        new ThreadConcept().syncBlockDemo();
        new MyThread().start();
        new Thread(new MyThread2()).start();
    }

    private static void executorFixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(() -> {
            System.out.println("Executed by ThreadPool");
        });
        service.shutdown();
    }

    private static void executorCachedThreadPool() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(() -> {
            System.out.println("Executed by Cached ThreadPool");
        });
        service.shutdown();
    }

    static class Counter {

        private int counter = 0;

        synchronized void increment() {
            counter++;
        }

        void displayCounter() {
            System.out.println(counter);
        }
    }

    private void syncBlockDemo() {
        System.out.println("Inside SyncBlockDemo");
        synchronized (this) {
            System.out.println("Thread Safe syncBlockDemo");
        }
    }

    static class MyThread extends Thread {

        @SuppressWarnings("preview")
        @Override
        public void run() {
            System.out.println(STR."\{Thread.currentThread().getName()} executes Thread Class run() method");
        }
    }

    static class MyThread2 implements Runnable {

        @SuppressWarnings("preview")
        @Override
        public void run() {
            System.out.println(STR."\{Thread.currentThread().getName()} executes Runnable Interface run() method");
        }
    }

}

