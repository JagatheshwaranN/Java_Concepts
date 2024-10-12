package preparation.revise_1.inherit;

public class SingleInheritanceDemo {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.display();
        subClass.show();
    }

    static class BaseClass {
        void display(){
            System.out.println("BaseClass Display");
        }

        void show(){
            System.out.println("BaseClass Show");
        }
    }

    static class SubClass extends BaseClass {

        @Override
        void display() {
            System.out.println("SubClass Display");
        }
    }
}
