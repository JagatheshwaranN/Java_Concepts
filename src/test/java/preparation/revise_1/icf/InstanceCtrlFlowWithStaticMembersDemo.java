package preparation.revise_1.icf;

public class InstanceCtrlFlowWithStaticMembersDemo {

    int i = 0;
    static int j = 20;

    {
        System.out.println("Instance Init Block1");
        i = 20;
        j = 30;
    }

    InstanceCtrlFlowWithStaticMembersDemo() {
        System.out.println("ICF Constructor");
        System.out.println("Value of i in Constructor : "+ i);
        System.out.println("Value of j in Constructor : "+ j);
        j = 40;
    }

    {
        System.out.println("Instance Init Block2");
        i = 30;
        update();
        System.out.println("Value of j in ICB2 : "+ j);
    }

    public static void update() {
        j = 60;
    }

    public static void main(String[] args) {
        InstanceCtrlFlowWithStaticMembersDemo instanceCtrlFlowDemo = new InstanceCtrlFlowWithStaticMembersDemo();
        System.out.println("Value of i in Main method : "+ instanceCtrlFlowDemo.i);
    }

}
