package preparation.revise_2.threads;

@SuppressWarnings("All")
public class ThreadNamePriorityDemo {

    public static void main(String[] args) throws InterruptedException {
        int priority = Thread.currentThread().getPriority();
        System.out.println(Thread.currentThread().getName() + " Thread Priority ==> " + priority);
        MyThread3 thread3 = new MyThread3();
        thread3.start();
        Thread.sleep(2);
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

@SuppressWarnings("All")
class MyThread3 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + " Thread Priority ==> " + Thread.currentThread().getPriority());
        Thread.currentThread().setName("Child Thread");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName() + " Thread Priority ==> " + Thread.currentThread().getPriority());
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
