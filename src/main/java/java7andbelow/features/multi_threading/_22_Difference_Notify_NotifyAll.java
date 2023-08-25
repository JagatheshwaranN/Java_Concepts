package java7andbelow.features.multi_threading;

public class _22_Difference_Notify_NotifyAll {
    public static void main(String[] args) {

        /*
            Difference between Notify and NotifyAll
            =======================================
            We can use notify() method for only one waiting thread. If multiple threads are
            waiting, then only one thread will be notified then remaining threads have to wait
            for further notifications and which thread will be notified we can't expect, it
            depends on the JVM.

            We can use notifyAll() to give the notification for all waiting threads of a
            particular object. Even though multiple threads notified but execution will be
            performed one by one because the threads require lock and only one lock is
            available.
            Example - Waiting for Bus in Bus station and getting into bus one by one scenario

            Note:
            =====
            On which object we are calling wait() method, then thread requires the lock of that
            object.

            For example, if we are calling wait() method on s1, then we have to get the lock of
            s1 object but not s2 object.

            Stack s1 = new Stack ();
            Stack s2 = new Stack ();

            synchronized (s2)
            {
            s1.wait (); -> IllegalMonitorStateException
            }

            synchronized (s1)
            {
            s1.wait ();
            }
        */
    }
}
