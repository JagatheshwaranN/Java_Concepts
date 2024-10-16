package preparation.revise_2.collections;

import java.util.*;

public class IteratorAndEnumeratorDemo {

    public static void main(String[] args) {
        System.out.println("***** Iterator *****");
        iteratorDemo();
        System.out.println("***** List Iterator *****");
        listIteratorDemo();
        System.out.println("***** Enumerator *****");
        enumeratorDemo();
    }

    private static void iteratorDemo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void listIteratorDemo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    private static void enumeratorDemo() {
        Vector<String> list = new Vector<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        Enumeration<String> enumeration = list.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
