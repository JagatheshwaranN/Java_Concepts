package java7andbelow.features.multi_threading;

public class _04_Runnable {
    public static void main(String[] args) {

        /*
            By implementing Runnable Interface
            ==================================
            We can define a Thread by implementing the Runnable Interface. Runnable
            Interface present in java.lang package, and it contains only one method
            which is run() method.

            MyThread   => Thread(C)  => Runnable(I) <=> Approach 1
            MyRunnable => Runnable(I)  <=> Approach 2

            Note: We will get mixed output and we can’t tell the exact output.
        */

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread from _04_Runnable class");
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Child Thread from MyRunnable class");
        }
    }
}
