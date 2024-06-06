package preparation.fp_excercises.part1;

import java.util.List;

public class PrintSumOfOddNumbersInList {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        System.out.println(printSumOfOddNumbersInListType1(input));
        System.out.println(printSumOfOddNumbersInListType2(input));
        System.out.println(printSumOfOddNumbersInListType3(input));
    }

    private static int printSumOfOddNumbersInListType1(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 1).reduce(0, PrintSumOfOddNumbersInList::add);
    }

    private static int add(int aggregate, int nextNumber) {
        return aggregate + nextNumber;
    }

    private static int printSumOfOddNumbersInListType2(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
    }

    private static int printSumOfOddNumbersInListType3(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 1).reduce(0, (x, y) -> x + y);
    }

}
