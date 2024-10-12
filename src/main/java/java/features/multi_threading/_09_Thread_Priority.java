package java.features.multi_threading;

public class _09_Thread_Priority {

    public static void main(String[] args) {

        /*
            Thread Priorities
            =================
            Every thread in java has some priority. It may be default priority generated
            by JVM or customized priority provided by programmer. The valid range of thread
            priorities is 1 to 10 where 1 is MIN priority and 10 is MAX priority. Thread
            class defines the following constants to represents some standard priorities,

            Thread.MIN_PRIORITY  = 1
            Thread.NORM_PRIORITY = 5
            Thread.MAX_PRIORITY  = 10

            Who use Thread Priority?
            ========================
            Thread scheduler uses priorities while allocating processor. The thread which is
            having the highest priority will get the first chance.

            If two threads having same priority then we can't expect the exact execution order,
            and it depends on the Thread scheduler.

            Define Thread Priority (Getting and Setting priority of a Thread)
            =================================================================
            Thread class defines the following methods to get and set priorities of a Thread.

            public final int getPriority();
            public final void setPriority (int P);

            Allowed value range for priority is 1 to 10. If we try to give other values,
            then we will get the runtime exception saying IllegalArgumentException.

            t.setPriority (5);
            t.setPriority (15); -> RE: IllegalArgumentException

            The default priority for main thread is 5 and for all other threads, the
            default priority will be inherited from Parent to Child i.e., whatever
            priority Parent thread has the same priority will be applicable to the
            Child thread.
        */

        System.out.println(Thread.currentThread().getName() +" == "+Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(8);

        MyThread3 myThread3 = new MyThread3();
        System.out.println(myThread3.getName() +" == "+myThread3.getPriority());

        System.out.println(Thread.currentThread().getName() +" == "+Thread.currentThread().getPriority());

        myThread3.setPriority(10);
        System.out.println(myThread3.getName() +" == "+myThread3.getPriority());
        myThread3.start();

        for(int i = 0; i < 20; i++){
            System.out.println("Main Thread From _09_Thread_Priority Class");
        }

        /*
            Note
            ====
            If we are commenting setPriority line, then both main and child threads have same
            priority 5 and hence we can't expect the execution order and exact output. If we
            are not commenting the setPriority line, then main thread has priority 5 and child
            thread has priority 10, then child thread will get the chance first then followed
            by main thread.

            Some platforms (Operating System) won't provide the proper support for the Thread
            Priorities.
        */
    }
}

class MyThread3 extends Thread {
    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println("Child Thread From MyThread3 Class");
        }
    }
}