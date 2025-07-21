package java17.feature.context.specific.deserialization.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        try {
            fileOutputStream = new FileOutputStream("src/main/java/java17/feature/context/specific/deserialization/serialize/employee.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Employee employee = new Employee(1, "john", 120000.00, 12345);
            objectOutputStream.writeObject(employee);
            System.out.println("Employee Object Serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
