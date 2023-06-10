package java7andbelow.features.language_fundamentals.var_arg;

public class _03_Var_Arg_With_Normal_Param {

    public static void main(String[] args) {

        _03_Var_Arg_With_Normal_Param demo = new _03_Var_Arg_With_Normal_Param();
        demo.display(10);
        demo.display(10, 20);

        /*
        We can mix the Var-Arg parameter with the normal parameter.
        m1(int x, int... y);
        m1(String x, int... z); => valid

        If we mix the normal parameter with Var-Arg parameter then Var-Arg parameter should be the last parameter.
        m1(String... s, char c); => invalid

        Inside the Var-Arg method, we can take only one Var-Arg parameter, and we can’t take more than one Var-Arg
        parameter.
        m1(int... x, double... d); => invalid

        Inside a class, we can’t declare the Var-Arg method and the corresponding 1D array method simultaneously
        otherwise we will get compile time error.
        */
    }

//    public static void sum(int... i1){ // cannot declare both sum(int[]) and sum(int...)
//    }

//    public static void sum(int[] i1){ // cannot declare both sum(int[]) and sum(int...)
//    }

    /*
        In general, Var-Arg method will get the least priority i.e. if no other methods in the class is not matched
        then only var-Arg method will be called. It is exactly same as the default case inside the switch statement.
    */

    public static void display(int i2){
        System.out.println("General Method  - "+i2);
    }

    public static void display(int... i3){
        System.out.println("Var Arg Method  - "+i3);
    }
}
