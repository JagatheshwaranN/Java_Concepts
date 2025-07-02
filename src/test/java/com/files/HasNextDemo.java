package com.files;

import java.util.Scanner;

public class HasNextDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to calculate");
        int sum = 0;
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println(STR."Sum of the numbers are : \{sum}");
    }
}
