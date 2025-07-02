package com.others;

public class ElectricityBill {

    private int meterNo;
    private String name;
    private String address;

    public ElectricityBill(int meterNo, String name, String address) {
        this.meterNo = meterNo;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EB[MeterNo=" + this.meterNo + ", Name=" + this.name + ", Address=" + this.address + "]";
    }

    @Override
    public int hashCode() {
        return meterNo;
    }

    @Override
    public boolean equals(Object obj) {
        ElectricityBill eb = (ElectricityBill)obj;
        return eb.meterNo == this.meterNo;
    }
}
