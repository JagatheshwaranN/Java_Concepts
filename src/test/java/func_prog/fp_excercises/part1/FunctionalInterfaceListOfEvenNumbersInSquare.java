package func_prog.fp_excercises.part1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceListOfEvenNumbersInSquare {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        listOfEvenNumberSquaresWithFunctionalInterfaceType1(input);
        listOfEvenNumberSquaresWithFunctionalInterfaceType2(input);
    }

    private static void listOfEvenNumberSquaresWithFunctionalInterfaceType1(List<Integer> input) {

        Predicate<Integer> integerPredicate = number -> number % 2 == 0;

        Function<Integer, Integer> integerIntegerFunction = number -> number * number;

        Consumer<Integer> println = System.out::println;

        input.stream()
                .filter(integerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);
    }

    private static void listOfEvenNumberSquaresWithFunctionalInterfaceType2(List<Integer> input) {

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        };

        Function<Integer, Integer> integerIntegerFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        Consumer<Integer> println = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        input.stream()
                .filter(integerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);
    }

}
