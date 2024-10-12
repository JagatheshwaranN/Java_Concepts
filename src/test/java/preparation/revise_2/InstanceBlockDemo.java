package preparation.revise_2;

public class InstanceBlockDemo {

    int i = 10;
    {
        m2();
        System.out.println("Instance Initialization Block");
        m1();
        System.out.println(i);
    }

    public void m1() {
        System.out.println("Instance Method M1");
    }

    public static void m2() {
        System.out.println("Static Method M2");
    }

    public static void main(String[] args) {
        InstanceBlockDemo demo = new InstanceBlockDemo();
    }
}
