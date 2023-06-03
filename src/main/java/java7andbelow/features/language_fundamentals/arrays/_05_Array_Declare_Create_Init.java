package java7andbelow.features.language_fundamentals.arrays;

public class _05_Array_Declare_Create_Init {

    public static void main(String[] args) {


        // Array Declaration
        int[] x;

        // Array Creation
        x = new int[2];

        // Array Initialization
        x[0] = 10;
        x[1] = 20;

        /*
            Now, We can declare, create and initialize an array in a single line
            with the short-cut representation as below.
        */

        int[] i1 = {10, 20, 30};
        System.out.println(i1[0]);
        char[] c1 = {'a', 'b'};
        System.out.println(c1[1]);
        String[] s1 = {"SA", "RE", "GA", "MA"};
        System.out.println(s1[2]);

        /*
            We can use the short-cut representation for multidimensional arrays as well.
        */

        int[][] i2 = {{10, 20}, {30, 40, 50}};
        int[][][] i3 = {{{10,20,30},{40,50, 60}},{{70,80},{90,100,110}}};
        System.out.println(i2[0][0]); // 10
        System.out.println(i2[1][0]); // 30
        System.out.println(i2[1][2]); // 50
        System.out.println(i3[0][1][2]); // 60
        System.out.println(i3[1][0][1]); // 80
        // System.out.println(i3[2][0][0]); - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

        /*
            NOTE: If we want to use the array short-cut representation, then compulsory all activities
            will be performed in the Single line. If we try to divide into multiple lines, then we will
            get compile time error.
        */

        int[] i4 = {10, 20}; // Valid
        int[] i5;
        // i5 = {10, 20}; - illegal start of expression

        /*
            Length is a final variable applicable for arrays. Length variable represents the size
            of the array.
        */

        int[] i6 = new int[5];
        System.out.println(i6.length);
        // System.out.println(i6.length()); - cannot find symbol

        /*
            Length () method is a final method applicable for String objects.
            Length () method returns the number of chars present in the String.
        */

        String s2 = "java";
        System.out.println(s2.length());
        // System.out.println(s2.length); - cannot find symbol

        /*
            Points to Remember
            ==================
            Length variable applicable for Arrays but not for String objects whereas Length () method
            applicable for String objects but not for Arrays.
        */

        String[] s3 = {"A", "B", "C"};
        System.out.println(s3.length);
        // System.out.println(s3[0].length); - cannot find symbol
        System.out.println(s3[0].length());

        /*
            Note: In multiple dimensional arrays, the length variable represents only the base size of the
            array and not the total size of the array.
        */

        int[][] i7 = new int[4][3];
        System.out.println(i7.length);
        System.out.println(i7[0].length);

        // There is no direct way to find the total length of the multidimensional array.
        // But, indirectly we can find as below,

        System.out.println(i7[0].length+i7[1].length+i7[2].length+i7[3].length);
    }
}
