package java7andbelow.features.multi_threading;

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
        */

        JoinCase1Demo joinCase1Demo = new JoinCase1Demo();
        joinCase1Demo.start();
        joinCase1Demo.join();
        for(int i = 0; i < 5; i++){
            System.out.println("Main Thread");
        }
    }
}

class JoinCase1Demo extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Child Thread");
        }
        try{
            Thread.sleep(2000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}