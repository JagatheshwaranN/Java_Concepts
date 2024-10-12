package preparation.revise_2;

public class ControlFlowDemo {


    static int a = 10;

    int b = 20;

    static {
        System.out.println("First static block");
        System.out.println(a);
    }

    {
        System.out.println("First IIB block");
        System.out.println(b);
        show2();
    }

    public void show2() {
        System.out.println("Instance method");
        System.out.println(d);
    }

    int d = 40;

    ControlFlowDemo() {
        System.out.println("Constructor");
        System.out.println(d);
    }

    public static void main(String[] args) {
        ControlFlowDemo demo = new ControlFlowDemo();
    }

    static {
        System.out.println("Second static block");
        show1();

    }

    public static void show1() {
        System.out.println("Static method");
        System.out.println(c);
    }

    static int c = 30;
}
