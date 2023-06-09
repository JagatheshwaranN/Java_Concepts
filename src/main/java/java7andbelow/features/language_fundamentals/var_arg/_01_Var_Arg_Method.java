package java7andbelow.features.language_fundamentals.var_arg;

public class _01_Var_Arg_Method {

    public static void main(String[] args) {

        /*
            Var - Arg Methods (Variable number of arguments method) - From Java 1.5v
            =========================================================================
            Until Java 1.4v, we can’t declare a method with variable number of arguments. If there is a change in
            number of arguments, then we should go for new method. It increases the length of the code and reduce
            the readability.

            To overcome this problem, SUN people introduced the var-arg method in Java 1.5v according to this,
            a method can take variable number of arguments such type of methods are called as Var-Arg Methods.
            The Var Arg method can be declared as follows,

            m1(int… x)

            We can call this method by passing any number of int values including zero (0) number.

            m1();
            m1(10);
            m1(10, 20, 30);
       */

        /*
            The below are the valid form of var-arg method declaration.
            m1(int... x); => valid
            m1(int ...x); => valid
            m1(int...x);  => valid
        */

        _01_Var_Arg_Method.method1(0);
        _01_Var_Arg_Method.method1(10, 20);
    }

    public static void method1(int... i1){
        System.out.println("Var-Arg Method");
    }
}
