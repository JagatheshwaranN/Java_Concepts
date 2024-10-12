package preparation.revise_1.scf;

public class StaticCtrlFlowWithThreadDemo {

    static int counter = 0;

    static {
        initializeCounter();
    }

    private static synchronized void initializeCounter() {
        counter = 0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter = 100;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            int th = i;
            threads[i] = new Thread(() -> {
                int value = getCounter();
                System.out.println(threads[th].getName() + " ==> " + value);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
