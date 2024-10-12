package preparation.revise_1.statements;

public class LabelledReturnDemo {

    public static void main(String[] args) {
        System.out.println("Value : "+getValue());
    }
    public static int getValue() {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    System.out.println("Encountered at i=" + i + ", j=" + j + ". Returning from getValue method.");
                    return i * j;
                }
                System.out.println("i=" + i + ", j=" + j);

            }

        }
        return -1;
    }
}
