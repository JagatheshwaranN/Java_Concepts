package java7andbelow.features.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _02_PriorityQueue {

    public static void main(String[] args) {

        /*
            PriorityQueue
            =============
            1.	If we want to represent the group of individual objects prior to processing according
                to some priority, then we should go for PriorityQueue.
            2.	Priority can be either default natural sorting order or customized sorting order defined
                by comparator.
            3.	Insertion order is not preserved, and it's based on some priority.
            4.	Duplicate objects are not allowed.
            5.	If we are depending on default natural sorting order, compulsory objects should be
                homogenous and comparable otherwise, we will get the runtime exception, saying CCE.
            6.	If we are defining our own sorting by comparator, then objects need not be homogenous and
                comparable.
            7.	Null is not allowed even as the first element as well.

            PriorityQueue Constructors
            ==========================
            PriorityQueue q = new PriorityQueue ();
            Creates an empty PriorityQueue with default initial capacity 11 and all objects will be
            inserted according to default natural sorting order.

            PriorityQueue q = new PriorityQueue (int initialCapacity);
            Creates an empty PriorityQueue with specified initial capacity, and all objects will be
            inserted according to default natural sorting order.

            PriorityQueue q = new PriorityQueue (int initialCapacity, Comparator c);
            Creates an empty PriorityQueue with specified initial capacity, and all objects will be
            inserted according to customized sorting order.

            PriorityQueue q = new PriorityQueue (SortedSet s);
            Creates an equivalent PriorityQueue for the given Sortedset.

            PriorityQueue q = new PriorityQueue (Collection c);
            Creates an equivalent PriorityQueue for the given Collection.

            PriorityQueue Specific Methods
            ==============================
            boolean offer(Object o)
            To add an object into the queue.

            Object peek()
            To return the head element of the queue. If queue is empty, then this method
            returns null.

            Object element()
            To return the head element of the queue. If the queue is empty, then this method
            raises NoSuchElementException.

            Object poll()
            To remove and return the head element of the queue. If queue is empty, then
            this method returns null.

            Object remove()
            To remove and return the head element of the queue. If the queue is empty, then
            this method raises NoSuchElementException.
        */
        PriorityQueueDemo.demo();
        PriorityQueueDemo1.demo();
        /*
            Note:
            =====
            Some platforms won't provide proper support for PriorityQueue.
            Hence, the output of the below program is [Z, B, L, A]
        */
        PriorityQueueDemo2.demo();
    }

}

class PriorityQueueDemo {

    public static void demo() {
        PriorityQueue<Object> priorityQueue = new PriorityQueue<>();
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        // System.out.println(priorityQueue.element());
        // System.out.println(priorityQueue.remove());

        for( int i = 1; i <= 10; i++){
            priorityQueue.offer(i);
        }
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }

}

class PriorityQueueDemo1 {

    public static void demo() {
        PriorityQueue<Object> priorityQueue = new PriorityQueue<>(15);
        priorityQueue.offer("A");
        priorityQueue.offer("Z");
        priorityQueue.offer("L");
        priorityQueue.offer("B");
        System.out.println(priorityQueue);
    }

}
class PriorityQueueDemo2 {

    public static void demo() {
        PriorityQueue<Object> priorityQueue = new PriorityQueue<>(15, new MyComparator());
        priorityQueue.offer("A");
        priorityQueue.offer("Z");
        priorityQueue.offer("L");
        priorityQueue.offer("B");
        System.out.println(priorityQueue);
    }

}

class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}
