package java7andbelow.features.oops;

public class _06_Method_Signature {

    public static void main(String[] args) {

        /*
            Method Signature
            ================
            1. In Java, method signature consists of the method name followed by the argument types.
               Return type is not part of the method signature in Java.

            2. Compiler will use the method signature to resolve the method calls.

            Example, public static int m1 (int i, float f)

            3. Within a class, two methods with same signature are not allowed.
        */
    }
}

class MSignDemo{
    public void m1(int i){}

    // public void m1(int i){} - method m1(int) is already defined in class java7andbelow.features.oops.MSignDemo
}