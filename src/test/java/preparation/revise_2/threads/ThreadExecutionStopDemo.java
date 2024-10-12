package preparation.revise_2.threads;

public class ThreadExecutionStopDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread4 thread4 = new MyThread4();
        thread4.start();
        Runnable runnable = new MyThread5();
        Thread thread5 = new Thread(runnable);
        thread5.start();
        thread4.join();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }


}

class MyThread4 extends Thread {

    @Override
    public void run() {
        Thread.currentThread().setName("child");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread5 implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("child-thread5");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}