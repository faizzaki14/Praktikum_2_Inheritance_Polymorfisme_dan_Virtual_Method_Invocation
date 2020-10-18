package com.faizzakiramadhan.Modul2.Tugas_Praktikum.No1;

public class DemoClub {
    public static void main(String[] args) {


        Club Football = new Club();
        Club mu = new Club("Mancester United");
        Club juve = new Club("Juventus", "Pemegang Julukan La Fidanzata d’Italia.");
        Club realma = new Club("Real Madrid", 1902, "Pemegang Juara terbanyak");
        Club FCB = new Club("FC Barcelona", 1899, "Camp Nou", 5, "the Més que un club");

        Football.getTeam();
        System.out.println();

        mu.getTeam();
        System.out.println();

        juve.getTeam();
        System.out.println();

        realma.getTeam();
        System.out.println();

        FCB.getTeam();
        System.out.println();

    }
}
