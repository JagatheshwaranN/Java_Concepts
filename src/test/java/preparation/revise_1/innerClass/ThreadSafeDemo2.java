package preparation.revise_1.innerClass;

public class ThreadSafeDemo2 {

    /*
        Synchronize access to shared resources:
        =======================================
        If the inner class needs to access shared resources of the outer class, synchronize
        methods within the inner class to ensure thread safety.
    */

    private static int counter = 0;
    public static void main(String[] args) {

       ThreadSafeDemo2 demo2 = new ThreadSafeDemo2();
        Inner inner = demo2.new Inner();

        Thread thread1 = new Thread(inner::incrementCounter);

        Thread thread2 = new Thread(inner::incrementCounter);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }

    class Inner {
        public synchronized  void incrementCounter(){
                counter++;
        }
    }
}
