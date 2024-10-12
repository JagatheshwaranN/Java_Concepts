package preparation.revise_1.absract;

public class ACTemplateMethodPatternDemo {

    public static void main(String[] args) {
        ConcreteUtility concreteUtility = new ConcreteUtility();
        concreteUtility.add();
        concreteUtility.sub();
    }

    public abstract static class Utility {

        private final void performOperations(){

            add();

            sub();
        }
        protected void add() {
            System.out.println("Addition");
        }

        protected void sub() {
            System.out.println("Subtraction");
        }
    }

    public static class ConcreteUtility extends Utility {

        @Override
        protected void add() {
            System.out.println("ConcreteUtility - Addition");
        }
    }

}
