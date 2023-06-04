package java7andbelow.features.language_fundamentals.arrays;

public class _06_Arrays_Anonymous_Array {

    public static void main(String[] args) {

        /*
            Sometimes we can declare an array without name, such type of array is called as Anonymous array.

            The main purpose of the anonymous array is just for instant use (one time usage).

            We can create Anonymous array as below.
        */

        // new int[]{10, 20, 30}; - Anonymous Array

        // While creating the anonymous array we can’t specify the size otherwise we will get compile time error.
        // new int[3]{10, 20, 30}; - array creation with both dimension expression and initialization is illegal

        // We can create multidimensional anonymous arrays as well.
        // int[][] {{10,20},{30,40}); - MultiDimensional Anonymous Array

        /*
            Anonymous Array Demo
        */
        sum(new int[]{10, 20, 30});
    }

    public static void sum(int[] arr){
        int total = 0;
        for(int item : arr){
            total = total + item;
        }
        System.out.println("The sum of array elements is : "+total);
    }
}
