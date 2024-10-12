package java.features.serialization;

import java.io.*;

public class _06_Externalization {

    public static void main(String[] args) {

        /*
            Externalization
            ===============
            In serialization, everything takes care by JVM and programmer doesn't have any control.
            In serialization, it's always possible to save total object to the file and not possible
            to save the part of the object, which may creates performance problem. To overcome this
            problem, we should go for Externalization.

            The main advantage of Externalization over Serialization, is everything takes care by
            Programmer and JVM doesn't have any control. Based on our requirement, we can save
            either total object or part of the object, which improves the performance of the system.

            To provide the externalized ability for any java object compulsory the corresponding
            class should implement Externalizable Interface. Externalizable Interface defines
            2 methods as below,

            1.	writeExternal()
            2.	readExternal()

            Externalizable is a child interface of Serializable.
            Serializable (I) <- Externalizable (I) Introduced in java 1.1 version.

            public void writeExternal (ObjectOutput out) throws IOException

            This method will be executed automatically at the time of serialization. Within this
            method, we have to write the code to save the required variables to the file.

            public void readExternal (ObjectInput in) throws IOException, ClassNotFoundException

            This method will be executed automatically at the time of deserialization. Within this
            method, we have to write the code to read the required variables from the file and
            assign to the current object.

            But strictly speaking, at the time of deserialization, JVM will create a separate new
            object by executing the public No Argument constructor. On that object, JVM will call
            readExternal() method. Hence, every externalizable implemented class should compulsory
            contain public No Argument constructor otherwise we will get the runtime exception
            saying InvalidClassException.
        */
        ExternalizeDemo.externalizationDemo();

        /*
            Note:
            =====
            In Serialization, transient keyword will play a role but in Externalization transient
            keyword won't play any role. Of course, transient keyword is not required in externalization.
        */

        /*
            Difference btw Serialization and Externalization
            ================================================
            Serialization
            =============
            1. It's meant for default serialization.
            2. Everything takes care by JVM and programmer doesn't have any control.
            3. It's always possible to save the total object to the file and not possible
               to save part of the object.
            4. Relatively performance is low.
            5. It is the best choice, if we want to save total object to the file.
            6. Serializable Interface doesn't contain any methods and its marker interface.
            7. Serializable implemented class not required to contain public no argument
               constructor.
            8. Transient keyword will play role in Serialization.

            Externalization
            ===============
            1. It's meant for customized serialization.
            2. Everything takes care by Programmer and JVM doesn't have any control.
            3. Based on our requirement, we can save either total or part of the object.
            4. Relatively performance is high.
            5. It is the best choice, if we want to save part of the object to the file.
            6. Externalizable interface contains 2 methods writeExternal() and readExternal().
            7. Externalizable implemented class should contain public no argument constructor
               otherwise we will get the InvalidClassException.
            8. Transient keyword won't play any role in Externalization.
        */
    }
}

class ExternalizeDemo implements Externalizable {

    String s;

    int i;

    int j;

    public ExternalizeDemo() {
        System.out.println("No Arg Constructor");
    }

    public ExternalizeDemo(String s, int i, int j){
        this.s = s;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String)in.readObject();
        i = in.readInt();
    }

    public static void externalizationDemo(){

        ExternalizeDemo externalizeDemo = new ExternalizeDemo("java", 10, 20);
        try {
            FileOutputStream  fileOutputStream = new FileOutputStream("external.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(externalizeDemo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ExternalizeDemo externalizeDemo1;
        try{
            FileInputStream fileInputStream = new FileInputStream("external.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            externalizeDemo1 = (ExternalizeDemo)inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(externalizeDemo1.s);
        System.out.println(externalizeDemo1.i);
        System.out.println(externalizeDemo1.j);
    }

}