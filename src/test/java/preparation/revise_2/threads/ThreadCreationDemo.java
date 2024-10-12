package preparation.revise_2.threads;

@SuppressWarnings("All")
public class ThreadCreationDemo {

    public static void main(String[] args) {
        for(int i = 0 ; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+i);
        }
        MyThread thread1 = new MyThread();
        thread1.start();

        Runnable runnable = new MyThread2();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

}

@SuppressWarnings("All")
class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0 ; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+i);
        }
    }
}

@SuppressWarnings("All")
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+i);
        }
    }
}
