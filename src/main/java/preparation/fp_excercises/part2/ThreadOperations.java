package preparation.fp_excercises.part2;

import java.util.stream.IntStream;

public class ThreadOperations {

    public static void main(String[] args) {
        invokingThread();
        invokingThreadWithoutLoop();
    }

    private static void invokingThread() {

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

    private static void invokingThreadWithoutLoop() {

        Runnable runnable = () -> {
            IntStream.rangeClosed(1, 100).
                    forEach(t -> System.out.println(t + " : " + Thread.currentThread().getName()));
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

}
