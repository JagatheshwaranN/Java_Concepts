package beforeJava8.features.multi_threading;

public class _27_ConcurrentPackage {
    public static void main(String[] args) {

        /*
            Concurrent Package
            ==================
            The problems with the traditional synchronized keyword,

            1.	We are not having any flexibility to try for a lock without waiting.

            2.	There is no way to specify maximum waiting time for a thread to get the
                lock so that the thread will wait until getting the lock which may creates
                performance issues and causes deadlock.

            3.	If a thread releases the lock, then which waiting thread will get that lock,
                we are not having any control on this.

            4.	There is no API to list out all waiting threads for a lock.

            5.	The synchronized keyword, compulsory we have to use at method level or within
                the method, and it's not possible to use across multiple methods.

            To overcome these problems, SUN people introduced the java.util.concurrent.locks
            package in Java 1.5 version. It also provides the several enhancements to the
            programmer to provide more control on the concurrency.
        */

        /*
            Lock Interface
            ==============
            Lock object is similar to the implicit lock acquired by a thread to execute the
            synchronized method or block. Lock implementations provide more extensive
            operations than the traditional implicit locks.

            Important methods of Lock Interface
            ===================================
            void lock()
            ===========
            We can use this method to acquire a lock, if a lock is already available then
            immediately the current thread will get that lock. If the lock is not available,
            then it will wait until getting the lock. It is exactly same behavior of traditional
            synchronized keyword.

            boolean tryLock()
            =================
            To acquire the lock without waiting. If the lock is available then the thread
            acquires the lock and returns true. If the lock is not available then this will
            return false and continue its execution without waiting. In this case, the thread
            never enters into waiting state.

            if (l.tryLock ()) {
            perform safe operation;
            }
            else {
            Perform alternative operation;
            }

            boolean tryLock(long time, TimeUnit unit)
            =========================================
            If lock is available, then the thread will get the lock and continue its execution.
            If the lock is not available then the thread will wait until the specified amount of
            time, still if the lock is not available then the thread can continue its execution.

            TimeUnit is an enum present in java.util.concurrent package.
            enum TimeUnit {
            NANOSECONDS
            MICROSECONDS
            MILLISECONDS
            SECONDS
            MINUTES
            HOURS
            DAYS
            }

            if (l.tryLock (1000, TimeUnit.MILLISECONDS)) {
            }

            void lockInterruptibly()
            ========================
            Acquires the lock if its available and returns immediately. If the lock is not
            available then it will wait, while waiting if the thread is interrupted then the
            thread won't get the lock.

            void unlock()
            =============
            To call this method, compulsory the current thread should be the owner of the lock
            otherwise we will get the runtime exception saying IllegalMonitorStateException.

            ReentrantLock
            =============
            It is the implementation class of lock interface and its direct child class of
            object. Reentrant means a thread can acquire same lock multiple times without
            any issue. Internally reentrant lock implements the thread's personal count
            whenever we call lock method decrements the count value, and whenever the thread
            calls the unlock method, the lock will be released whenever count reaches zero.

            Constructors
            ============
            ReentrantLock re = new ReentrantLock();
            ReentrantLock re = new ReentrantLock(boolean fairness);

            Creates ReentrantLock with the given fairness policy. If the fairness is true,
            then the longest waiting thread can acquire the lock if it's available. i.e.,
            it follows First Come, First Served policy. If fairness is false, then which
            waiting thread will get the chance we can't expect.

            The default value for fairness is False.

            The following declarations are possible
            =======================================
            ReentrantLock re = new ReentrantLock();
            ReentrantLock re = new ReentrantLock(true);
            ReentrantLock re = new ReentrantLock(false);

            Important methods of ReentrantLock
            ==================================
            void lock()

            boolean tryLock()

            boolean tryLock(long l, TimeUnit t)

            void lockInterruptibly()

            void unlock()

            int getHoldCount()
            Returns the number of holds on this lock by the current thread.

            boolean isHeldByCurrentThread()
            Returns true if and only if lock is hold by current thread.

            int getQueueLength()
            Returns number of threads waiting for the lock.

            Collection getQueuedThreads()
            It returns a collection of threads which are waiting to get the lock.

            boolean hasQueuedThreads()
            Returns true if any thread waiting to get the lock.

            boolean isLocked()
            Returns true if the lock is acquired by some thread.

            boolean isFair()
            Returns true if the fairness policy set with true value.

            Thread getOwner()
            Returns the thread which acquires the lock.
        */
    }
}