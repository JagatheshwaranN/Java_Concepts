package preparation.revise_1.scf;

public class StaticCtrlFlowWithFwdRefDemo {

     static {
         System.out.println("Static Block 1");
         // System.out.println("Value of x : "+ x); // Illegal forward reference
    }

    static int x = 10;

    static {
        System.out.println("Static Block 2");
        System.out.println("Value of x : "+ x);
    }

    static int y = 20;

    public static void main(String[] args) {

        System.out.println("Main Method");
        System.out.println("Value of y : "+ y);
    }
}
