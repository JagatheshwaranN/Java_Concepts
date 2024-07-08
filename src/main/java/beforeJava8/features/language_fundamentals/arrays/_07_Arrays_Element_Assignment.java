package beforeJava8.features.language_fundamentals.arrays;

public class _07_Arrays_Element_Assignment {

    public static void main(String[] args) {

        /*
            1.	In case of primitive type arrays, as array elements we can provide any type which can be
                implicitly promoted to declared type.
        */
        int[] i1 = new int[5];
        i1[0] = 1;
        i1[1] = 'a';
        byte b1 = 2;
        i1[2] = b1;
        short s1 = 3;
        i1[3] = s1;

        /*
            2.	In case of float type arrays, the allowed data types are byte, short, char, int, long
                and float.
        */
        float[] f1 = new float[5];
        f1[0] = 1.25f;
        f1[1] = 1;
        f1[2] = 2L;
        byte b2 = 2;
        f1[3] = b2;
        short s2 = 3;
        f1[4] = s2;

        /*
            3.	In case of Object type arrays, as array elements we can provide either declared type objects
                or its child class objects.
        */
        Object[] o1 = new Object[2];
        o1[0] = new Object();
        o1[1] = new String("Array");

        /*
            4.	For Abstract class type arrays, its child class objects are allowed.
        */
        Number[] n1 = new Number[3];
        n1[0] = new Integer(10);
        n1[1] = new Double(10.5);
        // n1[2] = new String("Java"); - incompatible types: java.lang.String cannot be converted to java.lang.Number

        /*
            5.	For Interface type arrays, its implementation class objects are allowed.
        */
        Runnable[] r1 = new Runnable[2];
        r1[0] = new Thread();
        // r1[1] = new String("Java"); - incompatible types: java.lang.String cannot be converted to java.lang.Runnable

        /*
            Points to Remember
            ==================
            Array Type	            Allowed Element Types
            Primitive Types	        Any type which can be implicitly promotes to the declared type.
            Object Types            Either declared type or its child class objects.
            Abstract Class Types 	Its child class objects.
            Interface Type Arrays	Its implementation class objects.
        */
    }
}
