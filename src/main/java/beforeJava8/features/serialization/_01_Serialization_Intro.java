package beforeJava8.features.serialization;

import java.io.*;

public class _01_Serialization_Intro {

    public static void main(String[] args) {

        /*
            Serialization
            =============
            The process of writing the state of an object to a file is called as Serialization.
            But, strictly speaking, it is the process of converting object from Java supported
            form into either File supported form / Network supported form.

            By using FileOutputStream and ObjectOutputStream classes we can implement Serialization.
            The ObjectOutputStream uses FileOutputStream to send the object into the file.

            Deserialization
            ===============
            The process of reading the state of an object from the file is called as Deserialization.
            But, strictly speaking, it is the process of converting an object from either File
            supported form or Network supported form into the Java supported form.

            By using FileInputStream and ObjectInputStream classes we can implement Deserialization.
            The ObjectInputStream uses FileInputStream to read the object from file.
        */
        SerializationDemo.serializationDemo();

        /*
            Note
            ====
            1. We can serialize only serializable objects. An object is said to be serializable,
               if and only if, the corresponding class implements serializable interface.
               Serializable interface present in java.io package, and it doesn't contain any
               methods. It is a Marker Interface.

            2. If we are trying to serialize non-serializable object, then we will get the runtime
               exception NotSerializableException.
        */
    }

}

class Employee implements Serializable {

    int empId;

    String empName;
}

class SerializationDemo{

    public static void serializationDemo(){

        Employee employee = new Employee();
        /*
            Serialization
        */
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serialize.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
            Deserialization
        */
        try {
            FileInputStream fileInputStream = new FileInputStream("serialize.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Employee employee1 = (Employee) inputStream.readObject();
            System.out.println(employee1.empId);
            System.out.println(employee1.empName);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
