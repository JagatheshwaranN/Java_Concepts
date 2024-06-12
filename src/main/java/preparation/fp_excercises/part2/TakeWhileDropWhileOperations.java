package preparation.fp_excercises.part2;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhileOperations {

    private final String courseName;

    private final String category;

    private final int reviewScore;

    private final int numberOfStudents;

    public TakeWhileDropWhileOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<TakeWhileDropWhileOperations> courseList = List.of(
                new TakeWhileDropWhileOperations("Spring", "Framework", 98, 1000),
                new TakeWhileDropWhileOperations("Spring Boot", "Framework", 95, 1200),
                new TakeWhileDropWhileOperations("API", "MicroServices", 93, 700),
                new TakeWhileDropWhileOperations("MicroServices", "MicroServices", 95, 800),
                new TakeWhileDropWhileOperations("AWS", "Devops", 97, 900),
                new TakeWhileDropWhileOperations("Azure", "Devops", 98, 100),
                new TakeWhileDropWhileOperations("Docker", "Devops", 95, 200),
                new TakeWhileDropWhileOperations("Kubernetes", "Devops", 95, 100));

        TakeWhileDropWhileOperations.takeWhileResults(courseList);
        TakeWhileDropWhileOperations.dropWhileResults(courseList);
    }

    private static void takeWhileResults(List<TakeWhileDropWhileOperations> courses) {

        System.out.println("Before TakeWhile");
        System.out.println(courses);
        System.out.println("After TakeWhile");
        System.out.println(courses.stream().takeWhile(course -> course.reviewScore > 95).collect(Collectors.toList()));
    }

    private static void dropWhileResults(List<TakeWhileDropWhileOperations> courses) {

        System.out.println("Before DropWhile");
        System.out.println(courses);
        System.out.println("After DropWhile");
        System.out.println(courses.stream().dropWhile(course -> course.reviewScore > 95).collect(Collectors.toList()));
    }

}
