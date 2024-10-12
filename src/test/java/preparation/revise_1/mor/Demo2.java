package preparation.revise_1.mor;

public class Demo2 {

    public static void main(String[] args){
        NonBase nonBase = new NonBase();
        nonBase.display();
        Base base = new NonBase();
        base.display();
        base.show();
    }

    static class Base {

        private void show() {
            System.out.println("Base Show");
        }

        protected void display(){
            System.out.println("Base Display");
        }
    }

    static class NonBase extends Base {

        // Can't override Private Method (Kind of Hiding)
        private void show(){
            System.out.println("NonBase Show");
        }

        // Access Modifier level increase
        @Override
        public void display() {
            System.out.println("NonBase Display");
        }
    }
}
