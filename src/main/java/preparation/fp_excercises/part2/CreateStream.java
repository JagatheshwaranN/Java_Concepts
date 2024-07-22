package preparation.fp_excercises.part2;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

    public static void main() {
        streamCreationUsingOfMethod();
        streamCreationUsingArray();
        streamCreationUsingList();
        streamCreationUsingSet();
        streamCreationUsingMap();
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

    private static void streamCreationUsingList() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        Stream<String> alphabets = list.stream();
        System.out.println(alphabets.count());
    }

    private static void streamCreationUsingSet() {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 1, 2, 3, 4, 5);
        Stream<Integer> numbers = set.stream();
        System.out.println(numbers.count());
    }

    private static void streamCreationUsingMap() {
        Map<Integer, String> studentData = new HashMap<>();
        studentData.put(101, "Alex");
        studentData.put(102, "John");
        studentData.put(103, "Smith");
        Stream<Integer> rollNumbers = studentData.keySet().stream();
        System.out.println(rollNumbers.max(Comparator.naturalOrder()));
        Stream<Map.Entry<Integer, String>> students = studentData.entrySet().stream();
        System.out.println(students.count());
    }



}
