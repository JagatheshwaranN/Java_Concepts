package java7andbelow.features.lang_package;

public class _15_Boxing {

    public static void main(String[] args) {

        /*
            Autoboxing (Primitive -> Wrapper Object)
            ========================================
            Automatic conversion of primitive to wrapper object by compiler is called as Autoboxing.

            Example, Integer I = 10; (Compiler converts int to Integer automatically by Autoboxing)

            After compilation, the above line will become as below,
            Integer I = Integer.valueOf(10);

            That is internally autoboxing concept is implemented by using valueOf () method.
        */

        Integer i1 = 10;
        System.out.println(i1);

        /*
            Auto-unboxing (Wrapper Object -> Primitive)
            ===========================================
            Automatic conversion of wrapper object to primitive by compiler is called as Autounboxing.

            Example, Integer I = new Integer(10);
            int i = I; (Compiler converts Integer to int automatically by Autounboxing)

            After compilation, the above line will become as below,
            int i = I.intValue (10);

            That is internally autounboxing concept is implemented by using xxxValue () method.
        */

        int i3 = Integer.valueOf(10);
        System.out.println(i3);

        /*
            Points to Remember
            ==================
            It is valid in Java 1.5 and above versions whereas invalid in Java 1.4 version.

            Note: Just because of autoboxing and autounboxing we can use primitives and wrapper
            objects interchangeably from 1.5 version onwards.
        */
        DemoTest.method1();

        /*
            Note: On null reference, if we are trying to perform autounboxing, then we will get
            the NullPointerException.
        */
        Test1.testMethod1();
        Test2.testMethod2();

        /*
            Wrapper Objects Immutable
            =========================
            All wrapper class objects are immutable i.e., once we create wrapper class object,
            we can't perform any changes in the object. If we are trying to perform any changes
            with those changes a new object will be created.
        */
        WrapperObjectDemo.wrapperObjectImmutableDemo();

        /*
            Reason for False
            ================
            Integer i7 = 1000;
            Integer i8 = 1000;
            System.out.println(i7 == i8);

            Note: Internally to provide support for autoboxing, a buffer of wrapper objects will be
            created at the time of wrapper class loading. By autoboxing, if an object is required to
            create, then JVM will check whether this object present in the buffer or not. If it's
            already present in the buffer, then existing buffer object will be used. If it's not
            already available in the buffer, then JVM will create a new object.

            class Integer {
                static {
                    -128	-127	-126	0	126	127
                }
            }

            But buffer concept is available only in the following ranges as below,
            Byte -> Always
            Short -> -128 to 127
            Integer -> -128 to 127
            Long -> -128 to 127
            Character -> 0 to 127
            Boolean -> Always
            Except this range and in all remaining cases, a new object will be created.
        */
    }
}

class DemoTest {

    static Integer i1 = 20; // Auto-Boxing

    public static void method1() {
        int i2 = i1; // Auto-Unboxing
        method2(i2);
    }

    private static void method2(Integer i3) { // Auto-Boxing
        int i4 = i3; // Auto-Unboxing
        System.out.println(i4);
    }
}

class Test1 {

    static Integer i1 = 0;

    public static void testMethod1(){
        int i2 = i1;
        System.out.println(i2);
    }
}

class Test2 {

    static Integer i1;

    public static void testMethod2(){
        // int i2 = i1;
        // System.out.println(i2); - Exception in thread "main" java.lang.NullPointerException
    }
}

class WrapperObjectDemo {

    public static void wrapperObjectImmutableDemo(){

        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);

        Integer i3 = 10;
        System.out.println(i1 == i3);

        Integer i4 = 10;
        System.out.println(i3 == i4);

        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println(i5 == i6);

        Integer i7 = 1000;
        Integer i8 = 1000;
        System.out.println(i7 == i8);
    }
}