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

        */

        /*
            If we declare the method1() as static, then we will get compile time error saying non-static
            variable x cannot be referenced static context when try to print x.
        */
        Outer1Demo outer1Demo = new Outer1Demo();
        outer1Demo.method1();
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