package beforeJava8.features.exception_handling;

public class _05_CustomizedException_Handle_TryCatch {
    public static void main(String[] args) {

        /*
            Customized Exception Handling by using Try Catch
            ================================================
            Its highly recommended to handle the exceptions. The code which may raise
            an exception is called as risky code, and we have to define that code inside
            the try block and the corresponding handling code inside the catch block.
            try {
                Risky code
            }
            Catch (Exception ex) {
                Handling code
            }
        */
        WithoutTryCatchDemo demo1 = new WithoutTryCatchDemo();
        demo1.method();
        WithTryCatchDemo demo2 = new WithTryCatchDemo();
        demo2.method();
    }
}

class WithoutTryCatchDemo {
    public void method(){
        System.out.println("Without Try Catch Statement1");
        // System.out.println(10/0); - Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println("Without Try Catch Statement2");
    }
}

class WithTryCatchDemo {
    public void method(){
        System.out.println("With Try Catch Statement1");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println("With Try Catch Statement2");
    }
}
