package beforeJava8.features.interfaces;

public class _09_AbstractClass_Demo1 {

    public static void main(String[] args) {

        Student student = new Student("John", 25, 172, 78, 101);
        Teacher teacher = new Teacher("Alex", 35, 172, 80, 1001);
        Students students = new Students("John", 25, 172, 78, 101);
        Teachers teachers = new Teachers("Alex", 35, 172, 80, 1001);
    }

}

/**
 * Abstract class without Constructor
 * Approach 1 - More code and Code redundancy
 */
abstract class Person {
    String name;
    int age;
    int height;
    int weight;
}

/**
 * Abstract class with Constructor
 * Approach 2 - Less code and Code re-usability
 */
abstract class Persons {
    String name;
    int age;
    int height;
    int weight;

    Persons(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

/**
 * Approach 1 - Implementation Classes
 */
class Student extends Person {
    int rollno;
    Student(String name, int age, int height, int weight, int rollno){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.rollno = rollno;
    }
}

class Teacher extends Person {
    int teacherId;
    Teacher(String name, int age, int height, int weight, int teacherId){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.teacherId = teacherId;
    }
}

/**
 * Approach 2 - Implementation Classes
 */
class Students extends Persons {
    int rollno;
    Students(String name, int age, int height, int weight, int rollno){
        super(name, age, height, weight);
        this.rollno = rollno;
    }
}

class Teachers extends Persons {
    int teacherId;
    Teachers(String name, int age, int height, int weight, int teacherId){
        super(name, age, height, weight);
        this.teacherId = teacherId;
    }
}

