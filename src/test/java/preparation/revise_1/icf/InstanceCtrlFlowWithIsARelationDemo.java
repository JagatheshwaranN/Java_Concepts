package preparation.revise_1.icf;

public class InstanceCtrlFlowWithIsARelationDemo {

    public static class Super {

        int i = 10;
        int j = 10;

        {
            System.out.println("Super Instance Init Block1");
            i = 20;
        }

        Super() {
            System.out.println("Super ICF Constructor");
            System.out.println("Value of i in Constructor : "+ i);
        }

        {
            System.out.println("Super Instance Init Block2");
            i = 30;
            j = 0;
        }

    }

    public static class Sub extends Super {

        {
            System.out.println("Sub Instance Init Block1");
            j = 20;
        }

        Sub() {
            System.out.println("Sub ICF Constructor");
            System.out.println("Value of j in Constructor : "+ j);
        }

        {
            System.out.println("Sub Instance Init Block2");
            j = 50;
        }

    }
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println("Value of i in Main method : "+ sub.i);
        System.out.println("Value of j in Main method : "+ sub.j);
    }
    
}
