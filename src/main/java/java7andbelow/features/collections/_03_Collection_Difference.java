package java7andbelow.features.collections;

public class _03_Collection_Difference {

    public static void main(String[] args) {

        /*
            Differences b/w List and Set
            ============================
            List
            ====
            1. Duplicates are allowed.
            2. Insertion order preserved.

            Set
            ===
            1. Duplicates are not allowed.
            2. Insertion order is not preserved.
        */

        /*
            Difference b/w ArrayList and Vector
            ===================================
            ArrayList
            =========
            1. Every method present in the ArrayList is non-synchronized.
            2. At a time, multiple threads are allowed to operate on the AL object and
               hence it's not thread safe.
            3. Relatively performance is high.
            4. Introduced in 1.2 version and its non-legacy.

            Vector
            ======
            1. Every method present in the Vector is synchronized.
            2. At a time, only one thread is allowed to operate on the Vector object and
               hence it's thread safe.
            3. Relatively performance is low.
            4. Introduced in 1.0 version and its legacy.
        */
    }
}
