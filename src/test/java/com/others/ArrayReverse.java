package com.others;

public class ArrayReverse {

        public static void main(String[] args) {
            String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            for(int i = days.length - 1; i >= 0 ; i--) {
                System.out.println(days[i]);
            }
        }
}
