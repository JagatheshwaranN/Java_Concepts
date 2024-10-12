package preparation.revise_1.statements;

public class LabelledContinueDemo {

    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    System.out.println("Encountered at i=" + i + ", j=" + j + ". Skipping the iteration");
                    continue outerloop;
                }
                System.out.println("i=" + i + ", j=" + j);

            }

        }
        System.out.println("Out of both loops");
    }
}
