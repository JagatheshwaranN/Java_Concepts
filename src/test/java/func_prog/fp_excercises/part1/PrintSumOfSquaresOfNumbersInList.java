package func_prog.fp_excercises.part1;

import java.util.List;

public class PrintSumOfSquaresOfNumbersInList {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        printSumOfSquaresInListType1(input);
        printSumOfSquaresInListType2(input);
        printSumOfSquaresInListType3(input);
    }

    private static void printSumOfSquaresInListType1(List<Integer> numbers) {
        int sumOfSquares =
                numbers
                .stream()
                .map(PrintSumOfSquaresOfNumbersInList::square)
                .reduce(0, PrintSumOfSquaresOfNumbersInList::add);
        System.out.println(sumOfSquares);
    }

    private static int square(int number){
        return number * number;
    }

    private static int add(int aggregate, int nextNumber){
        return aggregate + nextNumber;
    }

    private static void printSumOfSquaresInListType2(List<Integer> numbers) {
        int sumOfSquares =
                numbers
                .stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquares);
    }

    private static void printSumOfSquaresInListType3(List<Integer> numbers) {
        int sumOfSquares =
                numbers
                        .stream()
                        .map(number -> number * number)
                        .reduce(0, (x, y) -> x + y);
        System.out.println(sumOfSquares);
    }

}
