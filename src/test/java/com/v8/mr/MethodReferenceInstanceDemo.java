package com.v8.mr;

public class MethodReferenceInstanceDemo {

    public void show(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {

//        MyInterface myInterfaceLambda = i -> System.out.println(i);
//        myInterfaceLambda.display(5);

        MethodReferenceInstanceDemo demo = new MethodReferenceInstanceDemo();
        MyInterface myInterface = demo::show;
        myInterface.display(10);
    }
}
