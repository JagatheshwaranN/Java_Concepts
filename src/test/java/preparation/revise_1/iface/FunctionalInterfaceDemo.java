package preparation.revise_1.iface;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        MyFunctionalIFace myFunctionalIFace = () -> System.out.println("Execute MyMethod using Lambda");
        myFunctionalIFace.myMethod();

        MyFunctionalIFace myFunctionalIFace1 = FunctionalInterfaceDemo::printMessage;
        myFunctionalIFace1.myMethod();
    }

    public static void printMessage() {
        System.out.println("Execute MyMethod using MethodReference");
    }

    @FunctionalInterface
    public interface MyFunctionalIFace {
        void myMethod();
    }




}
