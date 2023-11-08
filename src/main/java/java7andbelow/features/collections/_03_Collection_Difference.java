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

        /*
            Difference b/w HashSet and LinkedHashSet
            ========================================
            HashSet
            =======
            1. The underlying DSA is Hashtable.
            2. Insertion Order is not preserved.
            3. Introduced in 1.2 v

            LinkedHashSet
            =============
            1. The underlying DSA is a combination of LinkedList and Hashtable.
            2. Insertion Order preserved.
            3. Introduced in 1.4 v
        */

        /*
            Comparison of Comparable & Comparator
            =====================================
            Comparable
            ==========
            1. It is meant for Default natural sorting order.
            2. Present in java.lang package.
            3. It defines only one method compareTo().
            4. String and all Wrapper classes implement comparable interface.

            Comparator
            ==========
            1. It is meant for customized sorting order.
            2. Present in java.util package.
            3. It defines 2 methods compare() and equals().
            4. The only implemented classes of Comparator are Collator and RuleBasedCollator.
        */

        /*
            Comparison of Set Implemented Classes
            =====================================
            Property - HashSet
            ==================
            Underlying DSA - Hashtable
            Duplicate Objects - Not allowed
            Insertion Order - Not preserved
            Sorting Order - Not applicable
            Heterogeneous Objects - Allowed
            Null Acceptance - Allowed

            Property - LinkedHashSet
            ========================
            Underlying DSA - Combination of LinkedList and HashTable
            Duplicate Objects - Not allowed
            Insertion Order - Preserved
            Sorting Order - Not applicable
            Heterogeneous Objects - Allowed
            Null Acceptance - Allowed

            Property - TreeSet
            ==================
            Underlying DSA - Balanced Tree
            Duplicate Objects - Not allowed
            Insertion Order - Not preserved
            Sorting Order - Applicable
            Heterogeneous Objects - Not allowed
            Null Acceptance - For Empty TreeSet as First element null is allowed until 1.6 v of java.
                              From 1.7 v, null is not allowed.
        */

        /*
            Difference b/w HashMap and Hashtable
            ====================================
            HashMap
            =======
            1. Every method present in HashMap is non-synchronized.
            2. At a time, multiple threads are allowed to operate on HashMap object, and it's not
               thread safe.
            3. Relatively performance is high as threads are not required to wait to operate on
               HashMap object.
            4. Null is allowed for both keys and values.
            5. Introduced in 1.2 version.

            Hashtable
            =========
            1. Every method present in Hashtable is synchronized.
            2. At a time, only one thread is allowed to operate on a Hashtable object, and it is
               thread safe.
            3. Relatively performance is low as threads are required to wait to operate on a Hashtable
               object.
            4. Null is not allowed for both keys and values.
            5. Introduced in 1.0 version.
        */

        /*
            Difference b/w HashMap and LinkedHashMap
            ========================================
            HashMap
            =======
            1. The underlying DSA is Hashtable.
            2. Insertion order is not preserved, and it is based on hashCode of Keys.

            LinkedHashMap
            =============
            1. The underlying DSA is a combination of LinkedList and Hashtable.
	        2. Insertion order is preserved.
        */
    }

}
