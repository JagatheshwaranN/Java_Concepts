package preparation.revise_1.mor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5 {

    public static void main(String[] args) throws IOException {
        NonBase nonBase = new NonBase();
        nonBase.display();

        Base base1 = new NonBase();
        base1.display();

        Base base2 = new Base();
        base2.display();

        Base base3 = new SubBase1();
        base3.display();

        Base base4 = new SubBase3();
        base4.display();
    }

    static class Base {

        public void display() throws IOException {
            File file = new File("src/main/java/preparation/revise/mor/Demo0.java");
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.readAllBytes();
        }
    }

    static class NonBase extends Base {

        // SubClass of Exception mentioned in SuperClass
        @Override
        public void display() throws FileNotFoundException {
            File file = new File("src/main/java/preparation/revise/mor/Demo0.java");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
    }

    static class SubBase1 extends Base {

        // SameClass Exception mentioned in SuperClass
        @Override
        public void display() throws IOException {
            File file = new File("src/main/java/preparation/revise/mor/Demo0.java");
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.readAllBytes();
        }
    }

    static class SubBase2 extends Base {

        // The below exception is not allowed. As Base Class Exception level is lower than
        // this subclass exception.
        // @Override
//        public void display() throws Exception {
//            File file = new File("src/main/java/preparation/revise/mor/Demo0.java");
//            FileInputStream fileInputStream = new FileInputStream(file);
//            fileInputStream.readAllBytes();
//        }
    }

    static class SubBase3 extends Base {

        // Here, SubClass can throw Runtime Exception even though the SuperClass
        // don't throw exception.
        @Override
        public void display() throws NullPointerException, FileNotFoundException {
            File file = new File("src/main/java/preparation/revise/mor/Demo0.java");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
    }

}
