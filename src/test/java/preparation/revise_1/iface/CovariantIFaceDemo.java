package preparation.revise_1.iface;

public class CovariantIFaceDemo {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        String value = myClass.display();
        System.out.println(value);
    }

    public interface MyIFace1 {

        Object display();
    }

    public static class MyClass implements MyIFace1 {

        @Override
        public String display() {
            System.out.println("MyClass Display");
            return "Covariant ReturnType";
        }

    }
}
