package com.abstraction;

public abstract class HP implements TouchScreenLaptop {
    @Override
    public void scroll() {
        System.out.println("HP Scroll");
    }
}
