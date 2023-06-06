package java7andbelow.features.language_fundamentals.arrays;

public class _08_Arrays_Variable_Assignment {

    public static void main(String[] args) {

        /*
            1.	Element level promotions are not applicable at Array level. For example, char element
                can be promoted to Int type whereas char[] can’t be promoted to Int[].
        */
        int[] i1 = {10, 20};
        char[] c1 = {'a', 'b'};
        // int[] i2 = c1; - incompatible types: char[] cannot be converted to int[]

        /*
            2.	In case of Object type arrays, child class type array can be promoted to parent class
                type array.
                String[] => Object[] -> valid
                char[] => int[] -> invalid
                int[] => double[] -> invalid
        */
        String[] s1 = {"SA", "RE"};
        Object[] o1 = s1;

        /*
            3.	Whenever we are assigning one array to another array, the internal elements won’t be
                copied just the reference variables will be re-assigned.
        */
        int[] i2 = {10, 20, 30};
        int[] i3 = {50, 60};
        i2 = i3;
        i3 = i2;

        /*
            4.	Whenever we are assigning one array to another array, the dimension must be matched.
                For example, in the place of 1D array, we have to provide 1D array only. If we are trying
                to provide any other dimension, then we will get compile time error.
        */
        int[][] i4 =  new int[3][];
        // i4[0] = new int[2][3]; - incompatible types: int[][] cannot be converted to int[]
        // i4[0] = 10; - incompatible types: int cannot be converted to int[]

        /*
            5.	Whenever we are assigning one array to another array, both dimension and type must be
                matched whereas sizes are not need to be matched.
        */
    }
}
