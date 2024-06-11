package preparation.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Course {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public Course(String courseName, String category, int reviewScore, int numberOfStudents) {
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

            List<Course> courseList = List.of(
        new Course("Spring", "Framework", 98, 1000),
        new Course("Spring Boot", "Framework", 95, 1200),
        new Course("API", "MicroServices", 93, 700),
        new Course("MicroServices", "MicroServices", 95, 800),
        new Course("AWS", "Devops", 97, 900),
        new Course("Azure", "Devops", 98, 100),
        new Course("Docker", "Devops", 95, 200),
        new Course("Kubernetes", "Devops", 95, 100));

        Course.verifyAllMatch(courseList);
        Course.verifyNoneMatch(courseList);
        Course.verifyAnyMatch(courseList);
        Course.compareAscByStudents(courseList);
        Course.compareDescByStudents(courseList);
        Course.compareDescByStudentsAndReviewScore(courseList);
    }

    private static void verifyAllMatch(List<Course> courses) {

        Predicate<Course> reviewScorePredicate = course -> course.reviewScore > 90;
        System.out.println(courses.stream().allMatch(reviewScorePredicate));
    }

    private static void verifyNoneMatch(List<Course> courses) {

        Predicate<Course> reviewScorePredicate = course -> course.reviewScore < 90;
        System.out.println(courses.stream().noneMatch(reviewScorePredicate));
    }

    private static void verifyAnyMatch(List<Course> courses) {

        Predicate<Course> reviewScorePredicate = course -> course.reviewScore < 90;
        System.out.println(courses.stream().anyMatch(reviewScorePredicate));
    }

    private static void compareAscByStudents(List<Course> courses) {

        Comparator<Course> compareByNoOfStudents = Comparator.comparing(Course::getNumberOfStudents);
        System.out.println(courses.stream().sorted(compareByNoOfStudents).collect(Collectors.toList()));
    }

    private static void compareDescByStudents(List<Course> courses) {

        Comparator<Course> compareByNoOfStudents = Comparator.comparingInt(Course::getNumberOfStudents).reversed();
        System.out.println(courses.stream().sorted(compareByNoOfStudents).collect(Collectors.toList()));
    }

    private static void compareDescByStudentsAndReviewScore(List<Course> courses) {

        Comparator<Course> compareByNoOfStudentsAndReviewScore = Comparator.comparingInt(Course::getNumberOfStudents).thenComparing(Course::getReviewScore).reversed();
        System.out.println(courses.stream().sorted(compareByNoOfStudentsAndReviewScore).collect(Collectors.toList()));
    }




}
