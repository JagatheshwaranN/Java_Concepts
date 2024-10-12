package preparation.revise_2.threads;

@SuppressWarnings("All")
public class ThreadSynchronizationDemo {

    public static void main(String[] args) {
        Display display = new Display();
        OwnThread thread1 = new OwnThread(display, "John");
        OwnThread thread2 = new OwnThread(display, "Alex");
        thread1.start();
        thread2.start();
        SyncBlockDisplay syncBlockDisplay = new SyncBlockDisplay();
        CustThread thread11 = new CustThread(syncBlockDisplay, "Erick");
        CustThread thread12 = new CustThread(syncBlockDisplay, "Jenni");
        thread11.start();
        thread12.start();
    }

}

class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Good Morning ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(name);
            System.out.println();
        }
    }
}

@SuppressWarnings("All")
class SyncBlockDisplay {
    public void greet(String name) {
        for(int i = 0; i < 3; i++) {
            System.out.println("Code execution before sync block");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Good Morning "+ name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("Code execution after sync block");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class OwnThread extends Thread {
    Display display;
    String name;

    OwnThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}

class CustThread extends Thread {
    SyncBlockDisplay display;
    String name;

    CustThread(SyncBlockDisplay display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.greet(name);
    }
}
