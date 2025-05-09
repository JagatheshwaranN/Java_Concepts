package com.abstraction;

public class Test {

    public static void main(String[] args) {

        TouchScreenLaptop hpLaptop = new HPNoteBook();
        hpLaptop.scroll();
        hpLaptop.click();

        TouchScreenLaptop dellLaptop = new DellThinkPad();
        dellLaptop.scroll();
        dellLaptop.click();
    }
}
