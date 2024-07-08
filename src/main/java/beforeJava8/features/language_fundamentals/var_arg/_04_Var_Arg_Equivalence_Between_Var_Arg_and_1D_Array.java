package beforeJava8.features.language_fundamentals.var_arg;

public class _04_Var_Arg_Equivalence_Between_Var_Arg_and_1D_Array {

    public static void main(String... args) {

        /*
            Equivalence between Var-Arg Parameter and 1D Array Parameter
            ============================================================
            1.	Wherever 1D array present in the code, we can replace it with Var-Arg parameter.
                m1(int[] x) => m1(int... x) => Valid

            2.	main(String[] args) can be replaced as main(String... args).

            3.	Wherever Var-Arg parameter present in the code, we can’t replace it with 1D array.
                m1(int... x) => m1(int[] x) => Invalid

            m1(int... x) => We can call this method by passing a group of int values
            and x will become 1D array.

            m1(int[]... x) => We can call this method by passing a group of 1D int arrays
            and x will become 2D array.
        */

        int[] i1 = {10, 20};
        int[] i2 = {30, 40};
        method(i1, i2);
    }

    public static void method(int[]... param){
        for (int[] i3 : param){
            System.out.println(i3[0]);
            System.out.println(i3[1]);
        }
    }
}
