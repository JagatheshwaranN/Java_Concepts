package java7andbelow.features.multi_threading;

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
            automatically the thread releases the lock.

            Here, the output of the program is going to be regular since the thread is going
            to have the class level lock before executing the static synchronized method.
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
    }
}
class SyncDisplay {
    public synchronized void wish(String name) {
        for(int i = 0; i < 5; i++){
            System.out.print("Good morning ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.print(name);
            System.out.println();
        }
    }

    public static synchronized void greet(String name) {
        for(int i = 0; i < 5; i++){
            System.out.print("Good morning ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.print(name);
            System.out.println();
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
