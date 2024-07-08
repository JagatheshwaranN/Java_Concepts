package beforeJava8.features.multi_threading;

public class _31_ThreadLocal {

    public static void main(String[] args) {

        /*
            Thread Local
            ============
            ThreadLocal class provides the thread local variables. ThreadLocal class maintains
            the values per Thread basis. Each ThreadLocal object maintains a separate value like
            user id, transaction id, etc. For each Thread that access that object. Thread can
            access its local value, manipulate its value and even can remove its value. In every
            part of the code which is executed by the Thread we can access its local variable.

            Example,
            Consider a servlet which invokes some business methods. We have a requirement to
            generate the unique transaction id for each and every request, and we have to pass
            this transaction ids to the business methods. For this requirement, we can use
            ThreadLocal to maintain a separate transaction id for every request i.e., for every
            thread.

            Note:
            =====
            ThreadLocal class introduced in Java 1.2 version and enhanced in Java 1.5 version.
            ThreadLocal can be associated with Thread Scope. Total code which is executed by the
            Thread have access to corresponding ThreadLocal variables. A thread can access its
            own local variables and can't access other threads local variables. Once the thread
            enters into dead state, all its local variables are eligible for Garbage collection.

            Constructor
            ===========
            ThreadLocal tl = new ThreadLocal();
            Creates a ThreadLocal variables.

            Methods
            =======
            Object get()
            ============
            Returns the value of the ThreadLocal variable associated with the current thread.

            Object initialValue()
            =====================
            Returns the initial value of the ThreadLocal variable associated with the current
            thread. The default implementation of this method returns Null. To customize our
            own initial value, we have to override this method.

            void set(object newValue)
            =========================
            To set a new value of the current thread.

            void remove()
            =============
            It is newly added method in Java 1.5 version to remove the value of the ThreadLocal
            associated with the current thread. After removal if we are trying to access, it
            will be reinitialized once again by invoking its initial value method.
        */

        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println(threadLocal.get());
        threadLocal.set("Java");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        System.out.println(threadLocal.get());

        ThreadLocal threadLocal2 = new ThreadLocal(){
            @Override
            public Object initialValue() {
                return "abc";
            }
        };
        System.out.println(threadLocal2.get());
        threadLocal2.set("Java");
        System.out.println(threadLocal2.get());
        threadLocal2.remove();
        System.out.println(threadLocal2.get());

        /*
            In the below program, for every customer thread a separate customer id will be
             maintained by ThreadLocal object.
        */
        CustomerThread customerThread1 = new CustomerThread("John");
        CustomerThread customerThread2 = new CustomerThread("Alex");
        CustomerThread customerThread3 = new CustomerThread("Blake");
        customerThread1.start();
        customerThread2.start();
        customerThread3.start();
    }
}

 class CustomerThread extends Thread {

    static Integer custId = 0;

    private static ThreadLocal threadLocal = new ThreadLocal(){
        protected Integer initialValue(){
            return ++custId;
        }
    };

    CustomerThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" executing the customer id "+threadLocal.get());
    }
 }
