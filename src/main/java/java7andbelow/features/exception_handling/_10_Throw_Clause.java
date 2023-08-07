package java7andbelow.features.exception_handling;

public class _10_Throw_Clause {

    public static void main(String[] args) {

        /*
            Throw Clause
            ============
            ============            ==================              =======
            |Programmer|      ->    |Exception Object|      ->      | JVM |
            ============            ==================              =======

            1. Sometimes, we can create the exception object explicitly and hand over the
               same to JVM manually.To achieve this, we have to use throw keyword.

            2. "throw new ArithmeticException ("/ by zero")"

            3. Create the ArithmeticException object explicitly and hand over the same to
               the JVM manually. Hence, the main objective of the Throw keyword is to hand
               over the programmer created exception object to the JVM manually.

            4. The best fit of the Throw keyword is for customized exception or user defined
               exception.
        */

        Demo1.method();
        Demo2.method();
    }
}
/*
    In the below case, the main method is responsible for creation of exception
     object and hand over to the JVM.
*/
class Demo1 {
    public static void method () {
        System.out.println(10/0);
    }
}
/*
    In the below case, the programmer explicitly creating the exception object
    and hand over to the JVM.
*/
class Demo2 {
    public static void method() {
        throw new ArithmeticException ("/ by zero");
    }
}
