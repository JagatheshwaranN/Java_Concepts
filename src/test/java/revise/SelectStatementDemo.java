package revise;

@SuppressWarnings("All")
public class SelectStatementDemo {


    public static void main(String[] args) {
        ifElseDemo();
    }

    private static void ifElseDemo() {

        int age = 18;
        String gender = "male";

        if (age >= 18) {
            if (gender.equals("male")) {
                System.out.println("Male with age equal to or above 18 years");
            } else if (gender.equals("female")) {
                System.out.println("Female with age equal to or above 18 years");
            } else {
                System.out.println("Trans Gender with age equal to or above 18 years");
            }
        } else {
            System.out.println("Age is less than 18 years.");
        }
    }
}
