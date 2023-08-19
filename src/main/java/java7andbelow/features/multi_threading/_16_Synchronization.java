package java7andbelow.features.multi_threading;

public class _16_Synchronization {

    public static void main(String[] args) {

        /*
            Synchronization
            ===============
            CommonMan Example scenario for Synchronized keyword introduction
            ================================================================
            Biryani inconsistency problem when dogs try to eat.

            Synchronized is a modifier applicable only for methods and blocks but not
            for classes and variables. If multiple threads are trying to operate
            simultaneously on the same java object, then there may be a chance of data
            inconsistent problem. To overcome this problem, we should go for Synchronized
            keyword. If a method or block is declared as synchronized then at a time only
            one thread is allowed to execute that method or block on the given object. So,
            the data inconsistent problem will be resolved.

            The main advantage of the synchronized keyword is we can resolve the data
            inconsistent problem.

            The main disadvantage of the synchronized keyword is, it increases the waiting
            of the thread and creates the performance problem. Hence, if there is no specific
            requirement it's not recommended to use the synchronized keyword.

            Internally the synchronization concept is implemented by using the lock and
            every object in Java has a unique lock. Whenever we are using the synchronized
            keyword then only the lock concept will come into picture.

            If a thread wants to execute the synchronized method on the given object, first
            it has to get the lock of that object, once the thread got the lock then it's
            allowed to execute any synchronized method on that object.

            Once the method execution completes, automatically the thread releases the lock.
            Acquiring and releasing "lock" internally take care by JVM and programmer not
            responsible for this activity.

            While a thread executing synchronized method on the given object the remaining
            threads are not allowed to execute any synchronized method on the same object.
            But the remaining threads are allowed to execute the non-synchronized methods
            simultaneously.

            Example,
            class Test {
            synchronized m1 ();
            synchronized m2 ();
            m3 ();
            }
            Here, if thread t1 is executing the m1(), then if thread t2 comes in and tries to
            execute the same m1() / m2(), it’s not possible since the t1 has already acquired
            the lock and executing the m1() on the object. So, the thread t2 will move into
            waiting state. But, if thread t3 comes in and tries to execute the m3() then it’s
            allowed to execute as it's a non-synchronized method.

            Note:
            =====
            Lock concept is implemented based on the object but not based on the method.

            An object should have two areas such as synchronized and non-synchronized, the
            non-synchronized area can be accessed by any number of threads simultaneously
            but the synchronized area can be accessed by only one thread.

            Synchronized Area
            =================
            Where ever we are performing update operations [Add / Remove / Delete / Replace]
            i.e., where state of object is changing.

            Non-Synchronized Area
            =====================
            Where ever the object state won't be changed like [Read] operation.

            Example,
            class ReservationSystem {

            public void checkAvailability () {
            }

            public synchronized void bookTicket () {
            }

            }



        */
    }
}
