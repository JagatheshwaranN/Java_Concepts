package com.encapsulation;

public class Test {

    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("John");
        patient.setSsn("SSN123");
        System.out.println(patient.getId());
        System.out.println(patient.getName());
        System.out.println(patient.getSsn());
    }
}
