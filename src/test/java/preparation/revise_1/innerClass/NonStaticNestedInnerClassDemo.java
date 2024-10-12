package preparation.revise_1.innerClass;

public class NonStaticNestedInnerClassDemo {

    public static void main(String[] args) {
        NonStaticNestedInnerClassDemo nonStaticNestedInnerClassDemo = new NonStaticNestedInnerClassDemo();
        NonStaticNestedInnerClassDemo.InnerClass innerClass = nonStaticNestedInnerClassDemo.new InnerClass();
        innerClass.display();
    }

    static String address = "India";
    private int mobile = 12345;

    public void show() {
        System.out.println("Public Method of Outer Class");
    }

    private static void showcase() {
        System.out.println("Private Method of Outer Class");
    }


    private class InnerClass {

        String name = "John";
        int age = 29;

        public void display() {
            System.out.println("Name : " + name + " , Age : " + age + " , address : " + address + " , mobile : " + mobile);
            show();
            showcase();
        }

    }
}
