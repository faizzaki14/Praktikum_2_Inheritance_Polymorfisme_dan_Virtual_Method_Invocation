package com.faizzakiramadhan.Modul2.Tugas_Praktikum.No2;

public class Ikan extends Binatang {
    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void berenang() {
        System.out.println("Binatang ini memiliki ciri khas Hidup di air dan melakukan pergerakan yaitu Berenang");
    }
}
