package java.features.oops;

public class _19_StaticControlFlow_RIWO {

    static int i = 10;

    static {
        System.out.println(i);
    }

    static {
        method();
        // System.out.println(j); - illegal forward reference
    }

    public static void method(){
        System.out.println(j);
    }

    static int j = 20;

    public static void main(String[] args) {

        /*
            RIWO flow
            =========
            1. If a variable is just identified by the JVM and original value is not yet assigned.
            Then, the variable is said to be in Read Indirectly & Write Only state [RIWO]. If a
            variable is in RIWO state, then we can’t perform the direct read, but we can perform
            the indirect read.

            2. If we are trying to read directly then we will get the compile time error saying
               Illegal Forward Reference.
        */
    }
}
