package preparation.revise_1.mor;

public class Demo13 {

    public static void main(String[] ar) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        MyThread thread1 = new MyThread(sharedResource);
        MyThread thread2 = new MyThread(sharedResource);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Shared Value : " + sharedResource.getSharedValue());
    }

    static class SharedResource {

        private int sharedValue = 0;

        public synchronized void increment() {
            sharedValue++;
        }

        public int getSharedValue() {
            return sharedValue;
        }
    }

    static class MyThread extends Thread {
        SharedResource sharedResource;

        MyThread(SharedResource sharedResource) {
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                sharedResource.increment();
            }
        }
    }
}
