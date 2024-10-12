package preparation.revise_1.icf;

public class InstanceCtrlFlowWithFwdRefDemo {

    {
        System.out.println("Instance Init Block1");
        // System.out.println("Value of i in ICB1 : "+ i); // Illegal forward reference
    }

    int i = 10;

    InstanceCtrlFlowWithFwdRefDemo() {
        System.out.println("ICF Constructor");
        System.out.println("Value of i in Constructor : "+ i);
    }

    {
        System.out.println("Instance Init Block2");
        i = 30;
    }

    public static void main(String[] args) {
        InstanceCtrlFlowWithFwdRefDemo instanceCtrlFlowDemo = new InstanceCtrlFlowWithFwdRefDemo();
        System.out.println("Value of i in Main method : "+ instanceCtrlFlowDemo.i);
    }

}
