package func_prog.fp_excercises.part1;

import java.util.List;

public class PrintSumOfListOfNumbers {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        System.out.println(printSumOfNumbersInListType1(input));
        System.out.println(printSumOfNumbersInListType2(input));
        System.out.println(printSumOfNumbersInListType3(input));
    }

    private static int printSumOfNumbersInListType1(List<Integer> numbers) {
        return numbers.stream().reduce(0, PrintSumOfListOfNumbers::add);
    }

    private static int add(int aggregate, int nextNumber) {
        return aggregate + nextNumber;
    }

    private static int printSumOfNumbersInListType2(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    private static int printSumOfNumbersInListType3(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> x + y);
    }

}
