package java7andbelow.features.multi_threading;

public class _19_Synchronized_Block_CaseScenarios {
    public static void main(String[] args) {

        /*
            Case Scenarios
            ==============
            Case 1: More than one object
            ============================
            When two individual objects are created and tried to access the synchronized
            block which has the current object's lock, then the execution order will be
            undetermined. Hence, we will not predict the exact order of execution and the
            output.

            Case 2: Class level lock
            ========================
            When two individual objects are created and tried to access the synchronized
            block which has the class level lock, then the execution order will be
            determined that the thread which acquires the class level lock first will
            complete its execution and then followed by the other thread. Hence, the
            execution's output will be regular.

            Case 3: Primitive type not allowed
            ==================================
            Lock concept is applicable for object types and class types but not for primitives.
            Hence, we can't pass the primitive type as argument to the synchronized block.
            Otherwise, we will get the compile time error.

            int x = 0;
            synchronized (x) {
            }
        */
        Welcomes object1 = new Welcomes();
        Welcomes object2 = new Welcomes();

        SyncBlockCase1Demo syncBlockCase1Demo1 = new SyncBlockCase1Demo(object1, "John");
        SyncBlockCase1Demo syncBlockCase1Demo2 = new SyncBlockCase1Demo(object2, "Alex");
        syncBlockCase1Demo1.start();
        syncBlockCase1Demo2.start();

        SyncBlockCase2Demo syncBlockCase2Demo1 = new SyncBlockCase2Demo(object1, "John");
        SyncBlockCase2Demo syncBlockCase2Demo2 = new SyncBlockCase2Demo(object2, "Alex");
        syncBlockCase2Demo1.start();
        syncBlockCase2Demo2.start();
    }
}

class Welcomes {
    public  void wish(String name) throws InterruptedException {

        for(int i = 0; i < 5; i++){
            System.out.println("Code before Synchronized Block");
            Thread.sleep(1000);
        }

        synchronized(this) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Good morning "+name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Code after Synchronized Block");
            Thread.sleep(1000);
        }
    }

    public  void greet(String name) throws InterruptedException {

        for(int i = 0; i < 5; i++){
            System.out.println("Code before Synchronized Block");
            Thread.sleep(1000);
        }

        synchronized(Welcomes.class) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Good morning "+name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Code after Synchronized Block");
            Thread.sleep(1000);
        }
    }
}

class SyncBlockCase1Demo extends Thread {
    Welcomes w;
    String name;
    SyncBlockCase1Demo(Welcomes w, String name){
        this.w = w;
        this.name = name;
    }
    public void run(){
        try {
            w.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class SyncBlockCase2Demo extends Thread {
    Welcomes w;
    String name;
    SyncBlockCase2Demo(Welcomes w, String name){
        this.w = w;
        this.name = name;
    }
    public void run(){
        try {
            w.greet(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}