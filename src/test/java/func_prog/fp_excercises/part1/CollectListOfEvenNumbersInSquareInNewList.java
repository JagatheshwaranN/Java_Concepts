package func_prog.fp_excercises.part1;

import java.util.List;
import java.util.stream.Collectors;

public class CollectListOfEvenNumbersInSquareInNewList {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        collectEvenNumbersSquaresInNewList(input);
    }

    private static void collectEvenNumbersSquaresInNewList(List<Integer> input) {

        List<Integer> squares =
                input.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(squares);
    }

}
