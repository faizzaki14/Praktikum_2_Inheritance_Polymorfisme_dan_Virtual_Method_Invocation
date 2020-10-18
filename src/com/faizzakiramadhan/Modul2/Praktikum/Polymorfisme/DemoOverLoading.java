package com.faizzakiramadhan.Modul2.Praktikum.Polymorfisme;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Koe no Katachi");
        Lagu lagu2 = new Lagu("Halu","Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
