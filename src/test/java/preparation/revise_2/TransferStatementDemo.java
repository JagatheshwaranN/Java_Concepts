package preparation.revise_2;

@SuppressWarnings("All")
public class TransferStatementDemo {

    public static void main(String[] args) {
        breakDemo();
        continueDemo();
        System.out.println(returnDemo());
        labelledBreakDemo();
        labelledContinueDemo();
    }

    private static void breakDemo() {
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                break;
            System.out.println(i);
        }
        System.out.println("The Loop Broken");
    }

    private static void continueDemo() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }

    private static boolean returnDemo() {
        int age = 20;
        if (age > 18)
            return true;
        else
            return false;
    }

    private static void labelledBreakDemo() {
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1)
                    break outerLoop;
                System.out.println("i = " + i);
                System.out.println("j = " + j);
            }
        }
        System.out.println("The Nested Loops Broken");
    }

    private static void labelledContinueDemo() {
        outerLoop:
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (a == 1 && b == 1)
                    continue outerLoop;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }
    }

}
