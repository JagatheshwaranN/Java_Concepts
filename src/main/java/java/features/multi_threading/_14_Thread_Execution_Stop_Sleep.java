package java.features.multi_threading;

public class _14_Thread_Execution_Stop_Sleep {

    public static void main(String[] args) throws InterruptedException {

        /*
            Sleep()
            =======
            If a thread doesn't want to perform any operation for a particular amount
            of time, then we should go for sleep method.

            Prototype of Sleep()
            ====================
            public static native void sleep (long ms) throws InterruptedException
            public static void sleep (long ms, int ns) throws InterruptedException

            Note: Every sleep() method throws InterruptedException, which is checked
            exception. Hence, whenever we are using the sleep() method, compulsory we
            should handle InterruptedException either by try catch or by 'throws' keyword.
            Otherwise, we will get the compile time error.

            If we call Thread.sleep(), then as per the Thread life cycle, the running
            thread will move from running state to sleeping state. Then from sleeping
            state the thread will move to ready / runnable state on the following
            scenarios.
            1.	If time expires
            2.	If sleeping thread got Interrupted

            How a Thread can interrupt another Thread?
            ==========================================
            A thread can interrupt a sleeping thread or waiting thread by using the
            interrupt() method of Thread class.

            public void interrupt()

            Interrupt Case Scenarios
            ========================
            Case 1:
            =======
            If we comment threadSleepDemo1.interrupt line then main thread won't interrupt
            the child thread. In this case, the child thread will execute for loop for 5
            times. If we are not commenting threadSleepDemo1.interrupt line, then main thread
            interrupts the child thread.

            Note:
            =====
            Whenever we are calling the interrupt() method, if the target thread is not in
            sleeping or waiting state, then there is no impact of interrupt call immediately.
            Interrupt call will be waited until the target thread enters into sleeping or
            waiting state. If the target thread enters into sleeping or waiting state, then
            immediately interrupt call will interrupt the target thread.

            Case 2:
            =======
            If the target thread never entered into sleeping or waiting state in its lifetime,
            then there is no impact of interrupt call. This is the only case were interrupt
            call will be wasted.

            In the below example, the interrupt call waited until child thread completes the
            for loop for 100 times.
        */

        for( int i = 0; i < 5; i++){
            System.out.println("Increment - "+i);
            Thread.sleep(1000);
        }
        System.out.println("====================================");
        ThreadSleepDemo1 threadSleepDemo1 = new ThreadSleepDemo1();
        threadSleepDemo1.start();
        threadSleepDemo1.interrupt();
        System.out.println("End of Main thread");
        System.out.println("====================================");
        ThreadSleepDemo2 threadSleepDemo2 = new ThreadSleepDemo2();
        threadSleepDemo2.start();
        threadSleepDemo2.interrupt();
        System.out.println("End of Main thread");
    }
}

class ThreadSleepDemo1 extends Thread {
    public void run() {
        try{
            for( int i = 0; i < 10; i++){
                System.out.println("Lazy child thread");
                Thread.sleep(3000);
            }
        }catch (InterruptedException ex){
            System.out.println("Child thread, I got interrupted");
        }
    }
}

class ThreadSleepDemo2 extends Thread {
    public void run() {
        for( int i = 0; i < 100; i++){
                System.out.println("Lazy child thread");
        }
        System.out.println("Child thread, I'm entering into sleeping state");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            System.out.println("Child thread, I got interrupted");
        }
    }
}