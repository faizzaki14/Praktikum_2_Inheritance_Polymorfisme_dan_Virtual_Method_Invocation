package com.faizzakiramadhan.Modul2.Praktikum.Polymorfisme;

public class DemoOverRiding {
    public static void main(String[] args) {
        X superclass = new X();
        Y subclass  = new Y();

        superclass.getValue("Mati Listrik");
        subclass.getValue("Mati Lampu");
    }
}
