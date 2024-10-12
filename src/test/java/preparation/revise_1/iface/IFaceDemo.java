package preparation.revise_1.iface;

public class IFaceDemo {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();
        myClass.show();

        MyIFace3 myIFace3 = new MyClass();
        myIFace3.display();
        myIFace3.show();

    }

    public interface MyIFace1 {

        void display();
    }

    public interface MyIFace2 {
        void display();
    }

    public interface MyIFace3 extends MyIFace1, MyIFace2 {
        void show();
    }

    public static class MyClass implements MyIFace3 {

        @Override
        public void display() {
            System.out.println("MyClass Display");
        }

        @Override
        public void show() {
            System.out.println("MyClass Show");
        }
    }
}
