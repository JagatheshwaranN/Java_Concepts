package preparation.revise_1.mor;

import java.io.IOException;

public class Demo8 {

    public static void main(String[] args) throws IOException {
        NonBase nonBase = new NonBase();
        nonBase.display();
        nonBase.display(5);
        nonBase.show();
    }

    static class Base {
        public void display(){
            System.out.println("Base Display");
        }

        public void show(){
            System.out.println("Base Show");
        }
    }

    static class NonBase extends Base implements BAC{

        @Override
        public void display(){
            System.out.println("NonBase Display");
        }
        @Override
        public void display(int value) {
            System.out.println(value);
        }

        @Override
        public void show(){
            System.out.println("NonBase Show");
        }
    }
}

interface BAC {
    void display(int value);

    void show();
}


