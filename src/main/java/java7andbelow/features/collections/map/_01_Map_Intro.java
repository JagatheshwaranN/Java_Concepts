package java7andbelow.features.collections.map;

public class _01_Map_Intro {

    public static void main(String[] args) {

        /*
            Map (Interface)
            ===============
            Map is not a child interface of Collection, and if you want to represent a group of
            objects as key value pairs, then we should go for Map.Both Key and Value are objects
            only.Duplicate keys are not allowed, but values can be duplicated.

            Each key-value pair is called as an Entry.Hence, Map is considered as a collection
            of Entry objects.

            Map (I) 1.2 v

            The classes which implement Map interface are as below.

            1. HashMap (C) 1.2 v
            2. LinkedHashMap (C) 1.4 v
            3. WeakHashMap (C) 1.2 v
            4. IdentityHashMap (C) 1.4 v
            5. Hashtable (C) 1.0 v

            Legacy classes

            1. Dictionary (AC) 1.0 v
            2. Hashtable (C) 1.0 v
            3. Properties (C) 1.0 v
        */

        /*
            Sorted Map (Interface)
            ======================
            It is a child interface of Map.If you want to represent a group of objects as
            key value pairs according to some sorting order of keys, then we should go for
            Sorted Map.In Sorted Map, the sorting should be based on the Key but not based
            on value.
        */

        /*
            Navigable Map (Interface)
            =========================
            It is a child interface of Sorted Map.It defines several methods for navigation
            purposes.

            Map (I) 1.2 v <== Sorted Map (I) 1.2 v <== Navigable Map (I) 1.6 v

            The class which implements Navigable Map interface is as below.

            1. Tree Map (C) 1.2 v
        */
    }

}
