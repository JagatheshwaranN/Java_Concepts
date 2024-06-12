package preparation.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitOperations {

    private final String courseName;

    private final String category;

    private final int reviewScore;

    private final int numberOfStudents;

    public SkipLimitOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<SkipLimitOperations> courseList = List.of(
                new SkipLimitOperations("Spring", "Framework", 98, 1000),
                new SkipLimitOperations("Spring Boot", "Framework", 95, 1200),
                new SkipLimitOperations("API", "MicroServices", 93, 700),
                new SkipLimitOperations("MicroServices", "MicroServices", 95, 800),
                new SkipLimitOperations("AWS", "Devops", 97, 900),
                new SkipLimitOperations("Azure", "Devops", 98, 100),
                new SkipLimitOperations("Docker", "Devops", 95, 200),
                new SkipLimitOperations("Kubernetes", "Devops", 95, 100));

        SkipLimitOperations.skipResults(courseList);
        SkipLimitOperations.limitResults(courseList);
    }

    private static void skipResults(List<SkipLimitOperations> courses) {

        System.out.println("Before Skip");
        System.out.println(courses);
        System.out.println("After Skip");
        System.out.println(courses.stream().skip(2).collect(Collectors.toList()));
    }

    private static void limitResults(List<SkipLimitOperations> courses) {

        System.out.println("Before Limit");
        System.out.println(courses);
        System.out.println("After Limit");
        System.out.println(courses.stream().limit(5).collect(Collectors.toList()));
    }

}
