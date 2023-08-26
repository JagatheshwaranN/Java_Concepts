package java7andbelow.features.multi_threading;

public class _24_Daemon_Thread {
    public static void main(String[] args) {

        /*
            Daemon Thread (Film Shooting and backend workers example)
            =========================================================
            The threads which are running in the background are called as daemon threads.

            Example,
            Garbage collector
            Signal dispatcher
            Attach listener, etc.

            Objective
            =========
            The main objective of the daemon thread is to provide the support for non-daemon
            threads (Main thread).

            For example,
            If main thread runs with low memory, then JVM runs the Garbage collector to destroy
            the useless objects. So, that number of bytes of free memory will be improved, with
            this free memory the main thread can continue its execution.

            Usually, the daemon threads having low priority but based on requirement daemon
            threads can run with high priority as well.

            Check Thread Daemon
            ===================
            We can check daemon nature of a thread by using the isDaemon() method of Thread
            class.
            public boolean isDaemon ()

            Change Thread as Daemon
            =======================
            We can change the daemon nature of a thread by using the setDaemon() method of
            Thread class.
            public void setDaemon (boolean b)

            Changing of daemon nature of a thread is possible only before starting of a thread.
            After starting a thread, if we are trying to change the daemon nature, then will get
            the runtime exception saying IllegalThreadStateException.
        */
    }
}
