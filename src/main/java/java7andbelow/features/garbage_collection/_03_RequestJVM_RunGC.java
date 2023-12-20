package java7andbelow.features.garbage_collection;

import javax.xml.crypto.Data;
import java.util.Date;

public class _03_RequestJVM_RunGC {

    public static void main(String[] args) {

        /*
            Ways for requesting JVM to run GC
            =================================
            Once we made an object eligible for GC. It may not be destroyed immediately by GC.
            Whenever JVM runs the GC, then only the objects will be destroyed. But when exactly
            JVM runs GC, we can’t expect. It is varied from JVM to JVM.

            Instead of waiting for JVM to run GC, we can request JVM to run GC programmatically.
            But whether JVM accepts our request or not, there is no guarantee. But most of the
            time, JVM accepts our request.

            The following are the 2 ways to request JVM to run the GC.

            By using System class
            =====================
            System class contains a static method gc() for this purpose.
            System.gc();

            By using Runtime class
            ======================
            Java application can communicate with JVM by using a Runtime object. Runtime class
            present in java.lang package, and it is a singleton class. We can create a Runtime
            object by using Runtime.getRuntime() method.

            Runtime r = Runtime.getRuntime();
            Once we get the Runtime object, we can call the following methods on that object.

            totalMemory()
            =============
            It returns the number of bytes of total memory present in the heap. i.e., heap size.

            freeMemory()
            ============
            It returns the number of bytes of free memory present in the heap.

            gc()
            ====
            Requesting JVM to run the Garbage Collector.
        */
        RuntimeDemo.demo();

        /*
            Note:
            =====
            1. GC method present in System class is a static method, whereas GC method present
               in the Runtime class is instance method.
            2. It is convenient to use System class gc() method when compared with Runtime class
               gc() method.
            3. With respect to performance, it is highly recommended to use Runtime class gc()
               method when compared with System class gc() method. Because the System class gc()
               method internally calls Runtime class gc() method.
        */
    }

}

class RuntimeDemo {

    public static void demo() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        for (int i = 0; i < 10000; i++){
            Date d = new Date();
            d = null;
        }
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime.freeMemory());
    }
}