package func_prog.fp_excercises.part2;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {

        makeStreamToUpperCase();
        makeStreamToUpperCaseWithPeek();
        makeParallelStream();
        modifiableListReplaceAllOperation();
        modifiableListRemoveOperation();
    }

    private static void makeStreamToUpperCase() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        var courseName = courses.stream()
                .filter(course -> course.length() > 11)
                .map(String::toUpperCase)
                .findFirst();
        System.out.println(courseName);
    }

    private static void makeStreamToUpperCaseWithPeek() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        var courseName = courses.stream()
                .peek(System.out::println)
                .filter(course -> course.length() > 11)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .findFirst();
        System.out.println(courseName);
    }

    private static void makeParallelStream() {
        List<Integer> numbers = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        int sum = numbers.stream().parallel().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void modifiableListReplaceAllOperation() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        ArrayList<String> modifiableCourses = new ArrayList<>(courses);
        modifiableCourses.replaceAll(String::toUpperCase);
        System.out.println(modifiableCourses);
    }

    private static void modifiableListRemoveOperation() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        ArrayList<String> modifiableCourses = new ArrayList<>(courses);
        modifiableCourses.replaceAll(String::toUpperCase);
        modifiableCourses.removeIf(course -> course.length() < 6);
        System.out.println(modifiableCourses);
    }

}
