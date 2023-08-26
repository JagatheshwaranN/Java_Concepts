package java7andbelow.features.multi_threading;

public class _21_InterThreadCommunication_CaseScenarios {

    public static void main(String[] args) throws InterruptedException {

        /*
            Case Scenarios
            ==============
            Case 1: Main Thread got Chance First
            ====================================
            In this case, the Main thread has got the chance to call the wait() method and
            to enter into the waiting state. The Main thread called the wait() on the
            case1Thread (Child Thread). The case1Thread performs the calculation (update)
            operation and called the notify() method. Then Main method has resumed its
            execution.

            Case 2: Main Thread got Chance First but Slept
            ==============================================
            In this case, the Main thread has got the chance to call the wait() method and
            to enter into the waiting state. But the Main thread has gone to sleep. So, before
            the Main thread woke from sleep the case2Thread (Child Thread) has completed its
            operation and called the notify() method. Here, we will have 2 possible cases as
            below,

            case A. If only wait() method called by Main Thread, then Infinite waiting of Main
            thread will happen as no one is there to give notification to continue the execution.

            Case B. If we configure the wait() with time cutoff. If no one is there to give
            notification also, the Main thread will wait for specified time cutoff and execute
            or exit.

            Case3: Producer Consumer Problem
            ================================
            Producer thread is responsible to produce items to the queue and Consumer thread is
            responsible to consume the items from the queue. If queue is empty, then consumer
            thread will call wait() and entered into waiting state. After producing items to the
            queue, the producer thread is responsible to call the notify() method, then waiting
            consumer will get that notification and continue its execution with updated items.

            class ProducerThread {
            produce () {
            synchronized (q) {
            produce items to queue
            q.notify();
            }
            }
            }
            class ConsumerThread {
            consume () {
            synchronized (q) {
            if (q is empty) {
            q.wait();
            }
            else {
            consume items;
            }
            }
            }
            }
        */

        Case1Thread case1Thread = new Case1Thread();
        case1Thread.start();
        synchronized (case1Thread) {
            System.out.println("Main Thread calls wait method");
            case1Thread.wait();
            System.out.println("Main Thread got the notification");
            System.out.println(case1Thread.total);
        }

        Case2Thread case2Thread = new Case2Thread();
        case2Thread.start();
        Thread.sleep(10000);
        synchronized (case2Thread) {
            System.out.println("Main Thread calls wait method");
            // case2Thread.wait();
            case2Thread.wait(10000);
            System.out.println("Main Thread got the notification");
            System.out.println(case2Thread.total);
        }
    }
}
class Case1Thread extends Thread {
    int total = 0;
    public void run() {
        synchronized (this){
            System.out.println("Child Thread starts calculation");

            for(int i = 0; i < 10; i++){
                total = total + i;
            }
            System.out.println("Child Thread gives notification");
            this.notify();
        }
    }
}
class Case2Thread extends Thread {
    int total = 0;
    public void run() {
        synchronized (this){
            System.out.println("Child Thread starts calculation");

            for(int i = 0; i < 10; i++){
                total = total + i;
            }
            System.out.println("Child Thread gives notification");
            this.notify();
        }
    }
}