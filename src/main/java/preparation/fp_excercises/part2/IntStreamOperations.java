package preparation.fp_excercises.part2;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamOperations {

    public static void main(String[] args) {
        doSumOfNaturalNumbers();
        doSumOfNaturalNumbersClosed();
        doSumOfOddNumbers();
        printSumOfOddNumbers();
        printSumOfEvenNumbers();
        storeNumbersInList();
        calculateFactorial();
        calculateLongFactorial();
        calculateBigIntFactorial();
    }

    private static void doSumOfNaturalNumbers(){
        int sum = IntStream.range(1, 10).sum();
        System.out.println(sum);
    }

    private static void doSumOfNaturalNumbersClosed() {
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);
    }

    private static void doSumOfOddNumbers(){
        int sum = IntStream.iterate(1, num -> num + 2).limit(10).sum();
        System.out.println(sum);
    }

    private static void printSumOfOddNumbers() {
        int sum = IntStream.iterate(1, num -> num + 2).limit(10).peek(System.out::println).sum();
        System.out.println(sum);
    }

    private static void printSumOfEvenNumbers() {
        int sum = IntStream.iterate(2, num -> num + 2).limit(10).peek(System.out::println).sum();
        System.out.println(sum);
    }

    private static void storeNumbersInList(){
        List<Integer> numbers = IntStream.iterate(1, num -> num * 2).limit(10).boxed().toList();
        System.out.println(numbers);
    }

    private static void calculateFactorial() {
        int fact = IntStream.rangeClosed(1, 30).reduce(1, (x, y) -> x * y);
        System.out.println(fact);
    }

    private static void calculateLongFactorial() {
        long fact = LongStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y);
        System.out.println(fact);
    }

    private static void calculateBigIntFactorial() {
        BigInteger fact = IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println(fact);
    }
}
