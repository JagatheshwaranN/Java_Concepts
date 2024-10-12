package java.features.multi_threading;

public class _26_ThreadGroup {

    public static void main(String[] args) {

        /*
        Thread Group
        ============
        Based on the functionality, we can group the threads into a single unit is called as
        Thread Group i.e., a thread group contains a group of threads. In addition to threads,
        the thread group can also contain sub thread groups.

        The main advantage of maintaining the threads in the form of Thread Group is, we can
        perform the common operations very easily.

        Every thread in Java belongs to some group. Main thread belongs to Main group. Every
        Thread Group in Java is a child group of System Group either directly or indirectly.
        Hence, System Group acts as root for all Thread Groups in Java.

        System Group contains several system level threads like,
        1.	Garbage Collector
        2.	Reference Handler
        3.	Signal Dispatcher
        4.	Attach Listener, etc.

        ThreadGroup is a Java class present in java.lang package and its direct child class
        of Object.

        ThreadGroup Constructors
        ========================

        ThreadGroup g = new ThreadGroup(String groupName);
        Creates a new ThreadGroup with the specified group name. The parent of this new thread
        group is currently executing thread.

        ThreadGroup g = new ThreadGroup(ThreadGroup g, String groupName);
        Creates a new ThreadGroup with the specified group name. The parent of this new thread
        group is specified parent group.
    */
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup threadGroup = new ThreadGroup("First Group");
        System.out.println(threadGroup.getParent().getName());

        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup, "Second Group");
        System.out.println(threadGroup2.getParent().getName());

        /*
            Important methods of ThreadGroup Class
            ======================================
            1.	String getName(); -> To get the name of the ThreadGroup.
            2.	int getMaxPriority(); -> To get the default max priority of the ThreadGroup.
            3.	void setMaxPriority(int p); -> To set the specific max priority of the
                ThreadGroup.
            4.	ThreadGroup getParent(); -> Returns parent group of current thread.
            5.	void list(); -> It prints information about ThreadGroup to the Console.
            6.	int activeCount(); -> It returns the number of active threads in the ThreadGroup.
            7.	int activeGroupCount(); -> It returns the number of active groups in the current
                ThreadGroup.
            8.	int enumerate(Thread[] t); -> To copy all active threads of ThreadGroup into
                provided Thread Array. In this case, sub thread group threads also will be
                considered.
            9.	int enumerate(ThreadGroup[] tg); -> To copy all active sub thread groups into
                ThreadGroup Array.
            10.	boolean isDaemon(); -> To check whether the ThreadGroup is Daemon or not.
            11.	void setDaemon(boolean b); -> To change the Daemon nature of ThreadGroup.
            12.	void interrupt(); -> To interrupt all waiting / sleeping threads in the
                ThreadGroup.
            13.	void destroy(); -> To destroy ThreadGroup and its sub ThreadGroups.

            The default max priority is 10 for both Thread and ThreadGroup.

            Threads in the ThreadGroup that already have higher priority won't be affected
            but for newly added threads the new max priority is applicable.
        */
    }
}
