package preparation.revise_2;

public class InstanceControlFlow {

    int i = 10;
    static int j = 20;

    {
        System.out.println("HighClass IIB block");
        System.out.println(i);
        System.out.println(j);
        display();
        show();
    }

    public void display() {
        System.out.println("Instance Display Method");
        System.out.println(k);
    }

    public static void show() {
        System.out.println("Static Show Method");
    }

    int k = 30;
    public static void main(String[] args) {
        InstanceControlFlow demo = new InstanceControlFlow();
        System.out.println("******************************");
        LowClass lowClass = new LowClass();
    }

}

class HighClass {
    int i = 10;

    {
        System.out.println(i);
        System.out.println("HighClass IIB block");
        display();
    }

    public void display() {
        System.out.println("HighClass Instance Display Method");
    }

    HighClass () {
        System.out.println("HighClass Constructor");
    }
}

class LowClass extends HighClass {

    int j = 20;

    {
        System.out.println(j);
        System.out.println("LowClass IIB block");
        display2();
    }

    public void display2() {
        System.out.println("LowClass Instance Display Method");
        System.out.println(k);
    }

    int k = 30;
    LowClass () {
        System.out.println("LowClass Constructor");
        System.out.println(k);
    }

}