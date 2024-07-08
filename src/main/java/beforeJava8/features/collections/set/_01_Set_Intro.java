package beforeJava8.features.collections.set;

public class _01_Set_Intro {

    public static void main(String[] args) {

        /*
            Set(Interface)
            ==============
            It is the child interface of Collection. If we want to represent a group of individual
            objects as a single entity where "duplicates are NOT allowed" and "insertion order NOT
            preserved", then we should go for a Set.

            Set (I) 1.2 v

            The classes which implements Set interface are as below.

            1. HashSet (C) 1.2 v
            2. LinkedHashSet (C) 1.2 v
        */

        /*
            Sorted Set(Interface)
            =====================
            It is the child interface of Set. If we want to represent a group of individual objects
            as a single entity where "duplicates are NOT allowed" and objects should be "inserted
            according to some sorting order" then we should go for a Sorted Set.
        */

        /*
            Navigable Set(Interface)
            ========================
            It is the child interface of Sorted Set. It contains several methods for navigation
            purposes.

            Set (I) 1.2 v <== Sorted Set (I) 1.2 v  <== Navigable Set (I) 1.6 v

            The class which implements Navigable Set interface is as below.

            1. Tree Set (C) 1.2 v
        */

        /*
            Set Methods
            ===========
            Set interface doesn't contain any new method, and we have to use only collection
            interface methods.
        */
    }
}
