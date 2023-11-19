package java7andbelow.features.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_Concurrent_Collection_Intro {

    public static void main(String[] args) {

        /*
            Limitations of Collections & Need for Concurrent Collection
            ===========================================================
            1. Traditional Collection objects (like ArrayList, HashMap, etc.) can be accessed
               by multiple threads simultaneously, and there may be a chance of data inconsistency
               problem.Hence, they are not Thread Safe.

            2. Already existing Thread Safe Collections (Vector, Hashtable, SynchronizedList,
               SynchronizedSet, SynchronizedMap) performance wise not up to the mark.

            3. Because for every operation even for read operation, also a total collection will be
               loaded by only one Thread at a time, and it increases waiting time of Threads.

            4. The big problem with Collections is while one Thread iterating Collection, the other
               Thread is not allowed to modify a Collection object simultaneously. If we are trying
               to modify, then we will get ConcurrentModificationException.

            5. These traditional Collection objects are not suitable for Scalable Multi-Threaded
               applications.

            6. To overcome the above limitations and problems, the SUN people introduced Concurrent
               Collections in Java 1.5 version.
        */
        ConcurrentModificationExceptionDemo.demo();


    }

}

class ConcurrentModificationExceptionDemo extends Thread {

    static ArrayList<Object> arrayList = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " - Child thread updating list");
        arrayList.add("D");
    }

    public static void demo() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        ConcurrentModificationExceptionDemo thread = new ConcurrentModificationExceptionDemo();
        thread.start();
        for (Object o : arrayList) {
            String s = (String) o;
            System.out.println(Thread.currentThread().getName() + " - Main thread updating the list and current object is : " + s);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(arrayList);
    }

}

