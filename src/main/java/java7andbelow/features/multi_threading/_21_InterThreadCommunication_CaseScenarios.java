package java7andbelow.features.multi_threading;

public class _21_InterThreadCommunication_CaseScenarios {

    public static void main(String[] args) throws InterruptedException {

        /*
            Case Scenarios
            ==============
            Case 1: Main Thread got Chance First
            ====================================
        */

        Case1Thread case1Thread = new Case1Thread();
        case1Thread.start();
        synchronized (case1Thread) {
            System.out.println("Main Thread calls wait method");
            case1Thread.wait();
            System.out.println("Main Thread got the notification");
            System.out.println(case1Thread.total);
        }
    }
}

class Case1Thread extends Thread {

    int total = 0;
    public void run() {
        synchronized (this){
            System.out.println("Child Thread starts calculation");

            for(int i = 0; i < 10; i++){
                total = total + 1;
            }
            System.out.println("Child Thread gives notification");
            this.notify();
        }
    }
}