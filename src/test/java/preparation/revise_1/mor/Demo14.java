package preparation.revise_1.mor;

public class Demo14 {

    public static void main(String[] ar){
        SubBase subBase = new SubBase();
        subBase.display();
        Base base = new Base();
        base.display();
    }

    static class Base {

        public void display(){
            System.out.println("Base Display Method");
            show();
        }

        private void show(){
            System.out.println("Base Show Method");
        }
    }

    static class SubBase extends Base {
        @Override
        public void display() {
            System.out.println("SubBase Display Method");
            // show(); - Not allowed
        }
    }

}
