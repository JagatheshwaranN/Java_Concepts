package beforeJava8.features.collections;

public class _01_Need_For_Collection {

    public static void main(String[] args) {

        /*
            Limitations of Arrays
            =====================
            An array is an indexed collection of fixed number of homogenous data elements.
            The main advantage of arrays is we can represent multiple values using single
            variable so that the readability of the code is improved.

            The limitations of the arrays as below
            ======================================
            1.	Arrays are fixed in size, there is no chance of increasing /decreasing the
                size based on our requirement. Due to this, to use arrays, we should know
                the size in advance and which may not always be possible.

            2.	Arrays can hold only homogenous data type elements.

            3.	Array concept is not implemented based on some Standard DSA, and hence ready-made
                method support is not available. For every requirement, we have to write the code
                explicitly which increases the complexity of the programming.

            Why Collections
            ===============
            To overcome the above problems of Arrays, we should go for Collection concept.

            1.	Collections are growable i.e.; based on our requirement, we can increase
                / decrease the size.

            2.	Collections can hold both homogenous and heterogeneous objects.

            3.	Every Collection class is implemented based on some standard DSA, and hence for
                every requirement, ready-made method support is available. Being a programmer,
                we are responsible to use those methods.
        */

        /*
            Difference b/w Arrays and Collections
            =====================================
            Arrays
            ======
            1. Arrays are fixed in size.
            2. With respect to Memory, Arrays are not recommended to use.
            3. With respect to Performance, Arrays are recommended to use.
            4. Arrays can hold only homogenous data type elements.
            5. There is no underlying DSA for Arrays, and hence ready-made methods are not available.
            6. Arrays can hold both primitives and objects.

            Collections
            ===========
            1. Collections are growable.
            2. With respect to Memory, Collections are recommended to use.
            3. With respect to performance, Collections are not recommended to use.
            4. Collections can hold both homogenous and heterogeneous data type elements.
            5. Every collection class is implemented based on some standard DSA, and hence for
               every requirement, ready-made method support is available.
            6. Collections can hold only object types but not primitives.
        */
    }
    
}
