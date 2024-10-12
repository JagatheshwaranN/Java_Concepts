package preparation.revise_1.mor;

public class Demo4 {

    public static void main(String[] args){
        NonBase nonBase = new NonBase();
        nonBase.display();
        Base base1 = new NonBase();
        base1.display();
        Base base2 = new Base();
        base2.display();
    }

    static class Base {

        protected Object display(){
            System.out.println("Object - Base Display");
            return null;
        }
    }

    static class NonBase extends Base {

        // Covariant Return Type (SubType of SuperClass Return Type)
        @Override
        public String display() {
            System.out.println("String - NonBase Display");
            return null;
        }
    }
}
