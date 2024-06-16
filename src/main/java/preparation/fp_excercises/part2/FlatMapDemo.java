package preparation.fp_excercises.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {
        doJoining();
        doJoiningWithDelimiter();
        printLettersOfCourseName();
        printDistinctLettersOfCourseName();
        combineTwoListAndMakeTuple();
        printListWithSameValues();
        printListWithNotSameValues();
        printListWithSameLengthValues();
    }

    private static void doJoining() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        // Using Joining
        System.out.println(courses.stream().collect(Collectors.joining(" ")));

        // Using String.join
        System.out.println(String.join(" ", courses));
    }

    private static void doJoiningWithDelimiter() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println(courses.stream().collect(Collectors.joining(",")));
    }

    private static void printLettersOfCourseName() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
    }

    private static void printDistinctLettersOfCourseName() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
    }

    private static void combineTwoListAndMakeTuple() {
        List<String> courses1 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> courses = courses1.stream().flatMap(course1 ->
                courses2.stream().map(course2 -> List.of(course1, course2)))
                .collect(Collectors.toList());
        System.out.println(courses);
    }

    private static void printListWithSameValues() {
        List<String> courses1 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> courses = courses1.stream().flatMap(course1 ->
                        courses2.stream().map(course2 -> List.of(course1, course2))).
                filter(list -> list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(courses);
    }

    private static void printListWithNotSameValues() {
        List<String> courses1 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> courses = courses1.stream().flatMap(course1 ->
                        courses2.stream().map(course2 -> List.of(course1, course2))).
                filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(courses);
    }

    private static void printListWithSameLengthValues() {
        List<String> courses1 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> courses = courses1.stream().flatMap(course1 ->
                        courses2.stream().filter(course2 -> course2.length()==course1.length()).map(course2 -> List.of(course1, course2))).
                filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(courses);
    }


}
