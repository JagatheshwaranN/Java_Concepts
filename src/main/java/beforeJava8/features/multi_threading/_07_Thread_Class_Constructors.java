package beforeJava8.features.multi_threading;

public class _07_Thread_Class_Constructors {

    public static void main(String[] args) {

        /*
            Thread Class Constructors
            =========================
            Thread t1 = new Thread ();
            Thread t2 = new Thread (Runnable r);
            Thread t3 = new Thread (String name);
            Thread t4 = new Thread (Runnable r, String name);
            Thread t5 = new Thread (ThreadGroup g, String name);
            Thread t6 = new Thread (ThreadGroup g, Runnable r);
            Thread t7 = new Thread (ThreadGroup g, Runnable r, String name);
            Thread t8 = new Thread (ThreadGroup g, Runnable r, String name, long stackSize);
        */

        // Another approach to Define a Thread (Not recommended to USE)
        MyThread1 thread = new MyThread1();
        Thread t = new Thread(thread);
        t.start();
        System.out.println("Main Thread");
    }
}

// Another approach to Define a Thread (Not recommended to USE)
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Child Thread");
    }
}