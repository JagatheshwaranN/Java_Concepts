package preparation.revise_1.sblock;


public class SBlockWithDerivedClassDemo extends SBlockWithBaseClassDemo {

    public static void main(String[] args) {
        System.out.println("Derived Main Method");
    }

    static {
        System.out.println("Derived Static Block");
    }

}