package com.files;

import java.io.Serializable;

public class User implements Serializable {

    int id;
    String name;
    double salary;
    transient int ssn;

    public User(int id, String name, double salary, int ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

}
