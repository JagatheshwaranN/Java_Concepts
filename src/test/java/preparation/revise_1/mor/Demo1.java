package preparation.revise_1.mor;

public class Demo1 {

    public static void main(String[] args){
        NonBase nonBase = new NonBase();
        nonBase.display();
        Base base = new NonBase();
        base.display();
    }

    static class Base {

        public void display(){
            System.out.println("Base Display");
        }
    }

    static class NonBase extends Base {

        @Override
        public void display() {
            System.out.println("NonBase Display");
        }
    }
}
