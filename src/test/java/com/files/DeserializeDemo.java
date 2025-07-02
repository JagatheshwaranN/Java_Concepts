package com.files;

import java8.feature.examples.Employee;

import java.io.*;

public class DeserializeDemo {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/test/java/com/files/folder/user.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object object = ois.readObject();
            User user = (User)object;
            System.out.println(STR."User Id : \{user.id}");
            System.out.println(STR."User Name : \{user.name}");
            System.out.println(STR."User Salary : \{user.salary}");
            System.out.println(STR."User SSN : \{user.ssn}");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
