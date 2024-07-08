package beforeJava8.features.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_NeedForGenerics {

    public static void main(String[] args) {

        /*
            Need for Generics
            =================
            The main objectives of Generics are to provide type safety and to resolve type
            casting problems.

            Case1: Type Safety
            ==================
            Arrays are type safe i.e., we can give the guarantee for the type of elements
            present inside the array. For example, if our programming requirement is to hold
            only String type objects, we can choose a String array. By mistake, if we are
            trying to add any other type of object, then we will get compile time error.

            String s = new String[10];
            s[0] = "Alex";
            s[1] = "Blake";
            s[2] = new Integer(10); // Compile Time Error

            Collections are not type safe i.e., we can't give the guarantee for the type of
            elements present inside the collection. For example, if our programming requirement
            is to hold only string type objects, and if we choose ArrayList, by mistake. Then
            trying to add any other type of object to arraylist, and we won't get any compile
            time error. However, the program may fail at runtime.

            ArrayList al = new ArrayList();
            al.add("Alex");
            al.add("Blake");
            al.add(new Integer(10));
            String name1 = (String)l.get(0);
            String name2 = (String)l.get(1);
            String name3 = (String)l.get(2); // RunTimeException: ClassCastException

            Hence, we can't give the guarantee for the type of elements present inside the
            collection.Due to this, collections are not safe to use with respect to type i.e.,
            collections are not type safe.

            Case2: Type Casting
            ===================
            In case of Arrays, at the time of retrieval, it's not required to perform type
            casting because there is a guarantee for the type of elements present inside
            the Array.

            String[] s = new String[10];
            s[0] = "Alex";
            String name1 = s[0];
            Hence, at the time of retrieval, type casting is not required.

            In the case of Collections, at the time of retrieval, compulsorily we should perform
            type casting because there is no guarantee for the type of elements present inside
            the collection.

            ArrayList al = new ArrayList();
            al.add("Alex");
            String name1 = al.get(0); // CompileTimeError: Incompatible Types
            String name1 = (String)al.get(0);
            Hence, the type casting is a bigger headache in collections.
        */
        ArrayDemo.demo();
        ArrayListDemo.demo();
    }

}

class ArrayDemo {

    public static void demo() {
        String[] strArray = new String[10];
        strArray[0] = "java";
        strArray[1] = "program";
        // strArray[2] = Integer.valueOf(10); // Compile Time Error
        System.out.println(Arrays.toString(strArray));

        String word = strArray[0];
        System.out.println(word);
    }

}

class ArrayListDemo {

    @SuppressWarnings("rawtypes")
    public static void demo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("java");
        arrayList.add("program");
        arrayList.add(10);
        System.out.println(arrayList);

        // String word = arrayList.get(0); // CompileTimeError: Incompatible Types
        String word = (String) arrayList.get(0);
        System.out.println(word);
    }

}