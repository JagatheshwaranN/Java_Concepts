package beforeJava8.features.exception_handling;

public class _19_Exception_Propagation {
    public static void main(String[] args) {

        /*
            Exception Propagation
            =====================
            Inside a method if an exception raised and if we are not handling that
            exception, then the exception object will be propagated to the caller
            method. Then caller method is responsible to handle the exception. This
            process is called as Exception Propagation.

            Rethrowing Exception
            ====================
            We can use this approach to convert one exception type to the another
            exception type.
        */
        ExceptionPropagationDemo.method1();
        RethrowingExceptionDemo.method();
    }
}

class ExceptionPropagationDemo {

    public static void method1(){
        method2();
    }

    public static void method2(){
        throw new ArithmeticException(" / by Zero");
    }
}

class RethrowingExceptionDemo {
    public static void method() {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ex){
            throw new NullPointerException();
        }
    }
}