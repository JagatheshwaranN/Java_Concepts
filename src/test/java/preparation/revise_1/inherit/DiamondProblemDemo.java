package preparation.revise_1.inherit;

public class DiamondProblemDemo {

    public static void main(String[] args) {

    }

    public static class A {

        public void display(){
            System.out.println("Class A Display");
        }
    }

    public static class B extends A {

    }

    public static class C extends A {

        @Override
        public void display() {
            System.out.println("Class C Display");
        }
    }

    /*

    Here, Java Compiler will get confuse on calling display() method as it is available
    in both classes.

    In the above code, class D is attempting to inherit from both class B and class C,
    which both inherit from class A. This would lead to the diamond problem, as there
    are two paths (B and C) through which D would inherit the display() method from A.

    public static class D extends B, C {

    }

    */
}
