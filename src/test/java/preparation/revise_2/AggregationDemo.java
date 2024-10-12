package preparation.revise_2;

@SuppressWarnings("All")
public class AggregationDemo {

    public static void main(String[] args) {
        Department department = new Department("Information Technology");
        Student student = new Student("Alice", department);
        student.display();
    }

}

@SuppressWarnings("All")
class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return name;
    }
}

@SuppressWarnings("All")
class Student {

    private String name;
    private Department department;

    public Student(String studentName, Department department) {
        this.name = studentName;
        this.department = department;
    }

    public void display() {
        System.out.println(STR."Student Name : \{name}");
        System.out.println(STR."Department   : \{department.getDepartmentName()}");
    }

}
