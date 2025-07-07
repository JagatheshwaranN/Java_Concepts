package com.v8.mr;

public class MethodReferenceDemo {

    public static void myMethod() {
        for(int i=0; i<5; i++) {
            System.out.printf("Child Thread : %s ",Thread.currentThread().getName());
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Runnable runnable = MethodReferenceDemo::myMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=0; i<5; i++) {
            System.out.printf("Parent Thread : %s ",Thread.currentThread().getName());
            System.out.println();
        }
    }
}
