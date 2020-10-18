package com.faizzakiramadhan.Modul2.Tugas_Praktikum.No2;

public class Burung extends Binatang {
    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void terbang() {
        System.out.println("Binatang ini memiliki ciri khas bisa terbang di udara");
    }
}
