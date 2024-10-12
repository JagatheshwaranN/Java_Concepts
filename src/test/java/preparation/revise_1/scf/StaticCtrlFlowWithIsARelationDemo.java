package preparation.revise_1.scf;

public class StaticCtrlFlowWithIsARelationDemo {

    public static void main(String[] args) {
        System.out.println("Value of Z : "+ Sub.z);
    }
}

class Super {

    static {
        System.out.println("Super Block 1");
    }

    static int x = 10;

    static {
        System.out.println("Super Block 2");
        System.out.println("Value of x : "+ x);
    }

    static int y = 20;

}

class Sub extends Super {

    static {
        System.out.println("Sub Block 1");
    }

    static int z = 30;

    static {
        System.out.println("Sub Block 2");
        System.out.println("Value of y : "+ y);
    }

}