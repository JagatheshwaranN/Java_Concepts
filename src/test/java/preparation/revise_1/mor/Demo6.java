package preparation.revise_1.mor;

import java.io.IOException;

public class Demo6 {

    public static void main(String[] args) throws IOException {
        NonBase nonBase = new NonBase(5, 5);
        nonBase.display();
    }

    static class Base {

        int value;
        String message = "Hi from Base Class";

        Base(int value) {
            this.value = value;
        }

        public void display() {
            System.out.println("Base Class Display");
            System.out.println("Value in Base Class : " + value);
        }
    }

    static class NonBase extends Base {

        int additionalValue;
        String message = "Hi from NonBase Class";

        NonBase(int value, int additionalValue) {
            super(value);
            this.value += additionalValue;
        }

        @Override
        public void display() {
            System.out.println(super.message);
            super.display();
            System.out.println("NonBase Class Display");
            System.out.println(message);
            System.out.println("Value in NonBase Class : " + value);
        }
    }

}
