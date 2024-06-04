package preparation.fp_excercises;

import java.util.List;
import java.util.function.Predicate;

public class BehaviourParameterization {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        printNumbers(input);
    }

    private static void printNumbers(List<Integer> numbers) {
        filterAndPrint(numbers, x -> x % 2 == 0);
        filterAndPrint(numbers, x -> x % 2 == 1);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }

}
