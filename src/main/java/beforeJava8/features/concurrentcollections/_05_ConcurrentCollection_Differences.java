package beforeJava8.features.concurrentcollections;

public class _05_ConcurrentCollection_Differences {

    public static void main(String[] args) {

        /*
            Difference b/w HashMap and ConcurrentHashMap
            ============================================
            HashMap
            =======
            1. It is not thread safe.
            2. Relatively performance is high as threads are not required to wait to operate
               on the object.
            3. While one thread iterating HashMap other thread not allowed to modify a map
               object, otherwise we will get ConcurrentModificationException.
            4. Iterator is fail fast.
            5. Null is applicable for both key and value.
            6. Introduced in 1.2 version.

            ConcurrentHashMap
            =================
            1. It is thread safe.
            2. Relatively perform is low because sometimes threads have to wait to operate
               on the object.
            3. While one thread iterating HashMap, other threads are allowed to modify a map
               object, and we don't get any ConcurrentModificationException.
            4. Iterator is fail-safe.
            5. Null is not allowed for both key and value, otherwise we will get NullPointerException.
            6. Introduced in 1.5 version.
        */

        /*
            Difference b/w ConcurrentHashMap, SynchronizedMap and Hashtable
            ===============================================================
            ConcurrentHashMap
            =================
            1. We will get Thread safety without locking a total map object with bucket level
               lock.
            2. At a time, multiple threads are allowed to operate on a map object in a safe manner.
            3. Read operation can be performed without a lock but write operation can be performed
               with bucket level lock.
            4. While one thread iterates the map object, the other threads are allowed to modify
               a map, and we won't get ConcurrentModificationException.
            5. Iterator of ConcurrentHashMap is fail-safe and won't raise ConcurrentModification
               Exception.
            6. Null is not allowed for both keys and values.
            7. Introduced in 1.5 version.

            SynchronizedMap
            ===============
            1. We will get Thread safety by locking a total map object.
            2. At a time, only one thread is allowed to perform any operation on a map object.
            3. Every read and write operation requires total map object lock.
            4. While one thread iterates the map object, the other threads are not allowed to
               modify a map; otherwise we will get ConcurrentModificationException.
            5. Iterator of SynchronizedMap is fail-fast, and it raises ConcurrentModification
               Exception.
            6. Null is allowed for both keys and values.
            7. Introduced in 1.2 version.

           Hashtable
           =========
           1. We will get Thread safety by locking a total map object.
           2. At a time, only one thread is allowed to operate on a map object.
           3. Every read and write operation requires total map object lock.
           4. While one thread iterates the map object, the other threads are not allowed to
              modify a map; otherwise we will get ConcurrentModificationException.
           5. Iterator of Hashtable is fail-fast, and it raises ConcurrentModification
              Exception.
           6. Null is allowed for both keys and values.
           7. Introduced in 1.0 version.
        */

        /*
            Difference b/w ArrayList and CopyOnWriteArrayList
            =================================================
            ArrayList
            =========
            1. Its not thread safe.
            2. While one thread iterating list object, the other threads are not allowed to
               modify a list.Otherwise, we will get ConcurrentModificationException.
            3. Iterator is fail fast.
            4. Iterator of ArrayList can perform remove operation.
            5. Introduced in Java 1.2 version.

            CopyOnWriteArrayList
            ====================
            1. It is not thread safe because every update operation will be performed on the
               separate cloned copy.
            2. While one thread iterating list object, the other threads are allowed to modify
               a list in a safe manner, and we won't get any ConcurrentModificationException.
            3. Iterator is fail-safe.
            4. Iterator of CopyOnWriteArrayList can't perform remove operation otherwise we will
               get RuntimeException.(UnsupportedOperationException)
            5. Introduced in Java 1.5 version.
        */

        /*
            Difference b/w CopyOnWriteArrayList, SynchronizedList, and Vector
            =================================================================
            CopyOnWriteArrayList
            ====================
            1. We will get Thread safety because every update operation will be performed
               on separate cloned copy.
            2. At a time, multiple threads are allowed to access / operate on CopyOnWriteArrayList.
            3. While one thread iterating list object, the other threads are allowed to modify
               a list in a safe manner, and we won't get any ConcurrentModificationException.
            4. Iterator is fail-safe and won't raise any ConcurrentModificationException.
            5. Iterator of CopyOnWriteArrayList can't perform remove operation otherwise we will
               get RuntimeException.(UnsupportedOperationException)
            6. Introduced in Java 1.5 version.

            SynchronizedList
            ================
            1. We will get Thread safety by locking a total map object.
            2. At a time, only one thread is allowed to perform any operation on a map object.
            3. While one thread iterates the map object, the other threads are not allowed to
               modify a map; otherwise we will get ConcurrentModificationException.
            4. Iterator of SynchronizedMap is fail-fast, and it raises ConcurrentModification
               Exception.
            5. Iterator can perform remove operation.
            6. Introduced in Java 1.2 version.

            Vector
            =====
            1. We will get Thread safety because at a time, only one thread is allowed to access
               a Vector object.
            2. At a time, only one thread is allowed to perform any operation on a vector object.
            3. While one thread iterates the vector object, the other threads are not allowed to
               modify a vector; otherwise we will get ConcurrentModificationException.
            4. Iterator of vector is fail-fast, and it raises ConcurrentModification
               Exception.
            5. Iterator can perform remove operation.
            6. Introduced in Java 1.0 version.
        */

        /*
            Difference b/w CopyOnWriteArraySet and SynchronizedSet
            ======================================================
            CopyOnWriteArraySet
            ===================
            1. It is thread safe because every update operation will be performed
               on separate cloned copy.
            2. While one thread iterating a set object, the other threads are allowed to modify
               a set in a safe manner, and we won't get any ConcurrentModificationException.
            3. Iterator is fail-safe.
            4. Iterator of CopyOnWriteArraySet can perform only read operation, and can't perform
               remove operation otherwise we will get RuntimeException.(UnsupportedOperationException)
            5. Introduced in Java 1.5 version.

            SynchronizedSet
            ===============
            1. It is Thread safe because at a time only one thread can perform operation.
            2. While one thread iterating a set object, the other threads are not allowed
               to modify Set.Otherwise, we will get ConcurrentModificationException.
            3. Iterator is fail fast.
            4. Iterator can perform both read and remove operations.
            5. Introduced in Java 1.2 version.
        */
    }

}
