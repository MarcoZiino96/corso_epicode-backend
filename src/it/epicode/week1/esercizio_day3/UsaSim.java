package it.epicode.week1.esercizio_day3;

import java.util.Scanner;

public class UsaSim {

    public static void main(String[] args) {
        Sim sim = new Sim(23987123);

        sim.setCredit(15);

        System.out.println(sim.telefonata(30, 555444555));
        System.out.println(sim.telefonata( 60, 87934534));
        System.out.println(sim.telefonata(30,873232322 ));
        sim.stampaDatiSim();

        System.out.println(sim.telefonata(30,87934534 ));
        System.out.println(sim.telefonata(10,87934534 ));
        System.out.println(sim.telefonata(10,87934534 ));
        System.out.println(sim.telefonata(20,45879856 ));
        System.out.println(sim.telefonata(20,878657654 ));
        System.out.println(sim.telefonata(20,878657653 ));

        sim.stampaDatiSim();


    }
}
