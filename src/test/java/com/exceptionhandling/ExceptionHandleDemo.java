package com.exceptionhandling;

public class ExceptionHandleDemo {


    public static void main(String[] args) throws InterruptedException {

        ExceptionHandleDemo exceptionHandleDemo = new ExceptionHandleDemo();
        exceptionHandleDemo.exceptionHandleType1();
        exceptionHandleDemo.exceptionHandleType2();
        exceptionHandleDemo.exceptionHandleUsingRuntime();
    }

    public void exceptionHandleType1() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void exceptionHandleType2() {
        Thread currentThread = Thread.currentThread();
        currentThread.interrupt();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void exceptionHandleUsingRuntime() {
        Thread currentThread = Thread.currentThread();
        currentThread.interrupt();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new MyThreadException("Thread Exception");
        }
    }

    static class MyThreadException extends RuntimeException {

        MyThreadException(String message) {
            super(message);
        }
    }

 }
