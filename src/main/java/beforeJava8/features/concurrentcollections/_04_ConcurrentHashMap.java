package beforeJava8.features.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _04_ConcurrentHashMap {

    public static void main(String[] args) {

        /*
            ConcurrentHashMap
            =================
            1.	Underlying DSA is Hashtable
            2.	ConcurrentHashMap allows concurrent read and thread safe update operations.
            3.	To perform read operation, thread won't require any lock.But for performing
                the update operation thread requires lock, but it's the lock of only a
                particular part of Map (Bucket level lock / segment lock).
            4.	Concurrent update achieved by internally dividing Map into smaller portions
                which is defined by Concurrency lock.
            5.	The default concurrency level is 16.
            6.	ConcurrentHashMap allows any number of read operations but 16 update operations
                at a time.
            7.	Null is not allowed for both keys and values.
            8.	While one thread iterates, another thread can perform update operation and
                ConcurrentHashMap never throw ConcurrentModificationException.

            ConcurrentHashMap Constructors
            ==============================
            ConcurrentHashMap m = new ConcurrentHashMap();
            Creates an empty ConcurrentHashMap with default initial capacity.

            ConcurrentHashMap m = new ConcurrentHashMap(int initialCapacity);
            Creates an empty ConcurrentHashMap with specified initial capacity.

            ConcurrentHashMap m = new ConcurrentHashMap(int initialCapacity, float fillRatio);
            Creates an empty ConcurrentHashMap with specified initial capacity and specified
            fill ratio.

            ConcurrentHashMap m = new ConcurrentHashMap(int initialCapacity, float fillRatio,
            int concurrencylevel);
            Creates an empty ConcurrentHashMap with specified initial capacity, specified fill
            ratio and specified concurrency level.

            ConcurrentHashMap m = new ConcurrentHashMap(Map m);
            Creates an equivalent ConcurrentHashMap for the given Map.
        */
        ConcurrentHashMapThread.demo();
    }

}

class ConcurrentHashMapThread extends Thread {

    static ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ " is updating the list");
        concurrentHashMap.put(103, "Clara");
        System.out.println(concurrentHashMap);
    }

    public static void demo() {
        concurrentHashMap.put(101, "Alex");
        concurrentHashMap.put(102, "Blake");
        System.out.println(concurrentHashMap);
        ConcurrentHashMapThread concurrentHashMapThread = new ConcurrentHashMapThread();
        concurrentHashMapThread.start();
        for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
            System.out.println("Main thread retrieving list and current object is : "+entry.toString());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(concurrentHashMap);
    }

}
