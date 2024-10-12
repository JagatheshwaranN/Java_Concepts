package preparation.revise_1.mor;

public class Demo12 {

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.regularMethod();
        derivedClass.defaultMethod();
    }

    static class BaseClass implements  MyInterface {

        @Override
        public void regularMethod() {
            System.out.println("BaseClass Regular Method");
        }
    }

    static class DerivedClass  extends  BaseClass {

        @Override
        public void regularMethod() {
            System.out.println("DerivedClass Regular Method");
        }

        @Override
        public void defaultMethod() {
            System.out.println("DerivedClass Default Method");
        }
    }
}

interface MyInterface {

    void regularMethod();

    default void defaultMethod(){
        System.out.println("MyInterface Default Method");
    }

}
