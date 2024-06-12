package preparation.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareOperations {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public CompareOperations(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<CompareOperations> courseList = List.of(
                new CompareOperations("Spring", "Framework", 98, 1000),
                new CompareOperations("Spring Boot", "Framework", 95, 1200),
                new CompareOperations("API", "MicroServices", 93, 700),
                new CompareOperations("MicroServices", "MicroServices", 95, 800),
                new CompareOperations("AWS", "Devops", 97, 900),
                new CompareOperations("Azure", "Devops", 98, 100),
                new CompareOperations("Docker", "Devops", 95, 200),
                new CompareOperations("Kubernetes", "Devops", 95, 100));

        CompareOperations.compareAscByStudents(courseList);
        CompareOperations.compareDescByStudents(courseList);
        CompareOperations.compareDescByStudentsAndReviewScore(courseList);
    }

    private static void compareAscByStudents(List<CompareOperations> courses) {

        Comparator<CompareOperations> compareByNoOfStudents = Comparator.comparing(CompareOperations::getNumberOfStudents);
        System.out.println(courses.stream().sorted(compareByNoOfStudents).collect(Collectors.toList()));
    }

    private static void compareDescByStudents(List<CompareOperations> courses) {

        Comparator<CompareOperations> compareByNoOfStudents = Comparator.comparingInt(CompareOperations::getNumberOfStudents).reversed();
        System.out.println(courses.stream().sorted(compareByNoOfStudents).collect(Collectors.toList()));
    }

    private static void compareDescByStudentsAndReviewScore(List<CompareOperations> courses) {

        Comparator<CompareOperations> compareByNoOfStudentsAndReviewScore = Comparator.comparingInt(CompareOperations::getNumberOfStudents).thenComparing(CompareOperations::getReviewScore).reversed();
        System.out.println(courses.stream().sorted(compareByNoOfStudentsAndReviewScore).collect(Collectors.toList()));
    }

}
