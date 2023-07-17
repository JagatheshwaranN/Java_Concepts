package java7andbelow.features.oops;

import java.util.ArrayList;
import java.util.List;

public class _05_Has_A_Relationship {

    public static void main(String[] args) {

        /*
            Has-A Relationship
            ==================
            1.	Has A Relationship is also known as Composition or Aggregation.
            2.	There is no specific keyword to implement the Has A relationship. But very often,
                we are depend on the new keyword.
            3.	The main advantage of the Has A relationship is re-usability of the code.

            HAS-A Relationship is achieved in 2 two ways as below.
            1. Composition
            2. Aggregation

            Composition
            ===========
            Without the existence of the container object, if there is no chance of existence of contained objects,
            then container and contained objects are strongly associated and this strong association is
            called as Composition.

            Example, University consists of several departments, without existence of the university, there
                     is no chance of existence of the departments. Hence, the university and departments are
                     strongly associated is known as Composition.

            Aggregation
            ===========
            Without the existence of the container object, if there is chance of existence of the contained objects,
            then container and contained objects are weekly associated and the week association is called as
            Aggregation.

            Example, Department consists of several professors, without the existence of the department there
                     may be chance of existence of the professors. Hence, the Department and Professor objects
                     are weekly associated is known as Aggregation.

            Note
            ====
            1.	In composition, the objects are strongly associated whereas in aggregation the objects weekly
                associated.
            2.	In composition, the container object holds the contained objects directly whereas in aggregation
                the container object holds just the references of the contained objects.

            Is - A vs Has - A
            =================
            1.	If we want the total functionality of the class automatically then we should go for
                Is A relationship.
            2.	If we want the part of the functionality of the class then we should go for the Has
                A relationship.
        */


        College college1 = new College("ABC College", "USA");
        List<College> colleges = new ArrayList<College>();
        colleges.add(college1);
        University university = new University(colleges);
        List<College> collegesList = university.getCollegeList();
        for(College college : collegesList){
            System.out.println("Name    : "+college.name);
            System.out.println("Address : "+college.address);
        }

        Address address1 = new Address("Bangalore", "Karnataka", "India");
        Employee employee1 = new Employee(101, "Raja", address1);
        employee1.display();

    }
}

/*
    Composition Example
*/
class College {
    public String name;
    public String address;
    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}

class University {
    private final List<College> collegeList;
    University(List<College> collegeList){
        this.collegeList = collegeList;
    }
    public List<College> getCollegeList(){
        return collegeList;
    }
}

/*
    Aggregation
*/
class Address{
    String city, state, country;
    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int empId;
    String empName;
    Address empAddress;

    public Employee(int empId, String empName, Address empAddress){
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public void display(){
        System.out.println("Employee Id      : "+empId);
        System.out.println("Employee Name    : "+empName);
        System.out.println("Employee Address : "+empAddress.city+", "+empAddress.state+", "+empAddress.country);
    }
}