package com.faizzakiramadhan.Modul2.Praktikum.Polymorfisme;

public class Y extends X {
    @Override
    public void getValue(String Value) {
        super.getValue(Value);
        System.out.println("Value Kelas Y : "+ Value);
    }
}
