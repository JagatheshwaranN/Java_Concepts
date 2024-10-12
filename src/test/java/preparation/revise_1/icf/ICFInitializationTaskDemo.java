package preparation.revise_1.icf;

public class ICFInitializationTaskDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Alex", 29, 60000.00);
        Employee employee3 = new Employee("Erick", 27);
        System.out.println("Employee 1: " + employee1.getName() + ", Age: " + employee1.getAge() + ", Salary: $" + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getName() + ", Age: " + employee2.getAge() + ", Salary: $" + employee2.getSalary());
        System.out.println("Employee 3: " + employee3.getName() + ", Age: " + employee3.getAge() + ", Salary: $" + employee3.getSalary());
    }
    public static class Employee {

        private String name;
        private int age;
        private double salary;

        {
            name = "John Doe";
            age = 25;
            salary = 50000.00;
        }

        Employee() {

        }

        Employee(String name, int age){
            this.name = name;
            this.age = age;
        }

        Employee(String name, int age, double salary){
            this(name, age);
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

    }
}
