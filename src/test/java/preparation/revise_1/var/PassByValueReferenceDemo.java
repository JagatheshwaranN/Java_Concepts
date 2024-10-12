package preparation.revise_1.var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValueReferenceDemo {

    int x = 10;
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2));

    public static void main(String[] args) {

        PassByValueReferenceDemo demo = new PassByValueReferenceDemo();
        System.out.println(demo.x);
        System.out.println(demo.list);
        demo.takeParams(demo.x, demo.list);
        System.out.println(demo.x);
        System.out.println(demo.list);

    }

    public void takeParams(int x, List<Integer> list) {
        x = 20;
        System.out.println("Value of x : " + x);
        list.add(3);
        System.out.println("Value of List : " + list);
    }
}
