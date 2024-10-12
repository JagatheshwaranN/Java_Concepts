package preparation.revise_1.thread;

public class ThreadByRunnableIFaceDemo {

    public static void main(String[] args) {

        MyThread runMyThread = new MyThread();
        System.out.println(Thread.currentThread().getName()+ " - Main Method");
        Thread thread = new Thread(runMyThread);
        thread.start();
    }

    public static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ " - Thread Run Method");
        }
    }
}
