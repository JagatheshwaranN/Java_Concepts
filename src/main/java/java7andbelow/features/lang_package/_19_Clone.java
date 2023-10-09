package java7andbelow.features.lang_package;

public class _19_Clone {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            Clone
            =====
            The process of creating exactly the duplicate objects is called as Cloning. The main
            purpose of the cloning is to maintain the backup copy and to preserve the state of an
            object. We can perform cloning by using clone() method of Object class.

            protected native Object clone() throws CloneNotSupportedException;

            Note:
            =====
            We can perform cloning only for cloneable objects. An object is said to be cloneable if
            and only if the corresponding class implements Cloneable Interface. Cloneable Interface
            present in java.lang package and, it doesn't contain any methods and, it's a Marker
            Interface. If we are trying to perform cloning for non-cloneable objects, then we will
            get the RTE saying CloneNotSupportedException.

        */

        TestDemo.cloningDemo();
    }
}

class TestDemo implements Cloneable {

    int x = 10;
    int y = 20;

    public static void cloningDemo() throws CloneNotSupportedException {

        TestDemo testDemo1 = new TestDemo();
        TestDemo testDemo2 = (TestDemo)testDemo1.clone();
        System.out.println(testDemo2.x);
        System.out.println(testDemo2.y);

        System.out.println(testDemo1.x);
        System.out.println(testDemo1.y);

        testDemo2.x = 100;
        testDemo2.y = 200;

        System.out.println(testDemo2.x);
        System.out.println(testDemo2.y);
    }

    @Override
    public TestDemo clone() {
        try {
            return (TestDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}