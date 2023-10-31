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

        /*
            Difference b/w ArrayList and LinkedList
            =======================================
            ArrayList
            =========
            1. ArrayList is the best choice if our frequent operation is retrieval operation.
            2. ArrayList is the worst choice if our frequent operation is insertion/deletion in
               the middle because internally several shift operations are performed.
            3. Elements are stored in the consecutive memory locations.

            LinkedList
            ==========
            1. LinkedList is the best choice if our frequent operation is insertion/deletion in
               the middle.
            2. LinkedList is the worst choice if our frequent operation is retrieval operation.
            3. Elements are not stored in the consecutive memory locations.
        */
    }

}
