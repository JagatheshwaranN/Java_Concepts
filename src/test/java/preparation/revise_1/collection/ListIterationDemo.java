package preparation.revise_1.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterationDemo {

    public static void main(String[] args) {
        iterateListByForEach();
        System.out.println("*****************************");
        iterateListByIterator();
        System.out.println("*****************************");
        iterateListByListIterator();
        System.out.println("*****************************");
        iterateListByStream();
    }

    public static void iterateListByForEach() {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");

        for(String fruit : list){
            System.out.println(fruit);
        }
    }

    public static void iterateListByIterator() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void iterateListByListIterator() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    public static void iterateListByStream() {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        list.add("grapes");

        list.stream().forEach(System.out::println);
    }

}


