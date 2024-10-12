package java.features.collections.map;

import java.util.Hashtable;

public class _10_Hashtable {

    public static void main(String[] args) {

        /*
            Hashtable
            =========
            1.	The underlying DSA for Hashtable is Hashtable.
            2.	Insertion order is not preserved, and it is based on hashCode of keys.
            3.	Duplicate keys are not allowed and values can be duplicates.
            4.	Heterogeneous objects are allowed for both keys and values.
            5.	Null is not allowed for both key and value.
            6.	It implements Serializable and Cloneable Interfaces.
            7.	Every method present in Hashtable is synchronized and hence Hashtable is thread safe.
            8.	Hashtable is the best choice if our frequent operation is search operation.

            Hashtable Constructors
            ======================
            Hashtable ht = new Hashtable();
            Creates an empty hashtable object with default initial capacity 11 and default
            fill ratio 0.75.

            Hashtable ht = new Hashtable(int initialCapacity);
            Creates an empty hashtable object with specified initial capacity and default
            fill ratio 0.75.

            Hashtable ht = new Hashtable(int initialCapacity, float fillRatio);
            Creates an empty hashtable object with specified initial capacity and fill
            ratio.

            Hashtable ht = new Hashtable(Map m);
            Creates an equivalent hashtable object for the given map.
        */
        HashtableDemo.demo();
        /*
            The below program provides the output as below.
            {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}

            If we change the hashCode() method of Temp class as below,
            public int hashCode() {
                return i%9;
            }

            Then, the output will be as below.
            {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}

            If we configure initial capacity as 25 i.e., Hashtable hashtable = new Hashtable(25)
            Then, the output will be as below.
            {23=E, 16=F, 15=D, 6=C, 5=A, 2=B}
        */
    }

}

class HashtableDemo {

    public static void demo() {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        // Hashtable<Object, Object> hashtable = new Hashtable<>(25);
        hashtable.put(new Temp1(5), "A");
        hashtable.put(new Temp1(2), "B");
        hashtable.put(new Temp1(6), "C");
        hashtable.put(new Temp1(15), "D");
        hashtable.put(new Temp1(23), "E");
        hashtable.put(new Temp1(16), "F");
        // hashtable.put(new Temp1(10), null); - NullPointerException
        System.out.println(hashtable);
    }
}

class Temp1 {
    int i;
    Temp1(int i){
        this.i = i;
    }

    public int hashCode() {
        return i;
        // return i % 9;
    }

    public String toString() {
        return i+"";
    }

}