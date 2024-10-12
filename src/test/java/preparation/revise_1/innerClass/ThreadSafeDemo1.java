package preparation.revise_1.innerClass;

public class ThreadSafeDemo1 {

    /*
        Make the inner class static:
        ============================
        By making the inner class static, it becomes a static nested class, and since static
        nested classes have only one instance shared across all threads, they are inherently
        thread-safe.
    */
    private static int counter = 0;
    public static void main(String[] args) {

        Inner inner1 = new Inner();
        Inner inner2 = new Inner();

        Thread thread1 = new Thread(()->{
            inner1.incrementCounter();
        });

        Thread thread2 = new Thread(inner2::incrementCounter);

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

    static class Inner {
        public void incrementCounter(){

            synchronized (ThreadSafeDemo1.class){
                counter++;
            }
        }
    }
}
