package beforeJava8.features.multi_threading;

public class _13_Thread_Join_Case_Scenarios {
    public static void main(String[] args) throws InterruptedException {

        /*
            Case Scenarios
            ==============
            Case 1: Waiting of Main Thread until completion of Child Thread
            ===============================================================
            If we comment joinCase1Demo.join() line, then both Main and Child threads will
            be executed simultaneously, and we can't expect the exact output. If we are not
            commenting joinCase1Demo.join() line, then main thread calls join method on child
            thread object. Hence, main thread will wait until completion of child thread.

            Case 2: Waiting of Child Thread until completion of Main Thread
            ===============================================================
            In the below example, child thread calls join() method on main thread object.
            Hence, child thread has to wait until completion of main thread.

            Case 3: Child Thread call Join on Main Thread & Main Thread call Join
            =====================================================================
            on Child Thread
            ===============
            If main thread calls join() method on child thread object and child thread
            calls join() method on main thread object, then both the threads will wait
            forever and the program will get stuck/pause(This is something like deadlock).

            Case 4: Main Thread call Join on self
            =====================================
            If a thread calls join() method on the same thread itself, then the program
            will get stuck (This is something like deadlock). In this case, the thread
            has to wait for the infinite amount of time.
        */

        JoinCase1Demo joinCase1Demo = new JoinCase1Demo();
        joinCase1Demo.start();
        joinCase1Demo.join();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread - JoinCase1Demo");
        }
        System.out.println("===================================");
        JoinCase2Demo.thread = Thread.currentThread();
        JoinCase2Demo joinCase2Demo = new JoinCase2Demo();
        joinCase2Demo.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread - JoinCase2Demo");
            Thread.sleep(1000);
        }
        System.out.println("===================================");
        JoinCase3Demo.thread1 = Thread.currentThread();
        JoinCase3Demo joinCase3Demo = new JoinCase3Demo();
        joinCase3Demo.start();
        joinCase3Demo.join();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread - JoinCase3Demo");
            Thread.sleep(1000);
        }
        System.out.println("===================================");
        Thread.currentThread().join();
    }
}

class JoinCase1Demo extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread - JoinCase1Demo");
        }
        try{
            Thread.sleep(2000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

class JoinCase2Demo extends Thread {
    static Thread thread;
    public void run(){
        try{
            thread.join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread - JoinCase2Demo");
        }
    }
}

class JoinCase3Demo extends Thread {
    static Thread thread1;
    public void run(){
        try{
            thread1.join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread - JoinCase3Demo");
        }
    }
}