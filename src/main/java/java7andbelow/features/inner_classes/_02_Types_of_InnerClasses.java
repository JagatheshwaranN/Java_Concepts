package java7andbelow.features.inner_classes;

public class _02_Types_of_InnerClasses {

    public static void main(String[] args) {

        /*
            Types of Inner Classes
            ======================
            Based on the position of the declaration and behavior, all Inner Classes are divided
            into 4 types,
            1.	Normal or Regular Inner Class
            2.	Method Level Inner Class
            3.	Anonymous Inner Class
            4.	Static Nested Class

            Normal or Regular Inner Class
            =============================
            If we are declaring any named class directly inside a class without static modifier
            such type of inner class is called as Normal or Regular Inner Class.

            Inside Inner Class, we can't declare any static members. Hence, we can't declare main()
            method, and we can't run inner class directly from the command prompt. Because the Inner
            Class always talks about the Instance terminology, and it can be accessed only with Outer
            Class object.

            Method Local Inner Classes
            ==========================
            Sometimes we can declare a class inside a method. Such type of Inner Classes is called
            as Method Local Inner Classes.

            The main purpose of the Method Local Inner Class is to define the method specific
            repeatedly required functionality. Method Local Inner Classes is suitable to
            meet the nested method requirements.

            We can access Method Local Inner Classes only within the method where we declared.
            Outside of method, we can't access because of its less scope, method local inner
            classes are most rarely used Inner Classes.
        */

        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.NormalInnerClass innerClass = outerClass1.new NormalInnerClass();
        innerClass.method1();

        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.method1();

         /*
            Nesting of Inner Classes
            ========================
            Inside Inner Class we can declare another Inner Class i.e., nesting of Inner Classes
            is possible.
        */
        OuterDemo outerDemo = new OuterDemo();
        OuterDemo.Inner1Demo inner1Demo = outerDemo.new Inner1Demo();
        OuterDemo.Inner1Demo.Inner2Demo inner2Demo = inner1Demo.new Inner2Demo();
        inner2Demo.method1();
    }
}

class OuterClass1 {

    class NormalInnerClass {

        public void method1(){
            System.out.println("Normal Inner class method");
        }
    }
}

class OuterClass2 {

    public void method1(){

        class MethodInnerClass {

            public void sum (int x, int y){
                System.out.println("The sum is "+(x+y));
            }
        }

        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.sum(10, 20);
        System.out.println("Method local inner class line 1");
        System.out.println("Method local inner class line 2");
        System.out.println("Method local inner class line 3");
        methodInnerClass.sum(20, 30);
    }
}

class OuterDemo {

    class Inner1Demo {

        class Inner2Demo {

            public void method1(){
                System.out.println("Inner2Demo - Inner most class method");
            }
        }
    }
}