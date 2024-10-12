package java.features.serialization;

import java.io.*;

public class _04_Customized_Serialization {

    public static void main(String[] args) {

        /*
            Need for Customized Serialization
            =================================
            During default serialization, there may be a chance of loss of information because
            of transient keyword.
        */
        WithoutCustomSerialize.withoutCustomSerializeDemo();
        /*
            In the below WithoutCustomSerialize example, before serialization account object
            can provide the proper username and password. But after deserialization account
            object can provide only username but not password. This is due to declaring the
            password variable as transient. Hence, during default serialization, there may be
            a chance of loss of information because of transient keyword. To recover this loss
            of information, we should go for customized serialization.
        */

        /*
            Customized Serialization
            ========================
            We can implement customized serializations by using the following two methods.

            private void writeObject (ObjectOutputStream oos) throws Exception

            This method will be executed automatically at the time of serialization. Hence,
            at the time of serialization, if we want to perform any activity, we have to
            define that in this method only.

            private void readObject (ObjectInputStream ois) throws Exception

            This method will be executed automatically at the time of deserialization. Hence,
            at the time of deserialization, if we want to perform any activity, we have to
            define that in this method only.

            Note:
            =====
            The above methods are call back methods. Because, these are executed automatically
            by the JVM.

            While performing the object serialization, we have to do extra work in the corresponding
            class. So, we have to define the above methods. For example, while performing account
            object serialization, if we required to do any extra work in the account class, we have
            to define the above methods.
        */
        CustomSerialize.customSerializeDemo();
        /*
            In the above program, before serialization and after serialization, account object
            can provide proper username and password.

            Note:
            =====
            Programmer can't call private methods directly from outside the class but JVM can call
            private methods directly from outside the class.
        */
    }
}

class Account implements Serializable {

    String username = "Alex";

    transient String password = "pass@123";
}

class WithoutCustomSerialize {

    public static void withoutCustomSerializeDemo(){

        Account account = new Account();
        System.out.println("Account Username : " + account.username);
        System.out.println("Account Password : " + account.password);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(account);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Account account1 = (Account)objectInputStream.readObject();
            System.out.println("Account Username : " + account1.username);
            System.out.println("Account Password : " + account1.password);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}

class Account1 implements Serializable {

    String username = "Alex";

    transient String password = "pass@123";

    transient int pin = 987;

    @Serial
    private void writeObject(ObjectOutputStream outputStream) throws Exception {
        outputStream.defaultWriteObject();
        String encryptPassword = "asdf"+password;
        outputStream.writeObject(encryptPassword);
        int encryptPin = 1212+pin;
        outputStream.writeInt(encryptPin);
    }

    @Serial
    private void readObject(ObjectInputStream inputStream) throws Exception {
        inputStream.defaultReadObject();
        String encryptPassword = (String) inputStream.readObject();
        password = encryptPassword.substring(4);
        int encryptPin = inputStream.readInt();
        pin = encryptPin - 1212;
    }
}

class CustomSerialize {

    public static void customSerializeDemo(){

        Account1 account = new Account1();
        System.out.println("Account Username : " + account.username);
        System.out.println("Account Password : " + account.password);
        System.out.println("Account Pin : " + account.pin);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(account);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Account1 account1;
        try{
            FileInputStream fileInputStream = new FileInputStream("account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            account1 = (Account1)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Account Username : " + account1.username);
        System.out.println("Account Password : " + account1.password);
        System.out.println("Account Pin : " + account1.pin);

    }

}
