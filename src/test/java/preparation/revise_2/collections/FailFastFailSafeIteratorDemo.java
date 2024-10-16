package preparation.revise_2.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeIteratorDemo {

    public static void main(String[] args) {
        failSafeIteratorDemo();
        failFastIteratorDemo();
    }

    private static void failFastIteratorDemo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        for(String val : list) {
            if(val.equals("Apple")) {
                list.remove("Apple");
            }
        }
    }

    private static void failSafeIteratorDemo() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        for(String val : list) {
            if(val.equals("Apple")) {
                list.remove("Apple");
            }
        }
        System.out.println(list);
    }
}
