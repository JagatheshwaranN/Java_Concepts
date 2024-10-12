package preparation.revise_1.thread;

public class ThreadByThreadClassDemo {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        System.out.println(Thread.currentThread().getName()+ " - Main Method");
        thread.start();
    }

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ " - Thread Run Method");
        }
    }
}
