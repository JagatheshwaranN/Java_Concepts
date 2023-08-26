package java7andbelow.features.multi_threading;

public class _23_DeadLock {
    public static void main(String[] args) {

        /*
            DeadLock
            ========
            If two threads are waiting for each other forever, such type of infinite waiting
            condition is called as DeadLock.

            Use of Synchronized keyword is the only reason for deadlock situation. Hence, while
            using the synchronized keyword we have to take the special care. There is no
            resolution technique for deadlock but several prevention techniques are available.
        */

        /*
            In the below program, if we remove at least one synchronized keyword then only the
            program won't enter into deadlock. Hence, synchronized keyword is the only reason
            for deadlock situation. Due to this, while using the synchronized keyword, we have
            to take the special care.

            The output should be as below,
            Demo1 Thread executes display1 method
            Demo2 Thread executes display2 method
            Demo2 Thread tries to call the Demo1's last method
            Demo1 Thread tries to call the Demo2's last method

            After printing the above statements, the program enters into the Deadlock state.
        */
        DeadLock deadLock = new DeadLock();
        deadLock.method();

        /*
            Deadlock vs Starvation
            ======================
            Long waiting of a thread were the waiting is never ends is called as deadlock
            whereas the long waiting of a thread will end at certain point is called as
            starvation.

            For example,
            Low priority thread has to wait until the completion of all the high priority
            threads it may be long waiting but ends at certain point is called as starvation.
        */
    }
}
class Demo1 {
    public synchronized void display1(Demo2 d2){
        System.out.println("Demo1 Thread executes display1 method");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Demo1 Thread tries to call the Demo2's last method");
        d2.last();
    }

    public synchronized void last(){
        System.out.println("Demo1 Thread - last method");
    }
}
class Demo2 {
    public synchronized void display2(Demo1 d1){
        System.out.println("Demo2 Thread executes display2 method");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Demo2 Thread tries to call the Demo1's last method");
        d1.last();
    }

    public synchronized void last(){
        System.out.println("Demo2 Thread - last method");
    }
}

class DeadLock extends Thread {
    Demo1 demo1 = new Demo1();
    Demo2 demo2 = new Demo2();
    public void method(){
        this.start();
        demo1.display1(demo2);
    }
    public void run(){
        demo2.display2(demo1);
    }
}