package preparation.revise_2;

public class StaticControlFlowDemo {

    static int i = 10;

    static {
        System.out.println("First static block");
        System.out.println(i);
        display();
    }

    public static void display() {
        System.out.println("Static Method");
        System.out.println(j);
    }

    static int j = 20;

    public static void main(String[] args) {
        display();
        System.out.println("*******************************");
        Low low = new Low();
    }

    static {
        System.out.println("Second static block");
        display();
    }

}

class High {

    static int i = 10;

    static {
        System.out.println(i);
        System.out.println("High - Static block");
        m1();
    }

    public static void m1() {
        System.out.println("High - m1 method");
    }

}

class Low extends High {

    static int j = 20;

    static {
        System.out.println("Low - Static block");
        m2();
    }

    public static void m2() {
        System.out.println("Low - m1 method");
        System.out.println(j);
    }

}
