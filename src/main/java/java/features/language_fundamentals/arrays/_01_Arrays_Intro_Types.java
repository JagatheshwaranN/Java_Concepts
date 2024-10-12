package java.features.language_fundamentals.arrays;

public class _01_Arrays_Intro_Types {

    public static void main(String[] args) {

        /*
            Array
            =====
            An array is an indexed collection of fixed number of homogenous data elements.

            Advantage
            =========
            1.	We can represent the huge number of values by using the single variable
                so that the readability of the code is improved.

            Disadvantage
            ============
            1.	Arrays are fixed in the size. The chance of increasing or decreasing the size is not possible.
                Hence, to use the Arrays we must know the size, which may not be possible always.
            2.	Arrays can store only homogenous data.
        */

        /*
            1D Array Declaration
            ====================
            1D Array can be declared in the following ways.

            int[] x -> Recommended because the name is clearly separated from the type.
                       This is called as 1D array declaration.

            int []x -> Not recommended

            int x[] -> Not recommended

            At the time of declaration, we can’t specify the size of the array otherwise we will get compile time error.
        */

        int[] a1;
        // int[5] a2; -  ']' expected

        /*
            2D Array Declaration
            ====================
            int[][] x; -> Recommended because the name is clearly separated from the type.
                          This is called as 2D array declaration.

            int [][]x; -> Not recommended

            int x[][]; -> Not recommended

            int []x[]; -> Not recommended

            int[] x[]; -> Not recommended

            int[] []x; -> Not recommended
        */
        int[][] a3;
        // int [3][] a4; - ']' expected

        // If we want to specify the dimension before the variable, that facility is applicable only for
        // first variable in a declaration. If we are trying to apply for remaining variables, we will
        // get compile time error.

        /*
            3D Array Declaration
            ====================
            int[][][] a; -> Recommended because the name is clearly separated from the type.
                            This is called as 3D array declaration.
            int [][][]a;

            int a[][][];

            int[] a[][];

            int[] [][]a;

            int[] []a[];

            int[][] []a;

            int[][] a[];

            int [][]a[];

            int []a[][];
        */

    }
}
