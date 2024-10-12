package preparation.revise_1.collection;

import java.util.*;

public class IteratorsDemo {

    public static void main(String[] args) {
        iteratorDemo();
        listIteratorDemo();
        enumeratorDemo();
    }

    public static void iteratorDemo() {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void listIteratorDemo() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        ListIterator<String> listIterator = animals.listIterator();
        while(listIterator.hasNext()){
            String animal = listIterator.next();
            System.out.println(animal);
            if(animal.equals("Cat")){
                listIterator.add("Mouse");
            }
        }
        System.out.println("Animals List after modification : "+ animals);

        while(listIterator.hasPrevious()){
            String animal = listIterator.previous();
            System.out.println(animal);
        }
    }

    public static void enumeratorDemo() {
        Vector<String> colorList = new Vector<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");

        Enumeration<String> enumeration = colorList.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
