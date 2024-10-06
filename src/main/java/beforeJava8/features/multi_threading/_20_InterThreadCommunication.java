package beforeJava8.features.multi_threading;

public class _20_InterThreadCommunication {

    public static void main(String[] args) {

        /*
            Inter Thread Communication
            ==========================
            Two threads can communicate with each other by using wait(), notify() and notifyAll()
            methods. The thread which is expecting the update, is responsible to call the wait()
            method, then immediately the thread will enter into waiting state. The thread which
            is responsible to perform the update, after performing the update it's responsible
            to call the notify () method, then the waiting thread will get the notification and
            will continue its execution with those updated items.

            Wait(), Notify() and NotifyAll() methods present in object class but not in thread
            class. Because, the thread can call these methods on any Java objects.

            To call wait(), notify() or notifyAll() methods on any object, Thread should be the
            owner of that object i.e., thread should have lock of that object i.e., thread should
            be inside the synchronized area. Hence, we can call wait(), notify() and notifyAll()
            methods only from synchronized area otherwise we will get the runtime exception saying
            IllegalMonitorStateException.

            If a thread calls wait() method on any object, then the thread will immediately
            release the lock of that particular object and enter into a waiting state.

            If a thread calls notify() method on any object, then the thread will release the
            lock of that object but may not be immediately. Except wait(), notify() and
            notifyAll() there is no other methods were thread releases the lock.

            Method	        Is thread releases lock
            ======          =======================
            Yield ()	    No
            Join ()	        No
            Sleep ()	    No
            Wait ()	        Yes
            Notify ()	    Yes
            NotifyAll ()	Yes

            Prototypes of wait(), notify(), and notifyAll()
            ===============================================
            1.	public final void wait() throws InterruptedException
            2.	public final native void wait(long ms) throws InterruptedException
            3.	public final void wait(long ms, int ns) throws InterruptedException
            4.	public final native void notify()
            5.	public final native void notifyAll()

            Note:
            =====
            Every wait() method throws InterruptedException which is checked exception hence
            whenever we are using the wait() method, then compulsory we should handle the IE
            either by try catch or by 'throws' keyword. Otherwise, we will get the compile time
            error.

            If we call Thread.wait(), then as per the Thread life cycle, the running thread
            will move from running state to waiting state. Then from waiting state the thread
            will move into another waiting state on the following scenarios.

            1.	If thread gets notifications
            2.	If time expires
            3.	If waiting thread got Interrupted

            Thread will move to another waiting state to get the lock. If the thread got the
            lock, then thread will move to ready / runnable state.
        */
    }
}
