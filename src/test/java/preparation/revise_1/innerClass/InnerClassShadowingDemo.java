package preparation.revise_1.innerClass;

public class InnerClassShadowingDemo {

    int x = 10;

    class Inner {

        int x = 20;

        void display() {
            int x = 30;
            System.out.println("Inner class x: " + x);
            System.out.println("Inner class this.x: " + this.x);
            System.out.println("Outer class x: " + InnerClassShadowingDemo.this.x);
        }
    }

    public static void main(String[] args) {
        InnerClassShadowingDemo demo = new InnerClassShadowingDemo();
        InnerClassShadowingDemo.Inner inner = demo.new Inner();
        inner.display();
    }
}
