package beforeJava8.features.multi_threading;

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
            the useless objects. So, that the number of bytes of free memory will be improved,
            with this free memory the main thread can continue its execution.

            Usually, the daemon threads having low priority but based on requirement daemon
            threads can run with high priority as well.

            Check Thread Daemon
            ===================
            We can check daemon nature of a thread by using the isDaemon() method of Thread
            class.
            public boolean isDaemon()

            Change Thread as Daemon
            =======================
            We can change the daemon nature of a thread by using the setDaemon() method of
            Thread class.
            public void setDaemon(boolean b)

            Changing the daemon nature of a thread is possible only before starting of a thread.
            After starting a thread, if we are trying to change the daemon nature, then will get
            the runtime exception saying IllegalThreadStateException.

            Default nature of Thread
            ========================
            By default, the Main thread is always non-daemon and for all remaining threads, daemon
            nature will be inherited from parent to child i.e., if parent thread is daemon, then
            the child thread is also daemon. If parent thread is non-daemon, then the child thread
            is also non-daemon.

            Can we change Main Tread's Daemon nature?
            =========================================
            It is impossible to change the daemon nature of the Main thread. Because, it is
            already started by JVM at the beginning of the program. If we try to change the
            daemon nature of main thread, then we will get the runtime exception saying
            IllegalThreadStateException.

            Termination of Daemon Thread
            ============================
            Whenever a last non-daemon thread terminates then all the daemon threads will be
            terminated irrespective of their position.
        */

        DaemonThreadDemo1 daemonThreadDemo = new DaemonThreadDemo1();
        System.out.println(daemonThreadDemo.isDaemon()); // False
        daemonThreadDemo.setDaemon(true);
        System.out.println(daemonThreadDemo.isDaemon());  // True
        System.out.println(Thread.currentThread().isDaemon()); // False
        // Thread.currentThread().setDaemon(true); - java.lang.IllegalThreadStateException

        /*
            In the below program, if we are commenting daemonThreadDemo2.setDaemon(true) line, then
            both the main and child threads are non-daemon and hence both threads will be executed
            until their completion. If we are not commenting daemonThreadDemo2.setDaemon(true) line,
            then main thread is non-daemon and child thread is daemon. Hence, whenever main thread
            terminates then the child thread will be terminated.
        */
        DaemonThreadDemo2 daemonThreadDemo2 = new DaemonThreadDemo2();
        daemonThreadDemo2.setDaemon(true);
        daemonThreadDemo2.start();
        System.out.println("End of Main Thread");
    }
}
class DaemonThreadDemo1 extends Thread {
}
class DaemonThreadDemo2 extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}