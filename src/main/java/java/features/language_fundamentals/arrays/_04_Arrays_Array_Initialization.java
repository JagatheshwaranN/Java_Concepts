package java.features.language_fundamentals.arrays;

public class _04_Arrays_Array_Initialization {

    public static void main(String[] args) {

        /*
            Once we create an array, every element in array is initialized with default value 0.

            In Java, when we print reference variable, internally the toString() will be called, which
            is implemented by default to return the string in the following form.

            Classname@Hascode_in_hexadecimal_form
        */

        int[] i1 = new int[5];
        System.out.println(i1); // [I@4dd8dc3 - i1 is reference variable of 1D array
        System.out.println(i1[0]);

        int[][] i2 = new int[2][3];
        System.out.println(i2); // [[I@6d03e736 - i2 is reference variable of 2D array
        System.out.println(i2[0]); // [I@568db2f2 - i2[0] is reference variable of 1D array
        System.out.println(i2[0][0]);

        int[][] i3 = new int[2][];
        System.out.println(i3); // [[I@378bf509 - i3 is reference variable of 2D array
        System.out.println(i3[0]); // Null - i3[0] is null since only the base size of the array is declared
        // System.out.println(i3[0][0]); // Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "i3[0]" is null

        // Note: If we are trying to perform any operation on null object,
        // then RuntimeException - NullPointerException is thrown.

        /*
            Once we create an array, every array element is initialized with default values.
            If we are not satisfied with the default values, then we can override the
            default values with the customized values.
        */

        int[] i4 = new int[2];
        System.out.println(i4[0]); // 0
        System.out.println(i4[1]); // 0
        i4[0] = 10;
        i4[1] = 20;
        System.out.println(i4[0]); // 10
        System.out.println(i4[1]); // 20

        /*
            If we are trying to access the array element with the out-of-range index (either positive or
            negative int value) then we will get the Runtime exception saying ArrayIndexOutOfBoundsException.
        */
        // i4[2] = 30; - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        // i4[-2] = 40; - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 2
        // i4[0.5] = 50; - incompatible types: possible lossy conversion from double to int
    }
}

