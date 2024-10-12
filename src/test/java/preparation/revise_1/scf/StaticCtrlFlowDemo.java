package preparation.revise_1.scf;

public class StaticCtrlFlowDemo {

     static {
         System.out.println("Static Block 1");
    }

    static int x = 10;

    static {
        System.out.println("Static Block 2");
        System.out.println("Value of x : "+ x);
    }

    public static void main(String[] args) {

        System.out.println("Main Method");
    }
}
