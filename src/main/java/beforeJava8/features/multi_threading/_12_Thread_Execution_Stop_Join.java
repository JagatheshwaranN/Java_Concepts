package beforeJava8.features.multi_threading;

public class _12_Thread_Execution_Stop_Join {
    public static void main(String[] args) {

        /*
            Join() (Two Friends–Adv java and SCJP Classes–1 class completed–Completed
             person waiting for another person)
            =========================================================================
            If a thread wants to wait until the completion some other thread, then we should
            go for Join() method.

            For example, If a thread t1 wants to wait until the completion of t2, then t1 has
            to call t2.join(). If t1 executes t2.join() then immediately t1 will be entered
            into waiting state until t2 completes. Once, t2 completes, then t1 can continue
            its execution.

            Venue fixing activity (Thread t1)
            Wedding card printing activity (Thread t2) -> t1.join()
            Wedding card distribution activity (Thread t3) -> t2.join()

            Wedding cards printing thread (t2) has to wait until venue fixing thread(t1)
            completion. Hence, t2 has to call t1.join(), Wedding cards distribution thread (t3)
            has to wait until Wedding cards printing thread (t2) completion. Hence, t3 has to
            call t2.join().

            Prototype of Join()
            ===================
            public final void join() throws InterruptedException;
            public final void join(long ms) throws InterruptedException;
            public final void join(long ms, int ns) throws InterruptedException;

            Note: Every join method throws InterruptedException which is checked exception.
            Hence, we should handle this exception either by using try catch or by using throws
            keyword. Otherwise, we will get the compile time error.

            If we call Thread.join(), then as per the Thread life cycle, the running thread
            will move from running state to waiting state (Blocked for Joining). Then from
            waiting state the thread will move to ready/runnable state on the following
            scenarios.

            1.	If thread t1 completes execution (Let’s assume thread2 calls join on thread t1)
            2.	If time expires
            3.	If waiting thread got interrupted (Mrunal Thakur came and ask for coffee)
        */
    }
}
