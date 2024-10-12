package preparation.revise_1.inherit;

public class MultipleSubClassInheritanceDemo {

    public static void main(String[] args) {
        MyBaseClass myBaseClass = new MyBaseClass();
        myBaseClass.myMethod();
        MySubClass mySubClass = new MySubClass();
        mySubClass.myMethod();
        MySubClass2 mySubClass2 = new MySubClass2();
        mySubClass2.myMethod();
    }

    public interface MyInterface {
        void myMethod();
    }

    public static class MyBaseClass implements MyInterface {

        @Override
        public void myMethod() {
            System.out.println("BaseClass Default Implementation");
        }
    }

    public static class MySubClass extends MyBaseClass {

        @Override
        public void myMethod() {
            System.out.println("SubClass Default Implementation");
        }
    }

    public static class AnotherSubClass implements MyInterface {

        @Override
        public void myMethod() {
            System.out.println("AnotherSubClass Default Implementation");
        }
    }

    public static class MySubClass2 extends AnotherSubClass implements MyInterface {

        @Override
        public void myMethod() {
            System.out.println("MySubClass2 Default Implementation");
        }
    }
}
