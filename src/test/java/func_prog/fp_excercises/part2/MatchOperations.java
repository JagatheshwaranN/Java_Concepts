package func_prog.fp_excercises.part2;

import java.util.List;
import java.util.function.Predicate;

public class MatchOperations {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public MatchOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore='" + reviewScore + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public static void main(String[] args) {

            List<MatchOperations> courseList = List.of(
        new MatchOperations("Spring", "Framework", 98, 1000),
        new MatchOperations("Spring Boot", "Framework", 95, 1200),
        new MatchOperations("API", "MicroServices", 93, 700),
        new MatchOperations("MicroServices", "MicroServices", 95, 800),
        new MatchOperations("AWS", "Devops", 97, 900),
        new MatchOperations("Azure", "Devops", 98, 100),
        new MatchOperations("Docker", "Devops", 95, 200),
        new MatchOperations("Kubernetes", "Devops", 95, 100));

     //   MatchOperations.verifyAllMatch(courseList);
        MatchOperations.verifyNoneMatch(courseList);
       // MatchOperations.verifyAnyMatch(courseList);
        
    }

    private static void verifyAllMatch(List<MatchOperations> courses) {

        Predicate<MatchOperations> reviewScorePredicate = course -> course.reviewScore > 90;
        System.out.println(courses.stream().allMatch(reviewScorePredicate));
    }

    private static void verifyNoneMatch(List<MatchOperations> courses) {

        Predicate<MatchOperations> reviewScorePredicate = course -> course.reviewScore < 90;
        System.out.println(courses.stream().noneMatch(reviewScorePredicate));
    }

    private static void verifyAnyMatch(List<MatchOperations> courses) {

        Predicate<MatchOperations> reviewScorePredicate = course -> course.reviewScore < 90;
        System.out.println(courses.stream().anyMatch(reviewScorePredicate));
    }


}
