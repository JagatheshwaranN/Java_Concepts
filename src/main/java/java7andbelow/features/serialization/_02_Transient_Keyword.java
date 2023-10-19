package java7andbelow.features.serialization;

import java.io.*;

public class _02_Transient_Keyword {

    public static void main(String[] args) {

        /*
            Transient keyword
            =================
            Transient modifier / keyword is applicable only for variables but not for methods
            and classes.

            At the time of serialization, if we don't want to save the value of the particular
            variable to meet the security constraints, then we should declare that variable as
            transient. While performing serialization, JVM ignores the original value of transient
            variable and save the default value to the file. Hence, transient means not to
            serialize.

            Transient vs Static
            ===================
            Static variable is not part of the object state and hence it won't participate in
            serialization due to this declaring static variable as transient, is of no use.

            Transient vs Final
            ==================
            Final variables will be participated in the serialization directly by the value.
            Hence, declaring a final variable as transient, there is no impact.
        */

        /*
            Order of Objects in Serialization
            =================================
            We can serialize any number of objects to the file. But in which order we serialized,
            the same order only we have to deserialize i.e., order of object is important in the
            serialization.

            Dog d1 = new Dog();
            Cat c1 = new Cat();

            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream (fos);
            oos.writeObject(d1);
            oos.writeObject(c1);

            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d2 = (Dog)ois.readObject();
            Cat c2 = (Cat)ois.readObject();

            If we don't know the order of objects in Serialization. Then we have to follow
            below (SerializeDeserializeDemo) approach.
        */
        SerializeDeserializeDemo.serializationDemo();
    }
}

class Bus implements Serializable {
    int wheels = 6;
}

class Car implements Serializable {
    int wheels = 4;
}

class SerializeDeserializeDemo {

    public static void serializationDemo() {

        Bus bus = new Bus();
        Car car = new Car();
        /*
            Serialization
        */
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serialize1.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(bus);
            outputStream.writeObject(car);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
            Deserialization
        */
        try {
            FileInputStream fileInputStream = new FileInputStream("serialize1.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Object object;
            while ((object = inputStream.readObject()) != null) {
                if (object instanceof Bus b1) {
                    System.out.println(b1.wheels);
                }
                if (object instanceof Car c1) {
                    System.out.println(c1.wheels);
                }
            }
            inputStream.close();
        }
        catch (EOFException e) {
            System.out.println("End of File is reached");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
