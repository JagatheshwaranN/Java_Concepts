package java7andbelow.features.language_fundamentals.arrays;

import java.util.Arrays;

public class _02_Arrays_1D_Array_Creation {

    public static void main(String[] args) {

        /*
            Every array in java is an object only. Hence, we can create arrays by using the new operator.
        */

        // 1D Array Creation
        int[] i1 = new int[5];

        // For every array type, corresponding classes are available and these classes are part of Java
        // language, and not available to programmer level.
        System.out.println(i1.getClass().getName()); // [I

        int[][] i2 = new int[5][];
        System.out.println(i2.getClass().getName()); // [[I

        long[] l1 = new long[5];
        System.out.println(l1.getClass().getName()); // [J

        float[] f1 = new float[5];
        System.out.println(f1.getClass().getName()); // [F

        double[] d1 = new double[5];
        System.out.println(d1.getClass().getName()); // [D

        boolean[] bn1 = new boolean[5];
        System.out.println(bn1.getClass().getName()); // [Z

        short[] s1 = new short[5];
        System.out.println(s1.getClass().getName()); // [S

        byte[] b1 = new byte[5];
        System.out.println(b1.getClass().getName()); // [B

        /*
            Loop-holes in Array creation
            =============================
            1.	At the time of array creation, compulsory the size of the array should be specified
                otherwise we will get compile time error.

            2.	It is legal to have an array with size 0 in Java.

            3.	If we are trying to specify the array size with negative integer value, then we will get the
                runtime exception saying NegativeArraySizeException.

            4.	To specify the Int array size, the allowed data types are byte, short, char, and int. If we are
                trying to specify the other types then we will get compile time error.

            5.	The maximum allowed int array size in Java is 2147483647 which is the maximum value of the
                Int data type.
        */

        // int[] i3 = new int[]; - array dimension missing

        int[] i4 = new int[5];
        System.out.println(Arrays.toString(i4));

        int[] i5 = new int[0];
        System.out.println(Arrays.toString(i5));

        // int[] i6 = new int[-5]; - Exception in thread "main" java.lang.NegativeArraySizeException: -5

        int[] i7 = new int['A'];
        System.out.println(Arrays.toString(i7));

        byte b2 = 10;
        int[] i8 = new int[b2];
        System.out.println(Arrays.toString(i8));

        short s2 = 20;
        int[] i9 = new int[s2];
        System.out.println(Arrays.toString(i9));

        // int[] i10 = new int[10L]; - incompatible types: possible lossy conversion from long to int.

        // int[] i11 = new int[2147483647]; - Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit

        // int[] i12 = new int[2147483648]; - integer number too large
    }
}
