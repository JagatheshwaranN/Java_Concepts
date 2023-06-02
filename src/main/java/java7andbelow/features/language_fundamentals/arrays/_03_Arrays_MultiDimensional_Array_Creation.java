package java7andbelow.features.language_fundamentals.arrays;

public class _03_Arrays_MultiDimensional_Array_Creation {

    public static void main(String[] args) {

        /*
            In java, 2 D array is not implemented using Matrix style. SUN MicroSystem people followed array of arrays
            approach for multidimensional array creation.

            The advantage of this approach is memory utilization will be improved.
        */

        // 2D Array Creation
        int[][] i1 = new int[2][];
        i1[0] = new int[3];
        i1[1] = new int[4];

        int[][][] i2 = new int[2][][];
        i2[0] = new int[3][];
        i2[1] = new int[2][2];
        i2[0][0] = new int[3];
        i2[0][1] = new int[2];
        i2[0][2] = new int[2];
    }
}
