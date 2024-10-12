package preparation.revise_1.inherit;

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {
        SubClass1 subClass1 = new SubClass1();
        subClass1.display();
        subClass1.show();
        SubClass2 subClass2 = new SubClass2();
        subClass2.display();
        subClass2.method();
    }

    static class SuperClass {
        void display(){
            System.out.println("SuperClass Display");
        }
    }

    static class SubClass1 extends SuperClass {

        void show(){
            System.out.println("SubClass1 Show");
        }
    }

    static class SubClass2 extends SuperClass {

        void method(){
            System.out.println("SubClass2 Method");
        }
    }
    
}
