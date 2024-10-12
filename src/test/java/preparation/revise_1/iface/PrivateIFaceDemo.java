package preparation.revise_1.iface;

public class PrivateIFaceDemo {

    public static void main(String[] args) {
        MyInterface myInterface = new MyClass();
        myInterface.method();
        MyInterface2 myInterface2 = new MyClass2();
        myInterface2.method1();
    }

    private interface MyInterface {

        void method();
    }

    public static class MyClass implements MyInterface {
        @Override
        public void method() {
            System.out.println("MyClass Method");
        }
    }

    protected interface MyInterface2 {

        void method1();
    }

}


class MyClass2 implements PrivateIFaceDemo.MyInterface2 {

    @Override
    public void method1() {
        System.out.println("MyClass2 Method");
    }

}