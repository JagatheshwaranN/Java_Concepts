package preparation.fp_excercises;

import java.util.Comparator;
import java.util.List;

public class PrintListOfDistinctNumbersInSortedOrder {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 5,  11, 2, 7);
        printDistinctNumbersInSortedOrderFromList(input);
        printDistinctNumbersInNaturalSortedOrderFromList(input);
        printDistinctNumbersInReverseSortedOrderFromList(input);
    }

    private static void printDistinctNumbersInSortedOrderFromList(List<Integer> input) {

        input.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void printDistinctNumbersInNaturalSortedOrderFromList(List<Integer> input) {

        input.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    private static void printDistinctNumbersInReverseSortedOrderFromList(List<Integer> input) {

        input.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}
