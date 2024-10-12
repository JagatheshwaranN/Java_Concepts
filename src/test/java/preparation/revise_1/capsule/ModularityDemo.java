package preparation.revise_1.capsule;

import java.util.ArrayList;
import java.util.List;

public class ModularityDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 50000.00);
        Employee employee2 = new Employee("Alex", 40000.00);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        Department hrDepartment = new Department("HR", employees);
        System.out.println(hrDepartment.getDepartmentName());
        System.out.println(hrDepartment.getEmployee().get(0).getName());
        System.out.println(hrDepartment.getEmployee().get(0).getSalary());
        System.out.println(hrDepartment.getEmployee().get(1).getName());
        System.out.println(hrDepartment.getEmployee().get(1).getSalary());
    }

    static class Employee {
        private String name;
        private double salary;

        Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

    }

    static class Department {

        private final String departmentName;

        private List<Employee> employee;

        public Department(String departmentName, List<Employee> employee) {
            this.departmentName = departmentName;
            this.employee = employee;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public List<Employee> getEmployee() {
            return employee;
        }

        public void setEmployee(List<Employee> employee) {
            this.employee = employee;
        }
    }
}
