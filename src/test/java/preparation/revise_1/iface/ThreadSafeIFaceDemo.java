package preparation.revise_1.iface;

public class ThreadSafeIFaceDemo {

    public static void main(String[] args) {
        Counter counter = new MyCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            ;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The final value : " + counter.getValue());
    }

    public interface Counter {

        void increment();

        int getValue();
    }

    public static class MyCounter implements Counter {

        private int value = 0;

        @Override
        public synchronized void increment() {
            value++;
        }

        @Override
        public synchronized int getValue() {
            return value;
        }
    }


}
