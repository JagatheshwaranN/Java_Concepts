package com.abstraction;

public abstract class Dell implements TouchScreenLaptop {
    @Override
    public void scroll() {
        System.out.println("Dell Scroll");
    }
}
