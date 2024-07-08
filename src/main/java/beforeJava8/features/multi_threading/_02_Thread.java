package beforeJava8.features.multi_threading;

public class _02_Thread {

    public static void main(String[] args) {

        /*
            Thread
            ======
            Thread is flow of execution or lightweight process.

            Defining Thread
            ===============
            We can define a thread in the following two ways.
            1.	By extending Thread class
            2.	By implementing Runnable Interface
        */

        MyThread myThread = new MyThread();
        myThread.start();
        for( int i = 0; i < 5; i++){
            System.out.println("Main Thread From _02_Thread Class");
        }
    }
}

class MyThread extends Thread {

    public void run(){
        for( int i = 0; i < 5; i++){
            System.out.println("Child Thread From MyThread Class");
        }
    }
}