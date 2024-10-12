package preparation.revise_2;

import java.util.Arrays;

@SuppressWarnings("All")
public class MethodOverloadingDemo {

    public static void main(String[] args) {

        test1((byte) 2);
        test1(1);
        test1(1, 2, 3);
        test1(new Integer(10));
        test1(1, 1.2f);
        test1(1.2f, 1);
        test1("Java");
        test1(new StringBuffer("Java1"));

        Demo demo = new Demo();
        Base b1 = new Base();
        Base b2 = new Derive();
        Derive d = new Derive();
        demo.test(b1);
        demo.test(b2);
        demo.test(d);
    }

    static void test1(byte b) {
        System.out.println("Byte :: " + b);
    }

    static void test1(int i) {
        System.out.println("Int :: " + i);
    }

    static void test1(Integer ii) {
        System.out.println("Integer :: " + ii);
    }

    static void test1(long l) {
        System.out.println("Long :: " + l);
    }

    static void test1(float f) {
        System.out.println("Float :: " + f);
    }

    static void test1(double d) {
        System.out.println("Double :: " + d);
    }

    static void test1(int i, float f) {
        System.out.println("Int :: " + i + " Float :: " + f);
    }

    static void test1(float f, int i) {
        System.out.println("Float :: " + f + " Int :: " + i);
    }

    static void test1(int i, double d) {
        System.out.println("Int :: " + i + " Double :: " + d);
    }

    static void test1(double d, int i) {
        System.out.println("Double :: " + d + " Int :: " + i);
    }

    static void test1(int... var) {
        System.out.println("Var :: "+ Arrays.toString(var));
    }

    static void test1(String s) {
        System.out.println("String :: "+s);
    }

    static void test1(StringBuffer sb) {
        System.out.println("StringBuffer :: "+sb);
    }

    static void test1(Object o) {
        System.out.println("Object :: "+o);
    }
}

class Base {

}

class Derive extends Base {

}

class Demo {
    static void test(Base b) {
        System.out.println("Base");
    }

    static void test(Derive d) {
        System.out.println("Derive");
    }
}

