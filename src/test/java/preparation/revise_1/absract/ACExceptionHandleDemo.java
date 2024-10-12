package preparation.revise_1.absract;

import java.io.IOException;

public class ACExceptionHandleDemo {

    public static void main(String[] args) throws IOException {
        SubClass subClass = new SubClass();
        subClass.readData();
    }

    public static abstract class SuperClass {

        abstract void readData() throws IOException;
    }

    public static class SubClass extends SuperClass {
        @Override
        void readData() throws IOException {
            System.out.println("Read Data Method In SubClass");
        }
    }
}
