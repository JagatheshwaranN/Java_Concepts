package preparation.fp_excercises.part2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        streamCreationUsingOfMethod();
        streamCreationUsingArray();
    }

    private static void streamCreationUsingOfMethod() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        System.out.println(numbers.count());
    }

    private static void streamCreationUsingArray() {
        int[] numberArray = new int[]{6, 7, 8, 9, 10};
        IntStream numbersArray = Arrays.stream(numberArray);
        System.out.println(numbersArray.max());
    }

}
