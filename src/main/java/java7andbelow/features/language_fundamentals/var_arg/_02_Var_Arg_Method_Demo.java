package java7andbelow.features.language_fundamentals.var_arg;

public class _02_Var_Arg_Method_Demo {

    public static void main(String[] args) {

        /*
            Internally Var-Arg parameter is converted into 1D array. Hence, within the Var-Arg method we can
            differentiate the values by using the index.
        */

        _02_Var_Arg_Method_Demo.sum(10, 20, 30);
    }

    public static void sum(int... x){
        int total = 0;
        for(int i1 : x){
            total = total +i1;
        }
        System.out.println(total);
    }
}
