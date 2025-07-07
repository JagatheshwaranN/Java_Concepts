package com.v8.mr;

public class ConstructorMethodReferenceDemo {

    public static void main(String[] args) {

        MyConsInterface myConsInterface = MyClassDemo::new;
        myConsInterface.get("Hey! there?");
    }
}
