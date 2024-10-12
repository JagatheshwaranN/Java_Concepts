package java.features.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _03_ArrayList_GenericArrayList {

    public static void main(String[] args) {

        /*
            Difference b/w ArrayList and ArrayList<String>
            ==============================================
            ArrayList
            =========
            1. It is a non-generic version of ArrayList object.
            2. For this AL, we can add any type of object and hence it's not type safe.
            3. At the time of retrieval compulsory, we need to perform type casting.

            ArrayList<String>
            =================
            1. It is a generic version of ArrayList object.
            2. For this AL, we can add only String type of objects and hence its type safe.
            3. At the time of retrieval, we don't need to perform type casting.
        */

        /*
            Conclusions
            ===========
            1. Polymorphism concept is applicable only for base type but not for parameter type.
               Usage of Parent reference to hold a Child object is the concept of polymorphism.
               ArrayList<String> al = new ArrayList<String>();
               List<String> al = new ArrayList<String>();
               Collection<String> al = new ArrayList<String>();
               ArrayList <Object> al = new ArrayList<String>(); // CE: Incompatible Types

            2. For the type parameter, we can provide any class or interface name, but not primitive.
               If we are trying to give primitive, then we will get compile time error.
               ArrayList<int> al = new ArrayList<int>(); // CE: java: unexpected type
        */
        GenericArrayListDeclareDemo.demo();
    }

}

class GenericArrayListDeclareDemo {

    public static void demo() {

        Collection<String> al1 = new ArrayList<>();
        List<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();
        // ArrayList<Object> al4 = new ArrayList<String>(); // java: incompatible types
        // ArrayList<int> al5 = new ArrayList<int>(); // java: unexpected type
    }

}