package preparation.fp_excercises.part2;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HigherOrderFunctions {

    private String courseName;

    private String category;

    private int reviewScore;

    private int numberOfStudents;

    public HigherOrderFunctions(String courseName, String category, int reviewScore, int numberOfStudents) {
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

        List<HigherOrderFunctions> courseList = List.of(
                new HigherOrderFunctions("Spring", "Framework", 98, 1000),
                new HigherOrderFunctions("Spring Boot", "Framework", 95, 1200),
                new HigherOrderFunctions("API", "MicroServices", 93, 700),
                new HigherOrderFunctions("MicroServices", "MicroServices", 97, 800),
                new HigherOrderFunctions("AWS", "Devops", 97, 900),
                new HigherOrderFunctions("Azure", "Devops", 98, 100),
                new HigherOrderFunctions("Docker", "Devops", 99, 200),
                new HigherOrderFunctions("Kubernetes", "Devops", 95, 100));
    }


    private static void higherOrderFunctionDemo() {

        Predicate<HigherOrderFunctions> reviewScorePredicate1 = getHigherOrderFunctionsPredicate(90);
        Predicate<HigherOrderFunctions> reviewScorePredicate2 = getHigherOrderFunctionsPredicate(95);
        
    }

    private static Predicate<HigherOrderFunctions> getHigherOrderFunctionsPredicate(int reviewScoreCutOff) {
        return course -> course.reviewScore > reviewScoreCutOff;
    }

}
