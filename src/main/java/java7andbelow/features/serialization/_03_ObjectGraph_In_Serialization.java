package java7andbelow.features.serialization;

import java.io.*;

public class _03_ObjectGraph_In_Serialization {

    public static void main(String[] args) {

        /*
            Object Graph in Serialization
            =============================
            Whenever we are serializing an object, the set of all objects which are reachable
            from that object will be serialized automatically. This group of objects is called
            as Object Graph.

            In Object Graph, every object should be serializable. If at least, one object is not
            serializable then we will get the runtime exception saying NotSerializableException.
        */
        ObjectGraphDemo.objectGraphSerializeDemo();

        /*
            Note
            ====
            In the below program, Gadget, Smart Gadget and SmartPhone classes are Serializable as
            they implement Serializable interface. So, the three classes were serialized and forms
            the Object Graph.

            If we are not making the SmartPhone class as Serializable, then we will get the runtime
            exception saying NotSerializableException.
        */
    }

}

class Gadget implements Serializable {

    SmartGadget smartGadget = new SmartGadget();
}

class SmartGadget implements Serializable {

    SmartPhone smartPhone = new SmartPhone();
}

class SmartPhone implements Serializable {
    String mobileType = "Android";
}

class ObjectGraphDemo {

    public static void objectGraphSerializeDemo(){

        Gadget gadget = new Gadget();

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("gadget.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(gadget);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            FileInputStream fileInputStream = new FileInputStream("gadget.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Gadget gadget1 = (Gadget) objectInputStream.readObject();
            System.out.println(gadget1.smartGadget.smartPhone.mobileType);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
