package preparation.fp_excercises;

import java.util.List;

public class PrintListOfNumbers {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        printNumbersInListType1(input);
        printNumbersInListType2(input);
    }

    private static void printNumbersInListType1(List<Integer> numbers) {
        numbers.stream().forEach(PrintListOfNumbers::print);
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printNumbersInListType2(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }


}
