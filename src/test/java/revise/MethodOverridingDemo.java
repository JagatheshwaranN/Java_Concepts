package revise;

public class MethodOverridingDemo {

    public static void main(String[] args) throws Exception {
        Base1 base1 = new Base1();
        Derived1 derived1 = new Derived1();
        Base1 base2 = new Derived1();
        base1.test1();
        derived1.test1();
        base2.test1();
        derived1.test2();
        Derived1.method1();
        // derived1.method1(); // Shows Warning - But Possible.
        // base1.test4();
        // derived1.test4();
        derived1.test5();

    }
}

class Base1 {

    Base1() {
        System.out.println("Base - Constructor");
    }
    protected void test1() {
        System.out.println("Base - Test1");
    }

    protected void test2() {
        System.out.println("Base - Test2");
    }

    public static void method1() { // Method Hiding
        System.out.println("Base - Method1");
    }

    private void test3() {
        System.out.println("Base - Test3");
    }

    protected void test4() throws Exception {
        System.out.println("Base - Test4");
        System.out.println(10/0);
    }

    protected void test5() throws Exception {
        System.out.println("Base - Test5");
        System.out.println(10/0);
    }
}

class Derived1 extends Base1 {

    Derived1() {
        // super(); - If we need to explicitly call. But, compiler implicitly calls it.
        System.out.println("Derived - Constructor");
    }

    @Override
    public void test1() {
        System.out.println("Derived - Test1");
    }

    @Override
    public void test2() {
        super.test2();
        System.out.println("Derived - Test2");
    }

    public static void method1() { // Method Hiding
        System.out.println("Derived - Method1");
    }

    //    @Override - Private Method can't be overridden.
    //    private void test3() {
    //        System.out.println("Derived - Test3");
    //    }

    // Can throw same level or child exception
    @Override
    public void test4() throws ArithmeticException {
        System.out.println("Derived - Test4");
        System.out.println(10/0);
    }

    public void test5() throws RuntimeException {
        System.out.println("Derived - Test5");
        System.out.println(10/0);
    }

}

final class Base2 {
    public void method1() { // Method Hiding
        System.out.println("Final Base2 - Method1");
    }
}

// class Derived2 extends Base2 - Cannot inherit from final 'revise.Base2'