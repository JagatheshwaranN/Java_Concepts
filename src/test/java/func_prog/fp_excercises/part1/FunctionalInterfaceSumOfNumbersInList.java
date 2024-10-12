package func_prog.fp_excercises.part1;

import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterfaceSumOfNumbersInList {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        System.out.println(sumOfNumbersInListType1(input));
        System.out.println(sumOfNumbersInListType2(input));
    }

    private static int sumOfNumbersInListType1(List<Integer> numbers) {

        BinaryOperator<Integer> sum = Integer::sum;

        return numbers.stream().reduce(0, sum);
    }

    private static int sumOfNumbersInListType2(List<Integer> numbers) {

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer number1, Integer number2) {
                return number1 + number2;
            }
        };

        return numbers.stream().reduce(0, sum);
    }

}
