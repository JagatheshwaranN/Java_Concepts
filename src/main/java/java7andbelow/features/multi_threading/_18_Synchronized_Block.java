package java7andbelow.features.multi_threading;

public class _18_Synchronized_Block {

    public static void main(String[] args) {

        /*
            Synchronized Block
            ==================
            If very few lines of the code requires synchronization, then it's not recommended
            to declare the entire method as synchronized. We have to enclose those few lines
            of the code using the synchronized block.

            The main advantage of the synchronized block over synchronized method is, it
            reduces the waiting time of the thread and increases the performance of the
            system.

            We can declare the synchronized block as follows,

            1.	To get the lock of current object
            =====================================
            synchronized (this) {
            }

            2.	To get the lock of particular object b
            ==========================================
            Synchronized (b) {
            }

            3.	To get the class level lock
            ===============================
            synchronized (Display.Class) {
            }
        */
        Welcome welcome = new Welcome();
        SyncBlockDemo syncBlockDemo1 = new SyncBlockDemo(welcome,"John");
        SyncBlockDemo syncBlockDemo2 = new SyncBlockDemo(welcome,"Alex");
        syncBlockDemo1.start();
        syncBlockDemo2.start();
    }
}

class Welcome {
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
}

class SyncBlockDemo extends Thread {
    Welcome w;
    String name;
    SyncBlockDemo(Welcome w, String name){
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