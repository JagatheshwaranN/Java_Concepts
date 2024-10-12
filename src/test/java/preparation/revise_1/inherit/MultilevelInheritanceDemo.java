package preparation.revise_1.inherit;

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.display();
        subClass.show();
        subClass.method();
    }

    static class SuperClass {
        void display(){
            System.out.println("SuperClass Display");
        }
    }

    static class BaseClass extends SuperClass {

        void show(){
            System.out.println("BaseClass Show");
        }
    }

    static class SubClass extends BaseClass {

        void method(){
            System.out.println("SubClass Method");
        }
    }

}
