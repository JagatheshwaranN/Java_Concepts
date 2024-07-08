package beforeJava8.features.collections.queue;

public class _01_Queue_Intro {

    public static void main(String[] args) {

        /*
            Queue (Interface)
            =================
            It is the child interface of Collection. If we want to represent a group of individual
            objects prior to processing, then we should go for queue. Usually, queue follows FIFO
            order, but based on requirement, we can implement our own priority as well.

            For Example, before sending an email, we have to store all email-ids in some Data
            Structures. In which order we added email-ids the same order only mails should
            be delivered, for this requirement, queue is the best choice.

            Usually, Queue follows FIFO order, but based on our requirement, we can implement our own
            priority order as well (PriorityQueue). From Java 1.5 v onwards, LinkedList class also
            implements Queue Interface. LinkedList based implementation of Queue always follows FIFO
            order.

            Queue (I) 1.5 v
            PriorityQueue (I) 1.5 v
            BlockingQueue (I) 1.5 v

            The classes which implement BlockingQueue interface are as below.

            1. PriorityBlockingQueue (C) 1.5 v
            2. LinkedBlockingQueue (C) 1.5 v
        */

        /*
            Queue Specific Methods
            ======================
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
    }

}
