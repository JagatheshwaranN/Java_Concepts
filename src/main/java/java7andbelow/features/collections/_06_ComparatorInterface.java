package java7andbelow.features.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class _06_ComparatorInterface {

    public static void main(String[] args) {

        /*
            Comparable vs Comparator
            ========================
            1.	For predefined comparable classes (Like String), default natural sorting order
                is already available. If we are not satisfied with that default natural sorting
                order, then we can define our own sorting by using comparator.

            2.	For predefined non-comparable classes (Like StringBuffer), default natural storing
                order is not yet available. We can define our own sorting by using comparator.

            3.	For our own classes like Employee, the person writing the class is responsible to
                define the default natural sorting order by implementing comparable interface.
                The person who is using our class, if he is not satisfied with default natural
                sorting order, then he can define his own sorting using comparator interface.
        */
        EmployeeNaturalSortingDemo.demo();
        EmployeeCustomizedSortingDemo.demo();
    }

}

class Employee implements Comparable<Object> {

    int id;

    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }

    public int compareTo(Object obj) {
        Employee employee = (Employee) obj;
        int id1 = this.id;
        int id2 = employee.id;
        if(id1 < id2) {
            return -1;
        } else if (id1 > id2) {
            return +1;
        } else {
            return 0;
        }
    }

}

class EmployeeNaturalSortingDemo {

    public static void demo() {
        Employee employee1 = new Employee(101, "John");
        Employee employee2 = new Employee(103, "Eric");
        Employee employee3 = new Employee(102, "Alex");
        Employee employee4 = new Employee(104, "Jeni");

        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        System.out.println(treeSet);
    }

}

class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee)o1;
        Employee employee2 = (Employee)o2;
        String s1 = employee1.name;
        String s2 = employee2.name;
        return s1.compareTo(s2);
    }

}

class EmployeeCustomizedSortingDemo {

    public static void demo() {
        Employee employee1 = new Employee(101, "John");
        Employee employee2 = new Employee(103, "Eric");
        Employee employee3 = new Employee(102, "Alex");
        Employee employee4 = new Employee(104, "Jeni");

        TreeSet<Employee> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        System.out.println(treeSet);
    }

}
