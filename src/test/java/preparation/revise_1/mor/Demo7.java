package preparation.revise_1.mor;

import java.io.IOException;

public class Demo7 implements ABC, XYZ {

    public static void main(String[] args) throws IOException {
        Demo7 demo7 = new Demo7();
        demo7.display(5);
        demo7.display("Hello");
    }


    @Override
    public void display(int value) {
        System.out.println(value);
    }

    @Override
    public void display(String value) {
        System.out.println(value);
    }

}

interface ABC {
    void display(int value);
}

interface XYZ {
    void display(String value);
}


