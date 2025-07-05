package com.others;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBSearch {

    public static void main(String[] args) {

        String[] input = {"A", "C", "E", "B", "D"};
        int index = Arrays.binarySearch(input, "E");
        System.out.println(index);
    }
}
