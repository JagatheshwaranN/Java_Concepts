package java7andbelow.features.generics;

import java.util.ArrayList;

public class _04_Generic_Class {

    public static void main(String[] args) {

        /*
            Generics Class
            ==============
            Until Java 1.4 version, a non-generic version of ArrayList class is declared
            as follows.

            class ArrayList {
                add(Object o);
                Object get(int index);
            }

            The argument to add() method is object and hence we can add any type of object
            to ArrayList and due to this we are missing type safety.
            The return type of get() method is Object, and hence at the time of retrieval we
            have to perform the type casting.

            In Java 1.5 version, a generic version of ArrayList class is declared as follows.

            class ArrayList<T> {
                add(T t);
                T get(int index);
            }

            Based on our runtime requirement, T will be replaced with our provided type.

            For example, to hold only String type objects, a generic version of ArrayList object
            can be created as follows.
            ArrayList<String> al = new ArrayList<String>();

            For this requirement, compiler considered version of ArrayList class is as follows,
            class ArrayList<String> {
                add(String s);
                String get(int index);
            }

            The argument to add() method is String, so we can add only String type objects.
            If we are trying to add any other type, then we will get compile time error.

            ArrayList<String> al = new ArrayList<String>();
            al.add("Alex");
            al.add(new Integer(10)); // CompileTimeError

            Hence, through Generics, we are getting type safety. The return type of get method
            is String, and hence at the time of retrieval, we are not required to perform the
            type casting.

            String name1 = al.get(0);

            In Generics, we are associating a type parameter to the class. Such a type of
            Parameterized classes is nothing but Generic classes / Template classes.

            Based on our requirement, we can define our own Generic classes as well.
            Account<Gold> a1 = new Account<Gold>();
            Account<Platinum> a2 = new Account<Platinum>();
        */
        GenericDemo.demo();
    }

}

class Generic<T> {
    T object;

    Generic(T object){
        this.object = object;
    }

    public void show(){
        System.out.println("The type of object : "+object.getClass().getName());
    }

    public T getObject(){
        return object;
    }

}

class GenericDemo {
    public static void demo(){

        Generic<String> generic1 = new Generic<>("Alex");
        generic1.show();
        System.out.println(generic1.getObject());
        Generic<Integer> generic2 = new Generic<>(100);
        generic2.show();
        System.out.println(generic2.getObject());
        Generic<Boolean> generic3 = new Generic<>(true);
        generic3.show();
        System.out.println(generic3.getObject());
    }

}