package beforeJava8.features.collections.list;

public class _04_ArrayList_Serializable_Cloneable {

    public static void main(String[] args) {

        /*
            Collections - Serializable & Cloneable
            ======================================
            Usually, we can use collections to hold and transfer objects from one location
            to another location (Container).To provide support for this requirement, every
            collection class by default implements serializable and cloneable interfaces.

            ArrayList and Vector classes implement RandomAccess Interface so that we can
            access any random element with the same speed.

            RandomAccess
            ============
            RandomAccess interface present in java.util package, and it doesn't contain any
            methods.It's a Marker Interface, where the JVM will automatically provide the
            required ability.

            ArrayList is the best choice if our frequent operation is retrieval operation.
            (Because, ArrayList implements RandomAccess Interface).

            ArrayList is the worst choice if our frequent operation is insertion / deletion
            in the middle.
        */

        /*
            How to get Synchronized version of ArrayList Object
            ===================================================
            By default, ArrayList is non-synchronized, but we can get the synchronized version
            of ArrayList object by using the synchronizedList() method of Collections class.

            Public static List synchronizedList(List l)

            Example,
            ArrayList al = new ArrayList();
            List l1 = Collections.SynchronizedList(al);

            Similarly, we can get the synchronized version of Set and Map object by using the
            following methods of Collections class.

            Public static Set synchronizedSet(Set s)
            public static Map synchronizedMap(Map m)
        */
    }

}
