package preparation.revise_2;
@SuppressWarnings("All")
public class ArraysDemo {

    public static void main(String[] args) {
        arrayDemo();
        anonymousArrayDemo(new int[]{1, 2, 3});
        arrayDefaultValues();
    }

    private static void arrayDemo() {
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void anonymousArrayDemo(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void arrayDefaultValues() {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        char[] chars = new char[2];
        System.out.println(chars[0]);
        float[] decimals = new float[2];
        System.out.println(decimals[0]);
        boolean[] flag = new boolean[2];
        System.out.println(flag[0]);
        String[] values = new String[2];
        System.out.println(values[0]);
        Object[] elements = new Object[2];
        System.out.println(elements[0]);
    }
}
