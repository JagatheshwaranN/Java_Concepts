package beforeJava8.features.multi_threading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class _28_ReentrantLock_CaseScenarios {
    public static void main(String[] args) {

        /*
            Case Scenarios
            ==============
            Case 1: ReentrantLock
            =====================
            If we comment lines rel.lock() and rel.unlock(), then the  threads will execute
            simultaneously, and we will get the irregular output. If we not comment the
            lines rel.lock() and rel.unlock(), then the threads will execute one by one,
            and we will get the regular output.

            Case 2: ReentrantLock TryLock
            =============================
            In this case, the trylock is used to try for the lock and if the thread gets the
            lock, it will perform the operation. If the thread couldn't get the lock, then the
            thread will perform alternate operations without waiting for the lock.

            Case 3: ReentrantLock TryLock TimePeriod
            ========================================
            In this case, the trylock with time period allows the thread to try for the lock
            and if the thread gets the lock, it will perform the operation for the specified
            amount of time and then the thread will release the lock. So, the waiting thread
            which couldn't get the lock, can get the lock and then perform the operations and
            release the lock.
        */

        Case1Demo case1Demo = new Case1Demo();
        Case1ThreadDemo demo1 = new Case1ThreadDemo(case1Demo, "Alex");
        Case1ThreadDemo demo2 = new Case1ThreadDemo(case1Demo, "John");
        demo1.start();
        demo2.start();

        Case2ThreadDemo demo3 = new Case2ThreadDemo("Alex");
        Case2ThreadDemo demo4 = new Case2ThreadDemo("John");
        demo3.start();
        demo4.start();

        Case3ThreadDemo demo5 = new Case3ThreadDemo("John");
        Case3ThreadDemo demo6 = new Case3ThreadDemo("Alex");
        demo5.start();
        demo6.start();
    }
}

class Case1Demo {
    ReentrantLock rel = new ReentrantLock();
    public void wish(String name){
        for(int i = 0; i < 5; i++){
            rel.lock();
            System.out.println("Good morning "+name);
            try{
                Thread.sleep(2000);
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        rel.unlock();
    }
}
class Case1ThreadDemo extends Thread {
    Case1Demo c1d;
    String name;
    Case1ThreadDemo(Case1Demo c1d, String name){
        this.c1d = c1d;
        this.name = name;
    }
    public void run() {
        c1d.wish(name);
    }
}
class Case2ThreadDemo  extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();
    Case2ThreadDemo(String name) {
        super(name);
    }
    public void run() {
        if (reentrantLock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " got lock and performing operation");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            reentrantLock.unlock();
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't got lock and performing alternate operation");
        }
    }
}
class Case3ThreadDemo  extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock();
    Case3ThreadDemo(String name) {
        super(name);
    }
    public void run() {
        do {
            try {
                if (reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " has got lock and performing operation");
                    Thread.sleep(10000);
                    reentrantLock.unlock();
                    System.out.println(Thread.currentThread().getName() + " releases lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " couldn't get lock and performing alternate operation");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (true);
    }
}
