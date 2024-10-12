package func_prog.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsGroupByOperations {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public CollectorsGroupByOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
        this.courseName = courseName;
        this.category = category;
        this.reviewScore = reviewScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCategory() {
        return category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course[" +
                "courseName='" + courseName + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore='" + reviewScore + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ']';
    }

    public static void main(String[] args) {

        List<CollectorsGroupByOperations> courseList = List.of(
                new CollectorsGroupByOperations("Spring", "Framework", 98, 1000),
                new CollectorsGroupByOperations("Spring Boot", "Framework", 95, 1200),
                new CollectorsGroupByOperations("API", "MicroServices", 93, 700),
                new CollectorsGroupByOperations("MicroServices", "MicroServices", 97, 800),
                new CollectorsGroupByOperations("AWS", "Devops", 97, 900),
                new CollectorsGroupByOperations("Azure", "Devops", 98, 100),
                new CollectorsGroupByOperations("Docker", "Devops", 99, 200),
                new CollectorsGroupByOperations("Kubernetes", "Devops", 95, 100));


        groupCoursesByCategory(courseList);
        getCoursesCountByCategory(courseList);
        getCoursesWithMaxScoreByCategory(courseList);
        getCourseNamesByCategory(courseList);
    }

    private static void groupCoursesByCategory(List<CollectorsGroupByOperations> courses) {
        System.out.println(courses.stream().collect(Collectors.groupingBy(CollectorsGroupByOperations::getCategory)));
    }

    private static void getCoursesCountByCategory(List<CollectorsGroupByOperations> courses) {
        System.out.println(courses.stream().collect(Collectors.groupingBy(CollectorsGroupByOperations::getCategory, Collectors.counting())));
    }

    private static void getCoursesWithMaxScoreByCategory(List<CollectorsGroupByOperations> courses) {
        System.out.println(courses.stream().collect(Collectors.groupingBy(CollectorsGroupByOperations::getCategory, Collectors.maxBy(Comparator.comparing(CollectorsGroupByOperations::getReviewScore)))));
    }

    private static void getCourseNamesByCategory(List<CollectorsGroupByOperations> courses) {
        System.out.println(
                courses.stream().
                        collect(Collectors.groupingBy(CollectorsGroupByOperations::getCategory,
                                        Collectors.mapping(CollectorsGroupByOperations::getCourseName,
                                                Collectors.toList()))));
    }

}
