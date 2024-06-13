package preparation.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumAvgCountMaxMinOperations {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public SumAvgCountMaxMinOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<SumAvgCountMaxMinOperations> courseList = List.of(
                new SumAvgCountMaxMinOperations("Spring", "Framework", 98, 1000),
                new SumAvgCountMaxMinOperations("Spring Boot", "Framework", 95, 1200),
                new SumAvgCountMaxMinOperations("API", "MicroServices", 93, 700),
                new SumAvgCountMaxMinOperations("MicroServices", "MicroServices", 97, 800),
                new SumAvgCountMaxMinOperations("AWS", "Devops", 97, 900),
                new SumAvgCountMaxMinOperations("Azure", "Devops", 98, 100),
                new SumAvgCountMaxMinOperations("Docker", "Devops", 99, 200),
                new SumAvgCountMaxMinOperations("Kubernetes", "Devops", 95, 100));

        findSumOfStudents(courseList);
        findCountOfCourses(courseList);
        findAverageOfStudents(courseList);
        findMaxOfStudents(courseList);
        findMinOfStudents(courseList);
    }

    private static void findSumOfStudents(List<SumAvgCountMaxMinOperations> courses) {

        System.out.println(courses.stream().filter(course -> course.reviewScore > 95).mapToInt(SumAvgCountMaxMinOperations::getNumberOfStudents).sum());
    }

    private static void findCountOfCourses(List<SumAvgCountMaxMinOperations> courses) {

        System.out.println(courses.stream().filter(course -> course.reviewScore > 95).mapToInt(SumAvgCountMaxMinOperations::getNumberOfStudents).count());
    }

    private static void findAverageOfStudents(List<SumAvgCountMaxMinOperations> courses) {

        System.out.println(courses.stream().filter(course -> course.reviewScore > 95).mapToInt(SumAvgCountMaxMinOperations::getNumberOfStudents).average());
    }

    private static void findMaxOfStudents(List<SumAvgCountMaxMinOperations> courses) {

        System.out.println(courses.stream().filter(course -> course.reviewScore > 95).mapToInt(SumAvgCountMaxMinOperations::getNumberOfStudents).max());
    }

    private static void findMinOfStudents(List<SumAvgCountMaxMinOperations> courses) {

        System.out.println(courses.stream().filter(course -> course.reviewScore > 95).mapToInt(SumAvgCountMaxMinOperations::getNumberOfStudents).min());
    }

}
