package preparation.revise_1.absract;

public class ACHelperInnerClassDemo {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass(10);
        concreteClass.performOperation();
        concreteClass.abstractMethod();
        ConcreteClass.NestedConcreteClass nestedConcreteClass = new ConcreteClass.NestedConcreteClass();
        nestedConcreteClass.nestedAbstractMethod();
    }

    public static abstract class AbstractClass {

        private int data;

        public AbstractClass(int data){
            this.data = data;
        }

        abstract void abstractMethod();

        private class Helper {

            public void processData(){
                System.out.println("The processed data : "+ data);
            }
        }

        public void performOperation() {
            Helper helper = new Helper();
            helper.processData();
            abstractMethod();
        }

        static abstract class NestedAbstractClass {
            abstract void nestedAbstractMethod();
        }
    }

    public static class ConcreteClass extends AbstractClass {

        public ConcreteClass(int data) {
            super(data);
        }

        @Override
        void abstractMethod() {
            System.out.println("ConcreteClass - AbstractMethod");
        }

        static class NestedConcreteClass extends NestedAbstractClass {

            @Override
            void nestedAbstractMethod() {
                System.out.println("NestedConcreteClass - NestedAbstractMethod");
            }
        }
    }
}
