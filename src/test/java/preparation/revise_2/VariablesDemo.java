package preparation.revise_2;

public class VariablesDemo {

    // Primitive Variable
    String name; // Instance Variable
    int age = 30; // Instance Variable
    static String companyName = "ABC Limited"; // Static Variable

    // Reference Variable
    static String address = new String("London");

    VariablesDemo() {
        name = "John";
    }

    public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();
        System.out.println(demo.name);
        System.out.println(demo.age);
        display();
    }

    private static void display() {
        String phone = "9876543210"; // Local Variable
        System.out.println(companyName);
        System.out.println(phone);
        System.out.println(address);
    }

}
