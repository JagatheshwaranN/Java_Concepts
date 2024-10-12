package preparation.revise_2;

@SuppressWarnings("All")
public class LoopsDemo {

    public static void main(String[] args) {
        forLoopDemo();
        whileLoopDemo();
        dowhileLoopDemo();
    }

    private static void forLoopDemo() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void whileLoopDemo() {
        int x = 1;
        while (x <= 5) {
            System.out.println("Hello!");
            x++;
        }
    }

    private static void dowhileLoopDemo() {
        int x = 1;
        do {
            System.out.println("Hai!");
        } while (x < 1);
    }
}

