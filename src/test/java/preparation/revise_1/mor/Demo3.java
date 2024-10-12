package preparation.revise_1.mor;

public class Demo3 {

    public static void main(String[] args){
        NonBase nonBase = new NonBase();
        nonBase.display();
        Base base = new NonBase();
        base.display();
        Base.show();
        NonBase.show();
    }

    static class Base {

        // Static Method - Static Method Dispatch
        public static void show() {
            System.out.println("Base Show");
        }

        protected void display(){
            System.out.println("Base Display");
        }
    }

    static class NonBase extends Base {

        // Can't override Static Method (Method Hiding)
        public static void show(){
            System.out.println("NonBase Show");
        }

        // Access Modifier level increase
        @Override
        public void display() {
            System.out.println("NonBase Display");
        }
    }
}
