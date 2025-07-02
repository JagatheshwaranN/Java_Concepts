package com.others;

public class ElectricityBillDemo {

    public static void main(String[] args) {

        ElectricityBill eb1 = new ElectricityBill(123, "John", "address1");
        ElectricityBill eb2 = new ElectricityBill(321, "Alex", "address2");
        ElectricityBill eb3 = eb1;
        ElectricityBill eb4 = new ElectricityBill(123, "Erick", "address1");
        System.out.println(eb1);
        System.out.println(eb2.hashCode());
        System.out.println(eb1.equals(eb2));
        System.out.println(eb1.equals(eb3));
        System.out.println(eb1.equals(eb4));
    }
}
