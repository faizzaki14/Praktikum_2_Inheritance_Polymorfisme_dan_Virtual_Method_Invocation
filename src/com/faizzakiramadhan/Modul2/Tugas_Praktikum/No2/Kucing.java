package com.faizzakiramadhan.Modul2.Tugas_Praktikum.No2;

public class Kucing extends Binatang{
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void meong() {
        System.out.println("Merupakan salah satu binatang yang paling populer dan di kenal dengan Bicaranya 'Meong' ");
    }
}
