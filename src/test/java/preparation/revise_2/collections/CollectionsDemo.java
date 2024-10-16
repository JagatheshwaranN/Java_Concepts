package preparation.revise_2.collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        System.out.println("***** List *****");
        arrayListDemo();
        linkedListDemo();
        System.out.println("***** Set *****");
        hashSetDemo();
        linkedHashSetDemo();
        treeSetDemo();
        System.out.println("***** Map *****");
        hashMapDemo();
        linkedHashMapDemo();
        treeMapDemo();
        System.out.println("***** Queue *****");
        queueDemo();
        dequeueDemo();
        System.out.println("***** HashTable *****");
        hashTableDemo();
    }

    // Insertion Order
    private static void arrayListDemo() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        System.out.println(list);
    }

    // Insertion Order
    private static void linkedListDemo() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        System.out.println(list);
    }

    // Asc Order
    private static void hashSetDemo() {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Grapes");
        set.add("Apple");
        System.out.println(set);
    }

    // Insertion Order
    private static void linkedHashSetDemo() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Grapes");
        set.add("Apple");
        System.out.println(set);
    }

    // Asc Order
    private static void treeSetDemo() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Grapes");
        set.add("Apple");
        System.out.println(set);
    }

    // Random Order
    private static void hashMapDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Orange");
        map.put(2, "Apple");
        map.put(3, "Grapes");
        map.put(null, "Banana");
        System.out.println(map.entrySet());
    }

    // Insertion Order
    private static void linkedHashMapDemo() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "Apple");
        map.put(1, "Orange");
        map.put(3, "Grapes");
        map.put(null, "Banana");
        System.out.println(map.entrySet());
    }

    // Asc Order
    private static void treeMapDemo() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(2, "Apple");
        map.put(1, "Orange");
        map.put(3, "Grapes");
        //map.put(null, "Banana");
        System.out.println(map.entrySet());
    }

    // Asc Order
    private static void queueDemo() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Orange");
        queue.add("Apple");
        queue.add("Grapes");
        queue.add("Apple");
        System.out.println(queue);
    }

    // Insertion Order
    private static void dequeueDemo() {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Orange");
        queue.add("Apple");
        queue.add("Grapes");
        queue.add("Apple");
        System.out.println(queue);
    }

    // Random Order
    private static void hashTableDemo() {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(2, "Apple");
        map.put(1, "Orange");
        map.put(3, "Grapes");
        // map.put(null, "Banana");
        System.out.println(map.entrySet());
    }

}
