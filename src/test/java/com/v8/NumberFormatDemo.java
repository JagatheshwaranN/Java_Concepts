package com.v8;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] ar) {

        long l = 123;
        System.out.println(NumberFormat.getInstance(Locale.US).format(l));
        System.out.println(NumberFormat.getInstance(Locale.UK).format(l));
        double d = 123456.78;
        System.out.println(NumberFormat.getInstance(Locale.US).format(d));
        System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(d));
    }
}
