package java7andbelow.features.collections;

public class _05_ComparableInterface {

    public static void main(String[] args) {

        /*
            Comparable(Interface)
            =====================
            It is present in the java.lang package, and it contains only one method compareTo().

            public int compareTo(Object obj);

            obj1.compareTo(obj2)

            1.	Returns '-ve' if obj1 has to come before obj2
            2.	Returns '+ve' if obj1 has to come after obj2
            3.	Returns '0' if both obj1 and obj2 are equal
            obj1 => Object trying to be inserted
            obj2 => Object inserted already

        */
        ComparableDemo.demo();

        /*
            If we are depending on default natural sorting order then while adding objects
            into the TreeSet JVM will call compareTo() method.

            TreeSet t = new TreeSet();

            t.add("K");
            t.add("Z");
            t.add("A");
            t.add("A");
            SOP (t); // [A, K, Z]

            Note:
            =====
            If default natural sorting order is not available or if we are not satisfied with
            default sorting order, then we can go for customized sorting using Comparator.

            Comparable meant for default natural sorting order, whereas Comparator meant for
            customized sorting order.
        */
    }

}

class ComparableDemo {

    public static void demo() {
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("K"));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo(null)); // java.lang.NullPointerException
    }

}