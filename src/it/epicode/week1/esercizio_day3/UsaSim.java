package it.epicode.week1.esercizio_day3;

import java.util.Scanner;

public class UsaSim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crea una sim,inserisci un numero di telefono:");

        int number = scanner.nextInt();
        Sim sim1 = new Sim(number);

        System.out.println("Sim creata.");
        System.out.println("ricarica la tua sim, inserisci un importo:");
        int ricarica = scanner.nextInt();
        sim1.setCredit(ricarica);
        System.out.println("ricarica effettuata, credito rediduo di:" + sim1.getCredit());



    }
}
