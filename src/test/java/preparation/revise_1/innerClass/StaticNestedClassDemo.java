package preparation.revise_1.innerClass;

public class StaticNestedClassDemo {

    public static void main(String[] args) {
        StaticNestedClassDemo staticNestedClassDemo = new StaticNestedClassDemo();

        // OuterClass Method
        staticNestedClassDemo.show();

        StaticNestedClassDemo.InnerClass innerClass = new StaticNestedClassDemo.InnerClass();

        // InnerClass Method
        innerClass.display();

        // InnerClass Method
        InnerClass.show();

    }
    static String address = "India";
    private final int mobile = 12345;

    public void show() {
        System.out.println("Public Method of Outer Class");
    }

    private static void showcase() {
        System.out.println("Private Method of Outer Class");
    }


    protected static class InnerClass {

        String name = "John";
        int age = 29;

        public void display() {
            System.out.println("Name : " + name + " , Age : " + age + " , address : " + address);
        }

        static void show() {
            showcase();
            System.out.println("Static Method of Inner Class");
        }
    }
}
