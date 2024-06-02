package preparation.fp_excercises;

import java.util.List;

public class PrintListOfEvenAndOddNumbers {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        printEvenNumbersInListType1(input);
        printEvenNumbersInListType2(input);
        printOddNumbersInListType1(input);
        printOddNumbersInListType2(input);
    }

    private static void printEvenNumbersInListType1(List<Integer> numbers) {
        numbers.stream().filter(PrintListOfEvenAndOddNumbers::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListType2(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printOddNumbersInListType1(List<Integer> numbers) {
        numbers.stream().filter(PrintListOfEvenAndOddNumbers::isOdd).forEach(System.out::println);
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static void printOddNumbersInListType2(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }


}
