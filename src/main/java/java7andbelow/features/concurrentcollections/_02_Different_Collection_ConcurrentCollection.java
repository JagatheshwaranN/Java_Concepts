package java7andbelow.features.concurrentcollections;

public class _02_Different_Collection_ConcurrentCollection {

    public static void main(String[] args) {

        /*
            Traditional Collection
            ======================
            1. Not thread safe.
            2. Performance is low as waiting time of thread increases.
            3. Throws ConcurrentModificationException.

            Concurrent Collection
            =====================
            1. Thread safe.
            2. Performance is relatively high
            3. It doesn't throw any ConcurrentModificationException and threads
               can be allowed to modify safely when some other threads are
               already working on an object.

           Note: Concurrent collections are most suitable for scalable multithreading
                 applications.
        */

        /*
            Important Concurrent classes
            ============================
            1. ConcurrentHashMap
            2. CopyOnWriteArrayList
            3. CopyOnWriteArraySet
        */
    }
}
