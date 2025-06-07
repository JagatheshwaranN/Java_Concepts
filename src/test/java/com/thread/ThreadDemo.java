package com.thread;

public class ThreadDemo {

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread thread = new Thread(oddThread);
        thread.start();
        evenThread.start();
    }
}
