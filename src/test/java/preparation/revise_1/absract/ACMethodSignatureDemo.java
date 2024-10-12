package preparation.revise_1.absract;

public class ACMethodSignatureDemo {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.methodToHide();
        ((SuperClass) concreteClass).methodToHide();
        concreteClass.anotherMethod();
    }

    public static class SuperClass {
        void methodToHide(){
            System.out.println("Hide Method in SuperClass");
        }
    }
    public abstract static class AbstractClass  extends SuperClass {
        abstract void methodToHide();

        void anotherMethod(){
            System.out.println("Another method in AbstractClass");
        }

    }

    public static class ConcreteClass extends AbstractClass {

        @Override
        void methodToHide() {
            System.out.println("Hide Method in ConcreteClass");
        }
    }
}
