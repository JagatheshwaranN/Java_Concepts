package java17.feature.context.specific.deserialization.serialize;

import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    double salary;
    transient int ssn;

    public Employee(int id, String name, double salary, int ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

}
