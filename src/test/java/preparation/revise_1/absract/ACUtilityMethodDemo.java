package preparation.revise_1.absract;

public class ACUtilityMethodDemo {

    public static void main(String[] args) {
        System.out.println(ConcreteUtility.add(5, 10));
        System.out.println(ConcreteUtility.sub(10, 5));
        System.out.println(ConcreteUtility.mul(5, 10));
        System.out.println(ConcreteUtility.div(10, 5));
    }


    public abstract static class Utility {

        static int add(int a, int b) {
            return a + b;
        }

        static int mul(int a, int b) {
            return a * b;
        }
    }

    public static class ConcreteUtility extends Utility {

        static int sub(int a, int b) {
            return a - b;
        }

        static int div(int a, int b) {
            return a / b;
        }
    }
}
