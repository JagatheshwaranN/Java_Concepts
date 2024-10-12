package java.features.multi_threading;

public class _17_Synchronization_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: More than one Object
            ============================
            Even though the wish() method is synchronized, we will get the irregular output.
            Because the threads are operating on different java objects (d1 and d2).

            Conclusion:
            ==========
            If multiple threads are operating on the same java object, then synchronization
            is required. If multiple threads are operating on multiple java objects, then
            synchronization is not required.

            Case 2: Static Synchronized
            ===========================
            Every class in Java has a unique lock which is called as Class Level Lock. If a
            thread wants to execute a static synchronized method, then thread require class
            level lock. Once the thread got the class level lock then it's allowed to execute
            any static synchronized method of that class. Once a method execution completes
            then automatically the thread releases the lock.

            Here, the output of the program is going to be regular since the thread is going
            to have the class level lock before executing the static synchronized method.

            Case 3: Combination of Static Synchronized / Synchronized / Static and Normal methods
            =====================================================================================
            While a thread executing the static synchronized method, the remaining threads are
            not allowed to execute any static synchronized methods of that class simultaneously
            but remaining threads are allowed to execute the following methods simultaneously,
            1.	Normal static methods
            2.	Synchronized instance methods
            3.	Normal instance methods

            Case 4: Synchronized Execution from 2 Thread Class
            ==================================================
        */

        SyncDisplay display1 = new SyncDisplay();
        SyncDisplay display2 = new SyncDisplay();

        SyncCase1Demo case1Demo1 = new SyncCase1Demo(display1, "Alex");
        SyncCase1Demo case1Demo2 = new SyncCase1Demo(display2, "John");
        case1Demo1.start();
        case1Demo2.start();

        SyncCase2Demo case2Demo1 = new SyncCase2Demo(display1, "Alex");
        SyncCase2Demo case2Demo2 = new SyncCase2Demo(display2, "John");
        case2Demo1.start();
        case2Demo2.start();

        SyncCase2Demo case2Demo3 = new SyncCase2Demo(display1, "Alex");
        SyncCase3Demo case3Demo1 = new SyncCase3Demo(display2, "John");
        case2Demo3.start();
        case3Demo1.start();

        SyncCase4DemoA case4DemoA = new SyncCase4DemoA(display1);
        SyncCase4DemoB case4DemoB = new SyncCase4DemoB(display2);
        case4DemoA.start();
        case4DemoB.start();
    }
}
class SyncDisplay {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good morning ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(name);
            System.out.println();
        }
    }
    public static synchronized void greet(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good morning ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(name);
            System.out.println();
        }
    }
    public void welcome(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome " + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public synchronized void displayNum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public synchronized void displayChar() {
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
class SyncCase1Demo extends Thread {
    SyncDisplay d;
    String name;
    SyncCase1Demo(SyncDisplay d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}
class SyncCase2Demo extends Thread {
    SyncDisplay d;
    String name;
    SyncCase2Demo(SyncDisplay d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.greet(name);
    }
}
class SyncCase3Demo extends Thread {
    SyncDisplay d;
    String name;
    SyncCase3Demo(SyncDisplay d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.welcome(name);
    }
}
class SyncCase4DemoA extends Thread {
    SyncDisplay d;
    SyncCase4DemoA(SyncDisplay d){
        this.d = d;
    }
    public void run(){
        d.displayNum();
    }
}
class SyncCase4DemoB extends Thread {
    SyncDisplay d;
    SyncCase4DemoB(SyncDisplay d){
        this.d = d;
    }
    public void run(){
        d.displayChar();
    }
}
