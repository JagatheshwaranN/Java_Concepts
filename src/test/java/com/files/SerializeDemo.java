package com.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/files/folder/user.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            User user = new User(123, "John", 50000.00, 98765342);
            oos.writeObject(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
