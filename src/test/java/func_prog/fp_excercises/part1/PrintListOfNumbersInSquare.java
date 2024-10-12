package func_prog.fp_excercises.part1;

import java.util.List;

public class PrintListOfNumbersInSquare {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        printEvenNumbersSquaresInListType1(input);
        printEvenNumbersSquaresInListType2(input);
    }

    private static void printEvenNumbersSquaresInListType1(List<Integer> numbers) {
        numbers
                .stream()
                .filter(PrintListOfNumbersInSquare::isEven)
                .map(PrintListOfNumbersInSquare::square)
                .forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int square(int number){
        return number * number;
    }

    private static void printEvenNumbersSquaresInListType2(List<Integer> numbers) {
        numbers
                .stream().filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

}
