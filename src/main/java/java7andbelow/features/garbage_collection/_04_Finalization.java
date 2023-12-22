package java7andbelow.features.garbage_collection;

public class _04_Finalization {

    public static void main(String[] args) {

        /*
            Finalization
            ============
            Just before destroying an object, GC calls finalize() method to perform
            cleanup activities. Once, finalize() method completes, automatically GC
            destroys that object. finalize() method present in the object class with
            the following declaration:

            protected void finalize() throws throwable;

            We can override the finalize() method in our class to define our own cleanup
            activities.

            Case Scenarios
            ==============
            Case 1
            ======
            Just before destroying an object, GC calls finalize() method which is eligible
            for GC. Then the corresponding class finalize() method will be executed.
            For example, if a String object is eligible for GC, then String class finalize()
            method will be executed but not Test class finalize() method.

            Case 2
            ======
            Based on our requirement, we can call finalize() method explicitly then it will
            be executed just like a normal method call and the object won't be destroyed.

            Case 3
            ======
            If we are calling finalize() method and while executing finalize() method if any
            exception is raised and if it is uncaught then JVM terminates our program abnormally
            by raising the exception. If GC executes finalize() method and while executing
            finalize() method if any exception is raised and uncaught, then JVM ignores the
            exception, and the rest of the program continues normally.

            Case 4
            ======
            Even though object eligible for GC multiple times but GC calls finalize() method
            only once.

            Case 5
            ======
            We can't expect the exact behavior of GC, and it's varied from JVM to JVM. We can't
            provide exact answers for the following questions,
            1.	When exactly JVM runs GC?
            2.	In which order GC identifies eligible objects?
            3.	When GC destroy eligible objects?
            4.	Whether GC destroys all eligible objects or not?
            5.	What is the algorithm followed by GC?

            Note
            ====
            1.	Whenever program runs with low memory, then JVM runs GC, but we can't expect exactly
                at what time.
            2.	Most of the GC follows standard algorithm called as Mark and Sweep algorithm. It
                doesn't mean every GC follows the same algorithm.
        */

        /*
            Case 6
            ======
            The objects which are not used in our program and not eligible for GC.Such a type
            of not used objects is called as Memory Leaks.In our program, if memory leaks are
            present, then the program will be terminated by throwing out of memory error.Hence,
            if an object is no longer required, it is highly recommended to make that object
            eligible for GC.

            The following are the various 3rd-party memory management tools to identify
            memory leaks.

            1.	HP OVO
            2.	HP JMeter
            3.	JProbe
            4.	Patrol
            5.	IBM Tivoli
        */

    }

}

/*
    In the below example, a String object is eligible for GC and hence String class
    finalize() method is executed which has empty implementation.

    The output, in this case, will be
    End of Main

    If we replace a String object with a Test object, then the Test class finalize()
    method will be executed. In this case, the output is.

    End of Main
    Finalize method called
    Or
    Finalize method called
    End of Main
*/
class Case1Demo {

    public static void demo() {
        String s = new String("Java");
        s = null;
        System.gc();
        System.out.println("End of Main");
    }
//    public void finalize() {
//        System.out.println("Finalize Method Called");
//    }

}

/*
    In the below example, finalize() method executed 3 times, in those 2 times
    explicitly by programmer and one time by the GC.In this case, the output is.

    Finalize Method called
    Finalize Method called
    End of Main
    Finalize Method called

    If we are calling finalize() method, then it will be executed like a normal
    method call and the object won't be destroyed.If GC calls finalize() method,
    then only an object will be destroyed.

    For example, init(), service() and destroy() methods are considered as
    life cycle methods of Servlet.Just before destroying a servlet object, web
    container calls destroy() method to perform clean-up activities.But based
    on the requirement, we can call destroy() method from init and service, then
    destroy() method will be executed like a normal method call and a servlet
    object won't be destroyed.
*/
class Case2Demo {

    public static void demo() {
        Case2Demo case2Demo = new Case2Demo();
//        case2Demo.finalize();
//        case2Demo.finalize();
        case2Demo = null;
        System.gc();
        System.out.println("End of Main");
    }

//    public void finalize() {
//        System.out.println("Finalize Method Called");
//    }

}

/*
    In the below example, even though object eligible for GC 2 times, but Garbage
    Collector calls finalize() method only once.
*/
class Case4Demo {
    static Case4Demo case4Demo;

    public static void method() throws InterruptedException {
        Case4Demo case4Demo1 = new Case4Demo();
        System.out.println(case4Demo1.hashCode());
        case4Demo1 = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(case4Demo1.hashCode());
        case4Demo = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("End of Main");
    }

//    public void finalize() {
//        System.out.println("Finalize Method Called");
//        case4Demo = null;
//    }

}

/*
    In the below example, If we keep on increasing, the for-loop condition limit at
    a certain point memory problem will be raised.Then JVM runs GC.GC calls finalize()
    method on every object separately and destroys that object.
*/
class Case5Demo {
    static int count = 0;
    public static void demo() {
        for(int i = 0; i < 10; i++){
            Case5Demo case5Demo = new Case5Demo();
            case5Demo = null;
        }
    }

//    public void finalize(){
//        ++count;
//        System.out.println("Finalize Method Called" + count);
//    }

}