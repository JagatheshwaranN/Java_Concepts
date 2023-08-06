package java7andbelow.features.exception_handling;

public class _11_Throw_Case_Scenarios {
    public static void main(String[] args) {

        /*
            Case 1: Throw exception
            =======================
            If exception refers null, then we will get the Null Pointer exception.

            Case 2: After Throw Statement, no direct statements allowed
            ===========================================================
            After throw statement, we are not allowed to write any statement directly
            otherwise we will get the compile time error saying Unreachable statement.
        */
        ExceptionCase1DemoA.method();
        ExceptionCase1DemoB.method();
    }
}

class ExceptionCase1DemoA {
    static ArithmeticException exception = new ArithmeticException();
    public static void method(){
        // throw exception; - Exception in thread "main" java.lang.ArithmeticException
    }
}

class ExceptionCase1DemoB {
    static ArithmeticException exception;
    public static void method(){
        // throw exception; - Exception in thread "main" java.lang.NullPointerException:
        // Cannot throw exception because "java7andbelow.features.exception_handling.
        // ExceptionCase1DemoB.exception" is null
    }
}