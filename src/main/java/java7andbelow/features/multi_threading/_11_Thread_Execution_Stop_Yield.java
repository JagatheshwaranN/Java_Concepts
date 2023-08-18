package java7andbelow.features.multi_threading;

public class _11_Thread_Execution_Stop_Yield {
    public static void main(String[] args) {

        /*
            Stop Thread Execution Temporarily
            =================================
            We can prevent a Thread execution by using the following methods,
            1.	Yield()
            2.	Join()
            3.	Sleep()

            Yield() (Public Telephone Booth – Long Batsman – Urgent Message – 90’s )
            ========================================================================
            Yield() is used to pause the current executing thread to give the chance for
            other waiting threads of same priority. If there are no waiting threads or all
            waiting threads have low priority, then the same thread can continue the execution.

            If multiple threads are waiting with same priority, then which waiting thread will
            get the chance, we can't expect, and it depends on the Thread scheduler.

            The thread which is yielded, when it will get the chance once again, it depends on
            the Thread Scheduler, and we can't expect exactly when it will get the chance.

            Prototype of Yield()
            ====================
            public static native void yield();
            If we call Thread.yield(), then as per the Thread life cycle, the running thread
            will move from running state to ready/runnable state.

            In the below program, if we are commenting Thread.yield() method, then both the
            threads will execute simultaneously, and we can't expect which thread will complete
            first. If we are not commenting Thread.yield() method, then child thread always
            calls the yield() method, because of that the main thread will get the chance a
            greater number of times and the chance of completing main thread first is high.

            Note: Some platforms (OS) won't provide proper support for yield () method.
        */
        YieldDemo yieldDemo = new YieldDemo();
        yieldDemo.start();
        for(int i = 0; i < 10; i++){
            System.out.println("Main Thread");
        }
    }
}
class YieldDemo extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}