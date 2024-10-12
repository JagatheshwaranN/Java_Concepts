package java.features.oops;

public class _27_DifferentWaysOfObjectCreation {

    public static void main(String[] args) {

        /*
            QQ: How many ways is there to create an object in Java / In how many ways
            we can get the object in Java?

            In 5 ways we can create the object in java as below,

            By using new operator
            =====================
            Test t = new Test();

            By using newInstance() method
            =============================
            Test t = (Test)Class.forName("Test").newInstance();

            By using Factory method
            =======================
            Runtime r = Runtime.getRuntime();
            DateFormat df = DateFormat.getInstance();

            By using clone() method
            =======================
            Test t1 = new Test();
            Test t2 = (Test)t1.clone();

            By using Deserialization
            ========================
            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Reader r1 = (Reader)ois.readObject();
        */
    }
}
