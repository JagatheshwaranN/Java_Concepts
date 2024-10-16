package preparation.revise_2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorComparableDemo {

    public static void main(String[] args) {
        comparableDemo();
        comparatorDemo();
        comparatorDemo1();
    }

    private static void comparableDemo() {
        Student student1 = new Student(2, "Alex");
        Student student2 = new Student(1, "John");
        Student student3 = new Student(3, "Erick");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }

    }

    private static void comparatorDemo() {
        Employee e1 = new Employee(2, "Alex");
        Employee e2 = new Employee(1, "John");
        Employee e3 = new Employee(3, "Erick");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.sort(new MyComparator());
        for (Employee e : list) {
            System.out.println(e);
        }

    }

    private static void comparatorDemo1() {
        Employee e1 = new Employee(2, "Alex");
        Employee e2 = new Employee(1, "John");
        Employee e3 = new Employee(3, "Erick");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.sort(new MyComparator1());
        for (Employee e : list) {
            System.out.println(e);
        }

    }

    static class Student implements Comparable<Student> {

        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }


        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.rollNo, o.rollNo);
        }

        @Override
        public String toString() {
            return STR."Student{rollNo=\{rollNo}, name='\{name}\{'\''}\{'}'}";
        }
    }

    static class Employee {

        int empNo;
        String name;

        Employee(int rollNo, String name) {
            this.empNo = rollNo;
            this.name = name;
        }

        public int getEmpNo() {
            return empNo;
        }


        public void setEmpNo(int rollNo) {
            this.empNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return STR."Employee{empNo=\{empNo}, name='\{name}\{'\''}\{'}'}";
        }
    }

}

class MyComparator implements Comparator<ComparatorComparableDemo.Employee> {

    @Override
    public int compare(ComparatorComparableDemo.Employee o1, ComparatorComparableDemo.Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MyComparator1 implements Comparator<ComparatorComparableDemo.Employee> {

    @Override
    public int compare(ComparatorComparableDemo.Employee e1, ComparatorComparableDemo.Employee e2) {
        return e1.getEmpNo() - e2.getEmpNo();
    }
}