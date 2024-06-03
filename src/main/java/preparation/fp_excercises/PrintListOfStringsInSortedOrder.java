package preparation.fp_excercises;

import java.util.Comparator;
import java.util.List;

public class PrintListOfStringsInSortedOrder {

    public static void main(String[] args) {
        List<String> input = List.of("Spring", "Spring Boot", "APIs", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
       // printStringsInSortedOrderFromList(input);
        printStringsInNaturalSortedOrderFromList(input);
        System.out.println("************");
        printStringsInReverseSortedOrderFromList(input);
        System.out.println("************");
        printStringsInCustomSortedOrderFromList(input);

    }

    private static void printStringsInSortedOrderFromList(List<String> input) {
        input.stream().sorted().forEach(System.out::println);
    }

    private static void printStringsInNaturalSortedOrderFromList(List<String> input) {
        input.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    private static void printStringsInReverseSortedOrderFromList(List<String> input) {
        input.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void printStringsInCustomSortedOrderFromList(List<String> input) {
        input.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }

}
