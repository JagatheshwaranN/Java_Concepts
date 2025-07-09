package com.v8;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        int[] input = {0, 5, 7, 10, 20, 30, 35, 40, 43, 47, 50};
        Predicate<Integer> p1 = i-> i > 10;
        Predicate<Integer> p2 = i-> i%2==0;
        System.out.println("Numbers greater than 10:");
        check(p1, input);
        System.out.println("Even Numbers:");
        check(p2, input);
        System.out.println("Numbers NOT greater than 10:");
        check(p1.negate(), input);
        System.out.println("Numbers even and greater than 10:");
        check(p1.and(p2), input);
    }

    public static void check(Predicate<Integer> predicate, int[] arr) {
        for(int val : arr) {
            if(predicate.test(val)) {
                System.out.println(val);
            }
        }
    }

    public PredicateDemo() {
        System.out.println("Default Constructor");
    }
}
