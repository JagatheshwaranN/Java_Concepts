package beforeJava8.features.collections;

import java.util.Arrays;
import java.util.List;

public class _13_ConversionOfArrayToList {

    public static void main(String[] args) {

        /*
            Conversion of Array to List
            ===========================

            public static list asList(Object[] a);
            Strictly speaking, the above method won't create any independent list object. For the
            existing array, we are getting the list view.

            String[] s = {"A", "Z", "B"};
            List l = Arrays.asList(s);

            Note:
            =====
            By using the array reference, if we perform any change, automatically that change will
            be reflected in the list. Similarly, by using the list reference, if we perform any
            change, that change will be reflected automatically to the array.

            By using list reference, we can't perform any operation that varies the size otherwise
            we will get the runtime exception saying UnsupportedOperationException.

            l.add("M");
            l.remove(1);
            l.set(1, "L"); -> Valid

            By using list reference, we are not allowed to replace with heterogeneous objects,
            otherwise we will get the runtime exception saying ArrayStoreException.
            l.set(1, new Integer(10));
        */
        ArrayToListDemo.demo();
    }

}

class ArrayToListDemo {

    public static void demo() {
        String[] strArray = {"A", "Z", "B"};
        List list = Arrays.asList(strArray);
        System.out.println(list);
        strArray[0] = "K";
        System.out.println(list);
        list.set(1, "L");
        for(String str : strArray){
            System.out.println(str);
        }
        // list.add("M"); - UnsupportedOperationException
        // list.remove(1); - UnsupportedOperationException
        // list.set(1, Integer.valueOf(10)); - java.lang.ArrayStoreException
    }

}
