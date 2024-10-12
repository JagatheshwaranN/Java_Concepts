package preparation.revise_1.inherit;

public class DiamondProblemFixDemo {

    public static void main(String[] args) {
        D d = new D();
        d.display();
        d.show();
    }

    public interface A {

        void show();

        default void display() {
            System.out.println("Interface C Display");
        }
    }

    public interface B extends A {

        @Override
        default void display() {
            System.out.println("Interface B Display");
        }
    }

    public interface C extends A {
        void show();

        @Override
        default void display() {
            System.out.println("Interface C Display");
        }
    }

    public static class D implements B, C {

        @Override
        public void show() {
            System.out.println("Class D Show");
        }

        @Override
        public void display() {
            B.super.display();
            C.super.display();
            System.out.println("Class D Display");
        }
    }

}
