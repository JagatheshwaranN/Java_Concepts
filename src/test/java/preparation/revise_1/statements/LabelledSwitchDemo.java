package preparation.revise_1.statements;

public class LabelledSwitchDemo {

    public static void main(String[] args) {

        int i = 2;

        outerSwitch:
        switch(i) {

            case 1:
                System.out.println("Outer Switch - Case 1");
                break;

            case 2:
                System.out.println("Outer Switch - Case 2");
                switch (1){
                    case 1:
                        System.out.println("Inner Switch - Case 1");
                        break outerSwitch;

                    case 2:
                        System.out.println("Outer Switch - Case 2");
                        break;
                }
                break;

            case 3:
                System.out.println("Outer Switch - Case 3");
                break;

            default:
                System.out.println("Outer Switch - default");
        }
        System.out.println("Out of outer switch");
    }
}
