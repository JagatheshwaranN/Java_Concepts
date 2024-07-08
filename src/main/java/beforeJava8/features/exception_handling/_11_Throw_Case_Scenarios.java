package beforeJava8.features.exception_handling;

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

            Case 3: Throw keyword can be used for Throwable objects
            =======================================================
            We can use throw keyword only for Throwable types. If we are trying to use
            for normal Java objects then we will get the compile time error saying
            Incompatible Types.
        */
        ExceptionCase1DemoA.method();
        ExceptionCase1DemoB.method();
        ExceptionCase2DemoA.method();
        ExceptionCase2DemoB.method();
        ExceptionCase3DemoA.method();
        ExceptionCase3DemoB.method();
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

/*
    In the below case, Compiler is not aware about the SOP(10/0) statement.
    So, in runtime we are getting the ArithmeticException.
*/
class ExceptionCase2DemoA {
    public static void method(){
        // System.out.println(10/0); - Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("hello");
    }
}

class ExceptionCase2DemoB {
    public static void method(){
        // throw  new ArithmeticException("/by ZERO"); - unreachable statement
        System.out.println("hello");
    }
}

class ExceptionCase3DemoA {
    public static void method(){
        // throw new ExceptionCase3DemoA(); - incompatible types: java7andbelow.features.
        // exception_handling.ExceptionCase3DemoA cannot be converted to java.lang.Throwable
    }
}

class ExceptionCase3DemoB extends RuntimeException {
    public static void method(){
        // throw new ExceptionCase3DemoB(); - Exception in thread "main" java7andbelow.features.
        // exception_handling.ExceptionCase3DemoB
    }
}
