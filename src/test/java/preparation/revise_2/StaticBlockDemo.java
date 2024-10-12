package preparation.revise_2;

public class StaticBlockDemo {

    final static int i = 20;

    static int j = 10;

    static int k;

    static {
        k = 5;
        System.out.println("Static block - First statement to be executed");
        demo();
    }

    static void demo() {
        System.out.println("Static block demo");
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

    static {
        System.out.println("Last Static Block");
    }

}
