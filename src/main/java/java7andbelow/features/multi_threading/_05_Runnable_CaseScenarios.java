package java7andbelow.features.multi_threading;

public class _05_Runnable_CaseScenarios {
    public static void main(String[] args) {

        /*
            Case Scenarios
            ==============
            MyRunnable r = new MyRunnable();
            Thread t1 = new Thread();
            Thread t2 = new Thread(r);

            Case 1: t1.start()
            ==================
            A new thread will be created and which is responsible for the execution
            of Thread class run() method, which has empty implementation.

            Case 2: t1.run()
            ================
            No new thread will be created and Thread class run () method will be executed
            just like a normal method call.

            Case 3: t2.start()
            ==================
            A new thread will be created, which is responsible for execution of MyRunnable
            class run() method.

            Case 4: t2.run()
            ================
            A new thread won’t be created and MyRunnable run() method will be executed
            just like a normal method call.

            Case 5: r.start()
            =================
            We will get compile time error saying MyRunnable class doesn't have start
            capability.
            CE: Cannot find symbol

            Case 6: r.run()
            ===============
            No new thread will be created and MyRunnable run () method will be executed like normal method call.
        */

        MyRunnableDemo r = new MyRunnableDemo();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        // Case 1
        t1.start();
        System.out.println("======================");

        // Case 2
        t1.run();
        System.out.println("======================");

        // Case 3
        t2.start();
        System.out.println("======================");

        // Case 4
        t2.run();
        System.out.println("======================");

        // Case 5
        // java: cannot find symbol
        // symbol:   method start()
        // location: variable r of type java7andbelow.features.multi_threading.MyRunnableDemo
        // r.start();
        System.out.println("======================");

        // Case 6
        r.run();
        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread from _05_Runnable_CaseScenarios class");
        }
    }
}
class MyRunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread from MyRunnableDemo class");
        }
    }
}