package preparation.revise_1.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeIteratorDemo {

    public static void main(String[] args) {
        failSafeIterator();
        System.out.println("*************");
        failFastIterator();

    }

    public static void failFastIterator() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");

        for (String fruit : list) {
            System.out.println(fruit);
            if (fruit.equals("orange")) {
                list.remove("orange");
            }
        }
    }

    public static void failSafeIterator() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");

        for (String fruit : list) {
            System.out.println(fruit);
            if (fruit.equals("orange")) {
                list.remove("orange");
            }
        }
        System.out.println("Modified List : " + list);
    }

}
