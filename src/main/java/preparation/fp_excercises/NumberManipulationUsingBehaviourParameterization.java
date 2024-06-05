package preparation.fp_excercises;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberManipulationUsingBehaviourParameterization {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        manipulateNumbersUsingBP(input);
    }

    private static void manipulateNumbersUsingBP(List<Integer> numbers) {

        manipulateNumbers(numbers, number -> number * number);
        manipulateNumbers(numbers, number -> number * number * number);
        manipulateNumbers(numbers, number -> number + number);
    }

    private static void manipulateNumbers(List<Integer> numbers, Function<Integer, Integer> integerIntegerFunction) {
        numbers.stream().map(integerIntegerFunction).forEach(System.out::println);
    }

}
