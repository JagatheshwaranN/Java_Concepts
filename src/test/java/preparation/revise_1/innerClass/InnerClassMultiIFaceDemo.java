package preparation.revise_1.innerClass;

public class InnerClassMultiIFaceDemo {

    public static void main(String[] args) {

        InnerClassMultiIFaceDemo innerClassMultiIFaceDemo = new InnerClassMultiIFaceDemo();
        Inner inner = innerClassMultiIFaceDemo.new Inner();
        inner.method1();
        inner.method2();
        SubInner subInner = innerClassMultiIFaceDemo.new SubInner();
        subInner.nestedMethod();
    }

    class Inner implements MyIFace1, MyIFace2 {

        @Override
        public void method1() {
            System.out.println("Method1");
        }

        @Override
        public void method2() {
            System.out.println("Method2");
        }

        interface NestedIface {
            void nestedMethod();
        }
    }

    class SubInner implements Inner.NestedIface {

        @Override
        public void nestedMethod() {
            System.out.println("Nested Method");
        }
    }
}

interface MyIFace1 {
    void method1();
}

interface MyIFace2 {
    void method2();
}