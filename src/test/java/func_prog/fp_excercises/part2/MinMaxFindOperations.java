package func_prog.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMaxFindOperations {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public MinMaxFindOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<MinMaxFindOperations> courseList = List.of(
                new MinMaxFindOperations("Spring", "Framework", 98, 1000),
                new MinMaxFindOperations("Spring Boot", "Framework", 95, 1200),
                new MinMaxFindOperations("API", "MicroServices", 93, 700),
                new MinMaxFindOperations("MicroServices", "MicroServices", 95, 800),
                new MinMaxFindOperations("AWS", "Devops", 97, 900),
                new MinMaxFindOperations("Azure", "Devops", 98, 100),
                new MinMaxFindOperations("Docker", "Devops", 95, 200),
                new MinMaxFindOperations("Kubernetes", "Devops", 95, 100));

                findMinCourseBasedOnCondition(courseList);
                findMaxCourseBasedOnCondition(courseList);
                findFirstCourseBasedOnCondition(courseList);
                findAnyCourseBasedOnCondition(courseList);
                orElseOption(courseList);
    }

    private static void findMaxCourseBasedOnCondition(List<MinMaxFindOperations> courses) {

        Comparator<MinMaxFindOperations> compareByNoOfStudents = Comparator.comparing(MinMaxFindOperations::getNumberOfStudents);
        System.out.println(courses.stream().max(compareByNoOfStudents));
    }

    private static void findMinCourseBasedOnCondition(List<MinMaxFindOperations> courses) {

        Comparator<MinMaxFindOperations> compareByNoOfStudents = Comparator.comparingInt(MinMaxFindOperations::getNumberOfStudents);
        System.out.println(courses.stream().min(compareByNoOfStudents));
    }

    private static void findFirstCourseBasedOnCondition(List<MinMaxFindOperations> courses) {

        Predicate<MinMaxFindOperations> reviewScorePredicate = course -> course.getReviewScore() < 90;
        System.out.println(courses.stream().filter(reviewScorePredicate).findFirst());
    }

    private static void findAnyCourseBasedOnCondition(List<MinMaxFindOperations> courses) {

        Predicate<MinMaxFindOperations> reviewScorePredicate = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().filter(reviewScorePredicate).findAny());
    }

    private static void orElseOption(List<MinMaxFindOperations> courses) {

        Predicate<MinMaxFindOperations> reviewScorePredicate = course -> course.getReviewScore() < 90;
        System.out.println(courses.stream().filter(reviewScorePredicate).findFirst().orElse(new MinMaxFindOperations("Java", "Programming", 99, 1200)));
    }
}
