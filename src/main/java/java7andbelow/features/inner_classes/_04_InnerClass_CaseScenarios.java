package java7andbelow.features.inner_classes;

public class _04_InnerClass_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case Scenarios
            ==============

            Case 1: Accessing Static / Non-Static Members from Method Local Inner Class
            ===========================================================================
            We can declare the Method Local Inner Class inside both instance and static methods.
            If we declare the Inner Class inside Instance method then from that Method Local Inner
            Class, we can access both static and non-static members of Outer Class directly. If we
            declare the Inner Class inside Static method then we can access only static members
            directly from that Method Local Inner Class.

            Case 2: Accessing Members from Method in which Method Local Inner Class declared
            ================================================================================
            From Method Local Inner Class, we can't access the local variables of the method in
            which we declare the Inner Class. If the local variable declared as Final, then we
            can access.

            Explanation:
            ============
            Now, the x value will be in stack and the objects created in heap.The x value in stack
            will be destroyed after the completion of method1. But there may chance of existence
            of inner class object in heap and if it tries to access the x value from method m1,
            then we can't have the x value and its was already destroyed with the completion of
            method1. But, when we have x variable as Final, then only in compile time the variable
            x will be replaced with value. In this case, even after the completion of method1,
            the value will available as the final variable x is replaced with value 10. So, we
            can access the variable x if it’s declared as Final.

            Consider the following code,
            class Test {
                int x = 10;
                static int y = 20;
                public void m1 () {
                    int z = 30;
                    final int a = 40;
                        class Inner {
                            public void m2 () {
                            SOP (variable); // Line 1
                            }
                        }
                }
            }

            At line 1, which of the above variables can be accessed directly.
            x, y, and a.

            If we declare m1 method as static, which of the above variables can be accessed
            directly at line 1.
            y and a.

            If we declare m2 method as static, which of the above variables can be accessed
            directly at line 1.

            We will get CE because we can't declare the static members inside the Inner Classes.
            The only applicable modifiers for Method Local Inner Classes are final, abstract and
            strictfp. If we are trying to apply any other modifier, then we will get the compile
            time error.
        */

        /*
            If we declare the method1() as static, then we will get compile time error saying non-static
            variable x cannot be referenced static context when try to print x.
        */
        Outer1Demo outer1Demo = new Outer1Demo();
        outer1Demo.method1();

        /*
            CE: Local variable x is accessed from within inner class; needs to be declared final.
            If we declare variable x as Final, then we won't get any compile time error.

            Update: The above condition was live until Java 1.7 version. Starting from Java 8, even
            if you don't explicitly declare them as final, they are treated as effectively final
            if their values are not modified. So, the below code, the access to x is valid, and it
            should compile without errors.
        */
        Outer2Demo outer2Demo = new Outer2Demo();
        outer2Demo.method1();
    }
}

class Outer1Demo {

    int x = 10;
    static int y = 20;

    public void method1() {

        class MethodLevelInnerClass1 {

            public void m1(){
                System.out.println(x);
                System.out.println(y);
            }
        }

        MethodLevelInnerClass1 innerClass1 = new MethodLevelInnerClass1();
        innerClass1.m1();
    }
}

class Outer2Demo {

    public void method1() {

        int x = 10;

        class MethodLevelInnerClass2 {

            public void m1(){
                System.out.println(x);
            }
        }

        MethodLevelInnerClass2 innerClass1 = new MethodLevelInnerClass2();
        innerClass1.m1();
    }
}