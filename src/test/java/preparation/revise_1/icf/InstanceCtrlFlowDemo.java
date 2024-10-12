package preparation.revise_1.icf;

public class InstanceCtrlFlowDemo {

    int i = 10;

    {
        System.out.println("Instance Init Block1");
        i = 20;
    }

    InstanceCtrlFlowDemo() {
        System.out.println("ICF Constructor");
        System.out.println("Value of i in Constructor : "+ i);
    }

    {
        System.out.println("Instance Init Block2");
        i = 30;
    }

    public static void main(String[] args) {
        InstanceCtrlFlowDemo instanceCtrlFlowDemo = new InstanceCtrlFlowDemo();
        System.out.println("Value of i in Main method : "+ instanceCtrlFlowDemo.i);
    }

}
