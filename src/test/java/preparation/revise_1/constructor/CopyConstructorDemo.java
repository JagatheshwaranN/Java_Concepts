package preparation.revise_1.constructor;

public class CopyConstructorDemo {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John", 15);
        Student student3 = new Student(student2);
        System.out.println("Student Name : " + student1.getName() + ", " + "Student Age : " + student1.getAge());
        System.out.println("Student Name : " + student2.getName() + ", " + "Student Age : " + student2.getAge());
        System.out.println("Student Name : " + student3.getName() + ", " + "Student Age : " + student3.getAge());
    }

    public static class Student {

        String name;

        int age;

        public Student() {

        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(Student s) {
            this.name = s.name;
            this.age = s.age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}