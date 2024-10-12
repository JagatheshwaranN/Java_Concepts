package preparation.revise_2;

@SuppressWarnings("All")
public class SelectStatementDemo {


    public static void main(String[] args) {
        ifElseDemo();
        switchDemo();
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

    private static void switchDemo() {
        String day = "Wed";
        switch (day) {
            case "Mon":
                System.out.println("Day 1");
                break;
            case "Tue":
                System.out.println("Day 2");
                break;
            case "Wed":
                System.out.println("Day 3");
                break;
            case "Thu":
                System.out.println("Day 4");
                break;
            case "Fri":
                System.out.println("Day 5");
                break;
            case "Sat":
                System.out.println("Day 6");
                break;
            case "Sun":
                System.out.println("Day 7");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
