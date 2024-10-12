package preparation.revise_2;

@SuppressWarnings("All")
public class InterfaceDemo {

    public static void main(String[] args) {
        Test1Impl obj = new Test1Impl();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m6();
        obj.method1();
    }
}

@SuppressWarnings("All")
interface Test1 {

    int x = 10;

    void m1();

    void m2();

    default void m3() {
        System.out.println("Interface - M3");
    }

    static void m4() {
        System.out.println("Interface - M4");
    }

    private void m5() {
        System.out.println("Interface - M5");
    }

    Object m6();

}

@SuppressWarnings("All")
interface Test2 {

    void m1();

    void method1();
}

class Test1Impl implements Test1, Test2 {

    @Override
    public void m1() {
        System.out.println(x);
        System.out.println("Test1 - M1");
    }

    @Override
    public void method1() {
        System.out.println("Test2 - Method1");
    }

    @Override
    public void m2() {
        System.out.println("Test1 - M2");
    }

    @Override
    public void m3() {
        System.out.println("Test1 - M3");
    }

    public String m6() {
        System.out.println("Test1 - M6");
        return "";
    }

}