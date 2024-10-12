package preparation.revise_1.constructor;

public class ConstructorNonStaticMethodDemo {

    public static void main(String[] args) {
        new Derived();
    }

    public static class Base {

        public Base() {
            initialize();
        }

        public void initialize() {
            System.out.println("Initialize from Base");
        }
    }

    public static class Derived extends Base {

        String message = "Initialize from Derived";

        public Derived(){

        }

        @Override
        public void initialize() {
            System.out.println(message);
        }

    }
}


