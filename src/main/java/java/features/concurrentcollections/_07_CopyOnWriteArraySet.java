package java.features.concurrentcollections;

import java.util.concurrent.CopyOnWriteArraySet;

public class _07_CopyOnWriteArraySet {

    public static void main(String[] args) {

        /*
            CopyOnWriteArraySet
            ===================
            1. It is a Thread Safe version of Set.
            2. Internally implemented by CopyOnWriteArrayList.
            3. Insertion order is preserved.
            4. Duplicate objects are not allowed.
            5. Multiple threads are allowed to perform read operation simultaneously,
               but for every update operation a separate cloned copy will be created.
            6. It is costly to use because for every update operation, a cloned
               copy will be created. Hence, CopyOnWriteArraySet is the best choice
               if several read operations and less number of write operations are
               required to perform.
            7. While one thread iterates CopyOnWriteArraySet, the other threads
               are allowed to modify, and we won't get ConcurrentModificationException.
            8. Iterator of CopyOnWriteArraySet can't perform remove operation. Otherwise,
               we will get runtime exception saying UnsupportedOperationException.
        */

        /*
            CopyOnWriteArraySet Constructors
            ================================
            CopyOnWriteArraySet s = new CopyOnWriteArraySet();
            Creates an empty CopyOnWriteArraySet object.

            CopyOnWriteArraySet s = new CopyOnWriteArraySet(Collection c);
            Creates an equivalent CopyOnWriteArraySet object for the given Collection.
        */

        /*
            CopyOnWriteArraySet Methods
            ===========================
            Whatever methods present in Collection and Set interfaces are the only
            methods applicable for CopyOnWriteArraySet, and there are no special methods.
        */
        CopyOnWriteArraySetDemo.demo();
    }

}

class CopyOnWriteArraySetDemo {

    public static void demo() {
        CopyOnWriteArraySet<Object> arraySet = new CopyOnWriteArraySet<>();
        arraySet.add("A");
        arraySet.add("B");
        arraySet.add("C");
        arraySet.add("A");
        arraySet.add(null);
        arraySet.add(10);
        arraySet.add("D");
        System.out.println(arraySet);
    }

}